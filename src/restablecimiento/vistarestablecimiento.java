/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restablecimiento;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import text.TextPrompt;

/**
 *
 * @author herrboh
 */
public class vistarestablecimiento extends JFrame {
    
    public JButton cerrarventanax;
    public JButton regresarx;
    public JButton aceptar, aceptarIngresaCodigo, aceptarNuevaContra;
    
    public JLabel fondo, fondoIngresaCodigo, fondoNuevaContra; 
    
    public JTextField cedula, email, ingresacodigo;
    
    public JPasswordField nuevacontra, verificaContra;
    
    private TextPrompt cedulaT, emailT, ingresacodigoT, nuevacontraT, verificaContraT;
    
    public vistarestablecimiento(){
        
        setSize(310,546);
        setUndecorated(true);
        iniciar();
        localizar();
        agregar();       
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(3);
        
    }
    
    private void iniciar(){
        
        fondo = new JLabel();
        fondo.setOpaque(true);
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/RESTABLECE.jpg")));
        fondo.setBackground(new Color(72, 181, 232));
        
        fondoIngresaCodigo = new JLabel();
        fondoIngresaCodigo.setOpaque(true);
        fondoIngresaCodigo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/INGRESACODIGO.jpg")));
        fondoIngresaCodigo.setBackground(new Color(72, 181, 232));
        fondoIngresaCodigo.setVisible(false);
        
        fondoNuevaContra = new JLabel();
        fondoNuevaContra.setOpaque(true);
        fondoNuevaContra.setIcon(new ImageIcon(getClass().getResource("/Imagenes/INGRESANUEVACONTRA.jpg")));
        fondoNuevaContra.setBackground(new Color(72, 181, 232));
        fondoNuevaContra.setVisible(false);
        
        cedula = new JTextField(11);
        cedula.setOpaque(false);
        cedula.setBorder(null);
        cedulaT = new TextPrompt("Identificación", cedula); 
        cedula.setForeground(Color.WHITE);
        
        email = new JTextField(25);
        email.setOpaque(false);
        email.setBorder(null);
        emailT = new TextPrompt("Email", email); 
        email.setForeground(Color.WHITE);
        
        ingresacodigo = new JTextField(25);
        ingresacodigo.setOpaque(false);
        ingresacodigo.setBorder(null);
        ingresacodigoT = new TextPrompt("Código enviado al mail", ingresacodigo);         
        ingresacodigo.setVisible(false);
        ingresacodigo.setForeground(Color.WHITE);
        
        nuevacontra = new JPasswordField(25);
        nuevacontra.setOpaque(false);
        nuevacontra.setBorder(null);
        nuevacontraT = new TextPrompt("Nueva contraseña", nuevacontra);
        nuevacontra.setVisible(false);
        nuevacontra.setForeground(Color.WHITE);
        
        verificaContra = new JPasswordField(25);
        verificaContra.setOpaque(false);
        verificaContra.setBorder(null);
        verificaContraT = new TextPrompt("Repetir contraseña", verificaContra);
        verificaContra.setVisible(false);
        verificaContra.setForeground(Color.WHITE);
        
        cerrarventanax = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cerrar.png")));
        cerrarventanax.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar_g.png")));
        cerrarventanax.setContentAreaFilled(false);
        cerrarventanax.setBorder(null);
        cerrarventanax.setCursor(new Cursor(HAND_CURSOR));
        
        regresarx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/goback.png")));
        regresarx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/goback_g.png")));
        regresarx.setContentAreaFilled(false);
        regresarx.setBorder(null);
        regresarx.setCursor(new Cursor(HAND_CURSOR));
        
        aceptar = new JButton(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        aceptar.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_g.png")));
        aceptar.setContentAreaFilled(false);
        aceptar.setBorder(null);
        aceptar.setCursor(new Cursor(HAND_CURSOR));
        
        aceptarIngresaCodigo = new JButton(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        aceptarIngresaCodigo.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_g.png")));
        aceptarIngresaCodigo.setContentAreaFilled(false);
        aceptarIngresaCodigo.setBorder(null);
        aceptarIngresaCodigo.setCursor(new Cursor(HAND_CURSOR));
        aceptarIngresaCodigo.setVisible(false);
        
        aceptarNuevaContra = new JButton(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        aceptarNuevaContra.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_g.png")));
        aceptarNuevaContra.setContentAreaFilled(false);
        aceptarNuevaContra.setBorder(null);
        aceptarNuevaContra.setCursor(new Cursor(HAND_CURSOR));
        aceptarNuevaContra.setVisible(false);
        
    }
    
    private void localizar(){
        
        setLayout(null);
        
        setLayout(null);
        
        fondo.setBounds(0,0,310,546);
        fondoIngresaCodigo.setBounds(0,0,310,546);
        fondoNuevaContra.setBounds(0,0,310,546);
        cedula.setBounds(80, 282, 150, 30);
        email.setBounds(80, 330, 150, 30);
        ingresacodigo.setBounds(80, 283, 150, 30);
        nuevacontra.setBounds(80, 283, 150, 30);
        verificaContra.setBounds(80, 345, 150, 30);
        
        cerrarventanax.setBounds(270, 10, 25, 25);
        
        regresarx.setBounds(20,20,47,47);
        
        aceptar.setBounds(129, 465, 47, 47);
        aceptarIngresaCodigo.setBounds(129, 465, 47, 47);
        aceptarNuevaContra.setBounds(129, 465, 47, 47);
        
        
    }
    
    private void agregar(){
         
        add(cedula);
        add(email);
        add(ingresacodigo);
        add(nuevacontra);
        add(verificaContra);
        add(cerrarventanax);
        add(regresarx);
        add(aceptar);
        add(aceptarIngresaCodigo);
        add(aceptarNuevaContra);
        
        add(fondoIngresaCodigo);
        add(fondoNuevaContra);
        add(fondo);//siempre añadirlo al final
    }
    
}