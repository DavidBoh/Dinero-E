/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historial;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author herrboh
 */
public class historialVista extends JFrame {
    
    public JButton cerrarventanax;
   
    public JButton regresarx;
    
    public JLabel fondo;
    
    public String[] columnNames = {"Fecha",
                        "Transaccion",
                        "Valor", "Anterior $", "Nuevo $"};
    
    Object[][] data = {
       
        
    };
    
    public TableColumn column = null;
    
    public JTable table;
    
    public JScrollPane scrollPane;
    
  
    
    public historialVista(){
        
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
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/NULL.jpg")));
        fondo.setBackground(new Color(72, 181, 232));
        
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
        
        
        
        table = new JTable(data,columnNames);
      
        scrollPane = new JScrollPane(table);
        
        table.setFillsViewportHeight(true);
        
        
        
       
        
        
      
        
        
        
          
        
    }
    
  
    
    private void localizar(){
        
        setLayout(null);
        
        fondo.setBounds(0,0,310,546);
        
        cerrarventanax.setBounds(270, 10, 25, 25);
        
        
        scrollPane.setBounds(20,130,268,260);
        
        regresarx.setBounds(20,20,47,47);
        
       
        
        
    }
    
    private void agregar(){
        
        add(cerrarventanax);
        add(regresarx);
        add(scrollPane);
        
        add(fondo);//siempre añadirlo al final
       
    }
    
}
