/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import Modelo.limitadorCaracteres;
import Modelo.ModeloBD;
import Hash.Sha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import loginapp.ControlLogin;
import loginapp.VistaLogin;

/**
 *
 * @author Christian
 */
public class ControlRegistro implements ActionListener {

    private VentanaRegistro ventanaR;
    private ModeloBD bdRegistro;
    private Sha seguridad = new Sha();
    private ArrayList<limitadorCaracteres> limitadores = new ArrayList<limitadorCaracteres>();

    public ControlRegistro(VentanaRegistro vr, ModeloBD bd) {
        this.ventanaR = vr;
        this.bdRegistro = bd;

        ventanaR.botonRegistrar.addActionListener(this);
        ventanaR.botonCerrar.addActionListener(this);

        ventanaR.regresarx.addActionListener(this);

        limiteCaracteres(ventanaR);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == ventanaR.regresarx) {
            ventanaR.dispose();

            VistaLogin v1 = new VistaLogin();
            ModeloBD m1 = new ModeloBD();
            ControlLogin c1 = new ControlLogin(m1, v1);

        }

        if (ae.getSource() == ventanaR.botonRegistrar) {
            bdRegistro.conectar();
            if (bdRegistro.getConnect() != null) {
                ingresarUsuario(ventanaR, bdRegistro);
                
                bdRegistro.cerrar();
            }
        }
        if (ae.getSource() == ventanaR.botonCerrar) {
            System.exit(0);
        }
    }

    /**
     * Creación de los limitantes para cada campo de texto
     */
    private void limiteCaracteres(VentanaRegistro vt) {
        limitadores.add(new limitadorCaracteres(vt.tNombre, 30, 1));
        limitadores.add(new limitadorCaracteres(vt.tApellido, 30, 1));
        limitadores.add(new limitadorCaracteres(vt.tIdentificacion, 10, 2));
        limitadores.add(new limitadorCaracteres(vt.tCorreo, 50, 3));
        limitadores.add(new limitadorCaracteres(vt.pContra, 15, 4));
    }

    private void ingresarUsuario(VentanaRegistro ventana, ModeloBD datos) {

        if (!ventana.tNombre.getText().isEmpty()
                && !ventana.tApellido.getText().isEmpty()
                && !ventana.tIdentificacion.getText().isEmpty()
                && !ventana.tCorreo.getText().isEmpty()
                && ventana.pContra.getPassword().length > 0) {
            try {
                int identificacion = Integer.parseInt(ventana.tIdentificacion.getText());
                String correo = ventana.tCorreo.getText();
                if (limitadores.get(3).comprobarCorreo()) {//Comprobación de expresiones regulares del correo
                    if (datos.confirmarU(identificacion)
                            && datos.confirmarCorreo(correo)) {
                        char[] ar = ventana.pContra.getPassword();
                        StringBuilder builder = new StringBuilder();
                        for (char s : ar) {
                            builder.append(s);
                        }
                        String str = builder.toString();
                        if (str.length() > 4) {
                            String clave = seguridad.get_SHA_256_SecurePassword(str);
                            datos.guardaDatos(
                                    ventana.JCombotipoIdentificacion.getSelectedIndex() + 1,
                                    ventana.tNombre.getText().toLowerCase(),
                                    ventana.tApellido.getText().toLowerCase(),
                                    identificacion,
                                    ventana.tCorreo.getText().toLowerCase(),
                                    clave);
                            ventana.tNombre.setText("");
                            ventana.tApellido.setText("");
                            ventana.tIdentificacion.setText("");
                            ventana.JCombotipoIdentificacion.setSelectedIndex(0);
                            ventana.tCorreo.setText("");
                            ventana.pContra.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "Clave debe ser mayor a 4 caracteres");
                        }
                    } else {
                        if (datos.confirmarU(identificacion) == false) {
                            JOptionPane.showMessageDialog(null, "Usuario ya Existe");
                            ventana.tIdentificacion.setText("");
                        }
                        if (datos.confirmarCorreo(correo) == false) {
                            JOptionPane.showMessageDialog(null, "Correo ya Existe");
                            ventana.tCorreo.setText("");
                        }
                    }//Fin Comprobacion campo identificacion
                } else {
                    JOptionPane.showMessageDialog(null, "Correo Inválido");
                }//Fin Comprobación de expresion regular del correo
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "El campo identificación debe llevar sólo números");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de Almacenamiento");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Datos");
        }
    }
}
