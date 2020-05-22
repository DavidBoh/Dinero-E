/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Event;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.text.JTextComponent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputMap;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;

/**
 *
 * @author Christian
 */
public class limitadorCaracteres implements KeyListener {

   
    private final JTextComponent componente;
    private final int limite;
    private final int restringeCaracter;

    public limitadorCaracteres(JTextComponent componente, int limite, int restringeCaracter) {
        this.componente = componente;
        this.limite = limite;
        this.restringeCaracter = restringeCaracter;
        this.componente.addKeyListener(this);
        evitarPegar(this.componente);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        limitarCampo(e);
        switch (restringeCaracter) {
            case 1:
                restringeCaracteres(e);
                break;
            case 2:
                soloNumerico(e);
                break;
            case 3:
                caracteresCorreo(e);
                break;
            case 4:
                caracteresContrasena(e);
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    /**
     * Limita la cantidad de caracteres que se pueden colcoar en el campo de
     * texto
     *
     * @param e
     */
    private void limitarCampo(KeyEvent e) {
        if (componente.getText().length() == limite) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Limite Alcanzado");
        }
    }
   
    /**
     * Limita los caracteres que se pueden ingresar en el campo de texto a
     * partir de la tabla ascii, en este caso sólo se pueden ingresar caracteres
     * a-z y A-Z
     *
     * @param e Evento de pulsación
     */
    private void restringeCaracteres(KeyEvent e) {
        if (e.getKeyChar() >= 32 && e.getKeyChar() <= 64
                || e.getKeyChar() >= 91 && e.getKeyChar() <= 96
                || e.getKeyChar() >= 123 && e.getKeyChar() <= 208
                || e.getKeyChar() >= 210 && e.getKeyChar() <= 240
                || e.getKeyChar() >= 242 && e.getKeyChar() <= 255) {
            e.consume();
            JOptionPane.showMessageDialog(null, "No se permiten caracteres especiales o números");
        }
    }

    /**
     * Limita los caracteres que se pueden ingresar en el campo de texto a
     * partir de la tabla ascii, en este caso sólo se pueden ingresar caracteres
     * numéricos de 0 a 9
     *
     * @param e Evento de pulsación
     */
    private void soloNumerico(KeyEvent e) {
        if (e.getKeyChar() >= 32 && e.getKeyChar() <= 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 255) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }

    /**
     * Limita los caracteres que se pueden ingresar en el campo de texto a
     * partir de la tabla ascii y permite los caracteres especiales acordes en
     * el uso de correos electrónicos
     *
     * @param e Evento de pulsación
     */
    private void caracteresCorreo(KeyEvent e) {
        if (e.getKeyChar() >= 32 && e.getKeyChar() <= 44
                || e.getKeyChar() == 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 63
                || e.getKeyChar() >= 91 && e.getKeyChar() <= 94
                || e.getKeyChar() == 96
                || e.getKeyChar() >= 123 && e.getKeyChar() <= 255) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Caracter Inválido");
        }
    }

    /**
     * Limita los caracteres que se pueden ingresar en el campo de texto a
     * partir de la tabla ascii y permite los caracteres especiales acordes en
     * el uso de correos electrónicos
     *
     * @param e Evento de pulsación
     */
    private void caracteresContrasena(KeyEvent e) {
        if (e.getKeyChar() >= 32 && e.getKeyChar() <= 44
                || e.getKeyChar() == 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 63
                || e.getKeyChar() >= 91 && e.getKeyChar() <= 94
                || e.getKeyChar() == 96
                || e.getKeyChar() >= 123 && e.getKeyChar() <= 255) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Caracter Inválido");

        }
    }

    public boolean comprobarCorreo() {
        boolean bandera = true;
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "(gmail)+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})");
        Matcher mather = pattern.matcher(componente.getText());
        if (mather.find() != true) {            
            bandera = false;
        }
        return bandera;
    }

    /**
     * Evita la combinación de teclas CTRL+C, CTRL+V y SHIFT+INSERT con el ánimo
     * de evitar copiar o pegar en los campos de texto
     *
     * @param campo Componente de Texto
     */
    private static void evitarPegar(JTextComponent campo) {
        InputMap map = campo.getInputMap(JTextComponent.WHEN_FOCUSED);
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK), "null");
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_INSERT, Event.SHIFT_MASK), "null");
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK), "null");
        map.put(KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK), "null");
    }
}