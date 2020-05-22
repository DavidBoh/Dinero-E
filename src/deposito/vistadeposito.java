/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deposito;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author herrboh
 */
public class vistadeposito extends JFrame {
    
    public JButton cerrarventanax;
    public JButton aceptar;
    public JButton regresarx;
    
    public JLabel fondo;
    
    public vistadeposito(){
        
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
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/DEPOSITA.jpg")));
        fondo.setBackground(new Color(72, 181, 232));
        
        cerrarventanax = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cerrar.png")));
        cerrarventanax.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar_g.png")));
        cerrarventanax.setContentAreaFilled(false);
        cerrarventanax.setBorder(null);
        cerrarventanax.setCursor(new Cursor(HAND_CURSOR));
        
        aceptar = new JButton(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        aceptar.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_g.png")));
        aceptar.setContentAreaFilled(false);
        aceptar.setBorder(null);
        aceptar.setCursor(new Cursor(HAND_CURSOR));
        
        regresarx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/goback.png")));
        regresarx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/goback_g.png")));
        regresarx.setContentAreaFilled(false);
        regresarx.setBorder(null);
        regresarx.setCursor(new Cursor(HAND_CURSOR));
    }
    
    private void localizar(){
        
        setLayout(null);
        
        fondo.setBounds(0,0,310,546);
        
        cerrarventanax.setBounds(270, 10, 25, 25);
        
        regresarx.setBounds(20,20,47,47);
        
        aceptar.setBounds(129, 465, 47, 47);
        
    }
    
    private void agregar(){
        
        
        add(cerrarventanax);
        add(regresarx);
        add(aceptar);
        
        add(fondo);//siempre añadirlo al final
        
    }
    
}
