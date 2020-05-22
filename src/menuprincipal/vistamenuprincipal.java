/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author herrboh
 */
public class vistamenuprincipal extends JFrame {
    
    public JButton cerrarventanax;
    public JButton depositarx;
    public JButton retirarx;
    public JButton cerrarsesionx;
    public JButton aprende;
    public JButton historial;
            
    private JLabel fondo;
    public JLabel saldo;
    
    public vistamenuprincipal(){
        
        setSize(310,546);
        setUndecorated(true);//quita frame default del SO
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
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/MAINMENU.jpg")));
        
        saldo = new JLabel("saldo");  
        saldo.setFont(new Font("Serif", Font.PLAIN, 20));         
        
        
        cerrarventanax = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cerrar.png")));
        cerrarventanax.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar_g.png")));
        cerrarventanax.setContentAreaFilled(false);
        cerrarventanax.setBorder(null);
        cerrarventanax.setCursor(new Cursor(HAND_CURSOR));
        
        depositarx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/DEPOSITA.png")));
        depositarx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/DEPOSITA_b.png")));
        depositarx.setContentAreaFilled(false);
        depositarx.setBorder(null);
        depositarx.setCursor(new Cursor(HAND_CURSOR));
        
        retirarx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/RETIRA.png")));
        retirarx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/RETIRA_b.png")));
        retirarx.setContentAreaFilled(false);
        retirarx.setBorder(null);
        retirarx.setCursor(new Cursor(HAND_CURSOR));
        
        cerrarsesionx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/LOGOUT.png")));
        cerrarsesionx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/LOGOUT_b.png")));
        cerrarsesionx.setBorder(null);
        cerrarsesionx.setContentAreaFilled(false);
        cerrarsesionx.setCursor(new Cursor(HAND_CURSOR));
        
        aprende = new JButton(new ImageIcon(getClass().getResource("/Imagenes/APRENDE.png")));
        aprende.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/APRENDE_b.png")));
        aprende.setContentAreaFilled(false);
        aprende.setBorder(null);
        aprende.setCursor(new Cursor(HAND_CURSOR));  
        
        historial = new JButton(new ImageIcon(getClass().getResource("/Imagenes/lupita_s.png")));
        historial.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/lupita_s.png")));
        historial.setContentAreaFilled(false);
        historial.setBorder(null);
        historial.setCursor(new Cursor(HAND_CURSOR)); 
        
    }
    
    private void localizar(){
        
        setLayout(null);
        
        
        fondo.setBounds(0,0,310,546);
        saldo.setBounds(130,146,70,100);
        
        cerrarventanax.setBounds(270, 10, 25, 25);
        
        depositarx.setBounds(35,300,100,100);
        retirarx.setBounds(185,300,100,100);
        
        historial.setBounds(240,190,30,30);
        
        cerrarsesionx.setBounds(45,410,100,100);
        aprende.setBounds(175,410,100,100);
        
           
        
        
    }
    
    private void agregar(){
        
        add(cerrarventanax);
        add(depositarx);
        add(retirarx);
        add(cerrarsesionx);
        add(aprende);
        add(saldo);
        
        add(historial);
        
        add(fondo);
        
        
    }
    
    
}
