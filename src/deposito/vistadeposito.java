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
import javax.swing.JTextField;
import text.TextPrompt;

/**
 *
 * @author herrboh
 */
public class vistadeposito extends JFrame {
    
    public JButton buttonx1;
    public JButton buttonx2;
    public JButton buttonx3;
    public JButton buttonx4;
    public JButton buttonx5;
    public JButton buttonx6;
    public JButton buttonx7;
    public JButton buttonx8;
    public JButton buttonx9;
    public JButton buttonx0;
    public JButton buttonxcancel;
    
    public JButton cerrarventanax;
    public JButton aceptar;
    public JButton regresarx;
    
    public JLabel fondo;
    
    public JTextField valordeposito;
    
    private TextPrompt valordepositoT;
    
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
        
        buttonx1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/1small.png")));
        buttonx1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/1big.png")));
        buttonx1.setContentAreaFilled(false);
        buttonx1.setBorder(null);
        buttonx1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx2 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/2small.png")));
        buttonx2.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/2big.png")));
        buttonx2.setContentAreaFilled(false);
        buttonx2.setBorder(null);
        buttonx2.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx3 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/3small.png")));
        buttonx3.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/3big.png")));
        buttonx3.setContentAreaFilled(false);
        buttonx3.setBorder(null);
        buttonx3.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx4 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/4small.png")));
        buttonx4.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/4big.png")));
        buttonx4.setContentAreaFilled(false);
        buttonx4.setBorder(null);
        buttonx4.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx5 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/5small.png")));
        buttonx5.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/5big.png")));
        buttonx5.setContentAreaFilled(false);
        buttonx5.setBorder(null);
        buttonx5.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx6 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/6small.png")));
        buttonx6.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/6big.png")));
        buttonx6.setContentAreaFilled(false);
        buttonx6.setBorder(null);
        buttonx6.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx7 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/7small.png")));
        buttonx7.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/7big.png")));
        buttonx7.setContentAreaFilled(false);
        buttonx7.setBorder(null);
        buttonx7.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx8 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/8small.png")));
        buttonx8.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/8big.png")));
        buttonx8.setContentAreaFilled(false);
        buttonx8.setBorder(null);
        buttonx8.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx9 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/9small.png")));
        buttonx9.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/9big.png")));
        buttonx9.setContentAreaFilled(false);
        buttonx9.setBorder(null);
        buttonx9.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx0 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/0small.png")));
        buttonx0.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/0big.png")));
        buttonx0.setContentAreaFilled(false);
        buttonx0.setBorder(null);
        buttonx0.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxcancel = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cancelsmall.png")));
        buttonxcancel.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cancelbig.png")));
        buttonxcancel.setContentAreaFilled(false);
        buttonxcancel.setBorder(null);
        buttonxcancel.setCursor(new Cursor(HAND_CURSOR));
        
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
        
        valordeposito = new JTextField(6);
        valordeposito.setOpaque(false);
        valordeposito.setBorder(null);
        valordepositoT = new TextPrompt("Monto a depositar", valordeposito); 
        valordeposito.setEditable(false);
        valordeposito.setFocusable(false);
    }
    
    private void localizar(){
        
        setLayout(null);
        
        fondo.setBounds(0,0,310,546);
        
        valordeposito.setBounds(109, 214, 125, 30);
        
        cerrarventanax.setBounds(270, 10, 25, 25);
        
        regresarx.setBounds(20,20,47,47);
        
        aceptar.setBounds(129, 465, 47, 47);
        
        buttonx1.setBounds(90,280,40,40);
        buttonx2.setBounds(130,280,40,40);
        buttonx3.setBounds(170,280,40,40);
        
        buttonx4.setBounds(90,320,40,40);
        buttonx5.setBounds(130,320,40,40);
        buttonx6.setBounds(170,320,40,40);
        
        buttonx7.setBounds(90,360,40,40);
        buttonx8.setBounds(130,360,40,40);
        buttonx9.setBounds(170,360,40,40);
        buttonx0.setBounds(130,400,40,40);
        
        buttonxcancel.setBounds(90,400,40,40);
        
    }
    
    private void agregar(){
        
        add(valordeposito);
        add(cerrarventanax);
        add(regresarx);
        add(aceptar);
        add(buttonx1);
        add(buttonx2);
        add(buttonx3);
        add(buttonx4);
        add(buttonx5);
        add(buttonx6);
        add(buttonx7);
        add(buttonx8);
        add(buttonx9);
        add(buttonx0);
        add(buttonxcancel);
        
        add(fondo);//siempre añadirlo al final
        
    }
    
}
