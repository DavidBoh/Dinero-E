/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import text.TextPrompt;

/**
 *
 * @author Christian
 */
public class VentanaRegistro extends JFrame {

    private String tipoIdentificacion[] = {"CC", "CE", "PA","RC","TI"};
    private JLabel fondo;
    public JTextField tNombre, tApellido, tIdentificacion, tCorreo;
    private TextPrompt nombre, apellido, identificacion, correo, contraseña;    
    public JPasswordField pContra;
    private Color colorFuente, tFondo;
    public JButton botonRegistrar, botonCerrar;    
    public JComboBox JCombotipoIdentificacion;

    public JButton regresarx;
    
    public VentanaRegistro() {

        setSize(310, 546);
        setUndecorated(true);
        iniciar();
        localizar();
        agregar();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(3);
    }

    private void iniciar() {

        colorFuente = new Color(255, 255, 255);
        tFondo = new Color(0, 123, 164);

        fondo = new JLabel();
        fondo.setOpaque(true);
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/RegistrarUsuario.jpeg")));
        fondo.setBackground(new Color(72, 181, 232));

        tNombre = new JTextField();
        tNombre.setBackground(tFondo);
        tNombre.setOpaque(false);
        tNombre.setBorder(null);
        tNombre.setForeground(colorFuente);
        nombre = new TextPrompt("Primer Nombre", tNombre);

        tApellido = new JTextField();
        tApellido.setBackground(tFondo);
        tApellido.setOpaque(false);
        tApellido.setBorder(null);
        tApellido.setForeground(colorFuente);
        apellido = new TextPrompt("Apellido", tApellido);

        tIdentificacion = new JTextField();
        tIdentificacion.setBackground(tFondo);
        tIdentificacion.setOpaque(false);
        tIdentificacion.setBorder(null);
        tIdentificacion.setForeground(colorFuente);
        identificacion = new TextPrompt("Identificación", tIdentificacion);        

        tCorreo = new JTextField();
        tCorreo.setBackground(tFondo);
        tCorreo.setOpaque(false);
        tCorreo.setBorder(null);
        tCorreo.setForeground(colorFuente);
        correo = new TextPrompt("Correo Electrónico", tCorreo);

        pContra = new JPasswordField();
        pContra.setBackground(tFondo);
        pContra.setOpaque(false);
        pContra.setBorder(null);
        tCorreo.setForeground(colorFuente);
        contraseña = new TextPrompt("Contraseña", pContra);        
        
        JCombotipoIdentificacion = new JComboBox(tipoIdentificacion);          
        JCombotipoIdentificacion.setBackground(tFondo);
        JCombotipoIdentificacion.setBorder(null);
        JCombotipoIdentificacion.setForeground(colorFuente);
        
        botonRegistrar = new JButton(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        botonRegistrar.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_g.png")));       
        botonRegistrar.setContentAreaFilled(false);
        botonRegistrar.setBorder(null);
        botonRegistrar.setCursor(new Cursor(HAND_CURSOR));

        botonCerrar = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cerrar.png")));
        botonCerrar.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar_g.png")));
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.setBorder(null);
        botonCerrar.setCursor(new Cursor(HAND_CURSOR));
        
        regresarx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/goback.png")));
        regresarx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/goback_g.png")));
        regresarx.setContentAreaFilled(false);
        regresarx.setBorder(null);
        regresarx.setCursor(new Cursor(HAND_CURSOR));
    }

    private void localizar(){
        setLayout(null);

        fondo.setBounds(0, 0, 310, 546);

        tNombre.setBounds(65, 228, 180, 30);
        tApellido.setBounds(65, 276, 180, 30);        
        tCorreo.setBounds(65, 372, 180, 30);
        pContra.setBounds(65, 420, 180, 30);
        
        tIdentificacion.setBounds(120, 324, 125, 30);
        JCombotipoIdentificacion.setBounds(65,324,46,30);
        
        regresarx.setBounds(20,20,47,47);

        botonRegistrar.setBounds(129, 465, 47, 47);
        botonCerrar.setBounds(270, 5, 25, 25);
    }

    private void agregar() {

        add(tNombre);
        add(tApellido);
        add(tCorreo);
        
        add(JCombotipoIdentificacion);
        add(tIdentificacion);
        add(regresarx);
        add(pContra);

        add(botonRegistrar);
        add(botonCerrar);

        add(fondo);

    }

    public JTextField gettNombre() {
        return tNombre;
    }
}