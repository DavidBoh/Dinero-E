/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restablecimiento;

import Modelo.ModeloBD;
import Modelo.limitadorCaracteres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import loginapp.ControlLogin;
import loginapp.VistaLogin;

/**
 *
 * @author herrboh
 */
public class controlrestablecimiento implements ActionListener {

    private vistarestablecimiento v;
    private ModeloBD baseDatos;
    private final ArrayList<limitadorCaracteres> limitadores = new ArrayList<limitadorCaracteres>();

    public controlrestablecimiento(vistarestablecimiento vis, ModeloBD baseDatos) {
        this.v = vis;
        this.baseDatos = baseDatos;
        v.cerrarventanax.addActionListener(this);
        v.regresarx.addActionListener(this);
        v.aceptar.addActionListener(this);
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
                    JOptionPane.showMessageDialog(null, "Se envió código de verificación");
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

}