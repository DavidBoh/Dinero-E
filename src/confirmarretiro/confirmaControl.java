/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confirmarretiro;

import Modelo.ModeloBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import retiro.controlretiro;
import retiro.vistaretiro;

/**
 *
 * @author herrboh
 */
public class confirmaControl implements ActionListener {
    
    confirmaVista v;
    ModeloBD bd;
    private int usuario;
    
    public confirmaControl(confirmaVista vis, ModeloBD bd, int usuario){
        
        v = vis;
        this.bd = bd;
        this.usuario = usuario;
        
        v.cerrarventanax.addActionListener(this);
        v.regresarx.addActionListener(this);
        v.aceptar.addActionListener(this);
       
        
        
        
        v.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
    }
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==v.cerrarventanax){
            System.exit(0);
        }
        
        if(e.getSource()==v.regresarx){
            v.dispose();
            
            vistaretiro  retirovis = new vistaretiro();
            controlretiro retiroc = new controlretiro(retirovis, bd, usuario);        
            
            
        }

    }
    
}
