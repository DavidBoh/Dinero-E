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
            contraseñas();
        }
    }

    private void limiteCaracteres(vistarestablecimiento vt) {
        limitadores.add(new limitadorCaracteres(vt.cedula, 10, 2));
        limitadores.add(new limitadorCaracteres(vt.email, 50, 3));
        limitadores.add(new limitadorCaracteres(vt.ingresacodigo, 4, 2));
        limitadores.add(new limitadorCaracteres(vt.nuevacontra, 15, 4));
        limitadores.add(new limitadorCaracteres(vt.verificaContra, 15, 4));
    }

    private void comprobacionUsuarioCorreo() {
         if (!v.cedula.getText().isEmpty()
                && !v.email.getText().isEmpty()
                && limitadores.get(1).comprobarCorreo()) {
            baseDatos.conectar();
            try {
                int identificacion = Integer.parseInt(v.cedula.getText());
                String correoV = v.email.getText();
                if (!baseDatos.confirmarU(identificacion)
                        && !baseDatos.confirmarCorreo(correoV)) {
                    identificador = identificacion;
                    correo = correoV;                    
                    activarIngresaCodigo();
                    guardarcodigo = generarCodigo();
                    enviarMail();
                    JOptionPane.showMessageDialog(null, "Se envió código de verificación");
                } else {
                    JOptionPane.showMessageDialog(null, "No se envió código de verificación");
                    v.dispose();
                    vistarestablecimiento restab = new vistarestablecimiento();
                    controlrestablecimiento controlre = new controlrestablecimiento(restab,baseDatos);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de Comprobación");
                v.dispose();
                vistarestablecimiento restab = new vistarestablecimiento();
                controlrestablecimiento controlre = new controlrestablecimiento(restab,baseDatos);
            }
            if (baseDatos.getConnect() != null) {
                baseDatos.cerrar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error de Comprobación");
        }
    }
    
     private void contraseñas() {
        try {
            if (v.verificaContra.getPassword().length > 0
                    && v.nuevacontra.getPassword().length > 0) {
                if (v.verificaContra.getPassword().length > 4
                        && v.nuevacontra.getPassword().length > 4) {
                    char[] ar = v.nuevacontra.getPassword();
                    StringBuilder builder = new StringBuilder();
                    for (char s : ar) {
                        builder.append(s);
                    }
                    char[] ar2 = v.verificaContra.getPassword();
                    StringBuilder builder2 = new StringBuilder();
                    for (char s : ar2) {
                        builder2.append(s);
                    }
                    String contrasena = builder.toString();
                    String vContrasena = builder2.toString();
                    if (vContrasena.equals(contrasena)) {
                        String clave = seguridad.get_SHA_256_SecurePassword(contrasena);
                        baseDatos.conectar();
                        int usuario = baseDatos.identificadorCorreo(identificador, correo);
                        if (baseDatos.actualizarContrasena(usuario, clave)) {
                            JOptionPane.showMessageDialog(null, "Contraseña Actualizada");
                            v.dispose();
                            VistaLogin v1 = new VistaLogin();
                            ModeloBD m1 = new ModeloBD();
                            ControlLogin c1 = new ControlLogin(m1, v1);
                        }
                        if (baseDatos.getConnect() != null) {
                            baseDatos.cerrar();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Las Contraseñas No Concuerdan");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Clave debe ser mayor a 4 caracteres");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Existe un campo vacio");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error comparando contraseñas");
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
        try {
            if (!v.ingresacodigo.getText().isEmpty()) {
                if (Integer.parseInt(v.ingresacodigo.getText()) == Integer.parseInt(guardarcodigo)) {
                    activarRecuperaContra();
                } else {
                    JOptionPane.showMessageDialog(null, "Código Incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese su Código");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Comprobación de Token");
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
        v.verificaContra.setVisible(true);
        v.aceptarNuevaContra.setVisible(true);
    }

}