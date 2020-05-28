/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import Modelo.limitadorCaracteres;
import Modelo.ModeloBD;
import Hash.Sha;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import loginapp.ControlLogin;
import loginapp.VistaLogin;

/**
 *
 * @author Christian
 */
public class ControlRegistro implements ActionListener {

    private final VentanaRegistro ventanaR;
    private final ModeloBD bdRegistro;
    private final Sha seguridad = new Sha();
    private final ArrayList<limitadorCaracteres> limitadores = new ArrayList<limitadorCaracteres>();
    private final char echoPass;
    private boolean banderaPass;

    public ControlRegistro(VentanaRegistro vr, ModeloBD bd) {
        this.ventanaR = vr;
        this.bdRegistro = bd;
        this.echoPass = ventanaR.getPass().getEchoChar();
        banderaPass = true;

        ventanaR.botonRegistrar.addActionListener(this);
        ventanaR.botonCerrar.addActionListener(this);
        ventanaR.verContraseña.addActionListener(this);
        ventanaR.regresarx.addActionListener(this);

        limiteCaracteres(ventanaR);
        barraInferior();
        condicionesDatos();

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
            try {
                if (ventanaR.politicasDatos.isSelected()) {
                    bdRegistro.conectar();
                    if (bdRegistro.getConnect() != null) {
                        ingresarUsuario(ventanaR, bdRegistro);
                        bdRegistro.cerrar();
                    }
                    ventanaR.tNombre.setText("");
                    ventanaR.tApellido.setText("");
                    ventanaR.tIdentificacion.setText("");
                    ventanaR.JCombotipoIdentificacion.setSelectedIndex(0);
                    ventanaR.tCorreo.setText("");
                    ventanaR.getPass().setText("");
                    ventanaR.politicasDatos.setSelected(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe estar de acuerdo con los terminos y condiciones");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error para Registrar");
            }
        }

        if (ae.getSource() == ventanaR.verContraseña) {
            if (banderaPass) {
                ventanaR.getPass().setEchoChar((char) 0);
                banderaPass = false;
            } else {
                ventanaR.getPass().setEchoChar(echoPass);
                banderaPass = true;
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
        limitadores.add(new limitadorCaracteres(vt.getPass(), 15, 4));
    }

    private void condicionesDatos() {

        ventanaR.politica.addMouseListener(new MouseAdapter() {
            Color colorFuente = ventanaR.politica.getForeground();

            @Override
            public void mouseClicked(MouseEvent e) {
                VistaTerminos terminos = new VistaTerminos();
                ControlTerminos terminosControl = new ControlTerminos(terminos);
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
                ventanaR.politica.setForeground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ventanaR.politica.setForeground(colorFuente);
            }
        });
    }

    private void ingresarUsuario(VentanaRegistro ventana, ModeloBD datos) {

        if (!ventana.tNombre.getText().isEmpty()
                && !ventana.tApellido.getText().isEmpty()
                && !ventana.tIdentificacion.getText().isEmpty()
                //&& Integer.parseInt(ventana.tIdentificacion.getText()) <= 5
                && !ventana.tCorreo.getText().isEmpty()
                && ventana.getPass().getPassword().length > 0) {
            try {
                int identificacion = Integer.parseInt(ventana.tIdentificacion.getText());
                String correo = ventana.tCorreo.getText();
                if (limitadores.get(3).comprobarCorreo()) {//Comprobación de expresiones regulares del correo
                    if (datos.confirmarU(identificacion)
                            && datos.confirmarCorreo(correo)) {
                        char[] ar = ventana.getPass().getPassword();
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
                            ventana.getPass().setText("");
                            ventanaR.dispose();
                            JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
                            VistaLogin v1= new VistaLogin();
                            ModeloBD m1= new ModeloBD();
                            ControlLogin c1= new ControlLogin(m1,v1);
                           
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
            JOptionPane.showMessageDialog(null, "Ingrese Datos válidos");
        }
    }

    private void barraInferior() {
        ventanaR.getPass().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                if (de.getDocument().getLength() == 0) {
                    ventanaR.barra.setIcon(null);
                } else if (de.getDocument().getLength() > 0 && de.getDocument().getLength() < 5) {
                    ventanaR.barra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/barra_roja.png")));
                } else if (de.getDocument().getLength() >= 5 && de.getDocument().getLength() < 10) {
                    ventanaR.barra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/barra_amarilla.png")));
                } else {
                    ventanaR.barra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/barra_verde.png")));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                if (de.getDocument().getLength() == 0) {
                    ventanaR.barra.setIcon(null);
                } else if (de.getDocument().getLength() > 0 && de.getDocument().getLength() < 5) {
                    ventanaR.barra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/barra_roja.png")));
                } else if (de.getDocument().getLength() >= 5 && de.getDocument().getLength() < 10) {
                    ventanaR.barra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/barra_amarilla.png")));
                } else {
                    ventanaR.barra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/barra_verde.png")));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            }
        });
    }

}