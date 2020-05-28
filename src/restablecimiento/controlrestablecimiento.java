/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restablecimiento;

import Hash.Sha;
import Modelo.ModeloBD;
import Modelo.limitadorCaracteres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import loginapp.ControlLogin;
import loginapp.VistaLogin;
import Modelo.EmailVerification;

/**
 *
 * @author herrboh
 */
public class controlrestablecimiento implements ActionListener {

    private vistarestablecimiento v;
    private ModeloBD baseDatos;
    private final ArrayList<limitadorCaracteres> limitadores = new ArrayList<limitadorCaracteres>();
    private final Sha seguridad = new Sha();
    private String guardarcodigo;
    private String correo;
    private int identificador;

    public controlrestablecimiento(vistarestablecimiento vis, ModeloBD baseDatos) {
        this.v = vis;
        this.baseDatos = baseDatos;
        v.cerrarventanax.addActionListener(this);
        v.regresarx.addActionListener(this);
        v.aceptar.addActionListener(this);
        v.aceptarIngresaCodigo.addActionListener(this);
        v.aceptarNuevaContra.addActionListener(this);
        limiteCaracteres(v);
        v.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == v.cerrarventanax) {
            System.exit(0);
        }

        if (e.getSource() == v.regresarx) {
            v.dispose();
            VistaLogin v1 = new VistaLogin();
            ModeloBD m1 = new ModeloBD();
            ControlLogin c1 = new ControlLogin(m1, v1);
        }

        if (e.getSource() == v.aceptar) {
            comprobacionUsuarioCorreo();
        }
        
        if (e.getSource() == v.aceptarIngresaCodigo) {
            comparaCodigo();
        }
        
        if (e.getSource() == v.aceptarNuevaContra) {
            
        }
    }

    private void limiteCaracteres(vistarestablecimiento vt) {
        limitadores.add(new limitadorCaracteres(vt.cedula, 10, 2));
        limitadores.add(new limitadorCaracteres(vt.email, 50, 3));
    }

    private void comprobacionUsuarioCorreo() {
        if (!v.cedula.getText().isEmpty()
                && !v.email.getText().isEmpty()
                && limitadores.get(1).comprobarCorreo()) {
            baseDatos.conectar();
            try {
                int identificacion = Integer.parseInt(v.cedula.getText());
                String correo = v.email.getText();
                if (!baseDatos.confirmarU(identificacion)
                        && !baseDatos.confirmarCorreo(correo)) {
                    activarIngresaCodigo();
                    JOptionPane.showMessageDialog(null, "Se envió código de verificación");
                    guardarcodigo = generarCodigo();
                    enviarMail();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se envió código de verificación");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de Comprobación");
            }
            if (baseDatos.getConnect() != null) {
                
                baseDatos.cerrar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error de Comprobación");
        }
    }
    
    private void enviarMail() throws Exception{
        EmailVerification.sendMail(v.email.getText(), guardarcodigo);
    }
    
    public String generarCodigo(){
        Random rand = new Random();
        
        return String.format("%04d", rand.nextInt(10000)); 
    }
    
    private void comparaCodigo(){
        if(Integer.parseInt(v.ingresacodigo.getText()) == Integer.parseInt(guardarcodigo)){
            activarRecuperaContra();
        }
    }
    
    private void activarIngresaCodigo(){
        
        v.fondo.setVisible(false);
        v.aceptar.setVisible(false);
        v.email.setVisible(false);
        v.cedula.setVisible(false);
        
        v.fondoNuevaContra.setVisible(false);
        v.nuevacontra.setVisible(false);
        v.aceptarNuevaContra.setVisible(false);
        
        v.fondoIngresaCodigo.setVisible(true);
        v.ingresacodigo.setVisible(true);
        v.aceptarIngresaCodigo.setVisible(true);
        
    }
    
    private void activarRecuperaContra(){
        
        v.fondo.setVisible(false);
        v.aceptar.setVisible(false);
        v.email.setVisible(false);
        v.cedula.setVisible(false);
        
        v.fondoIngresaCodigo.setVisible(false);
        v.ingresacodigo.setVisible(false);
        v.aceptarIngresaCodigo.setVisible(false);
        
        v.fondoNuevaContra.setVisible(true);
        v.nuevacontra.setVisible(true);
        v.aceptarNuevaContra.setVisible(true);
    }

}