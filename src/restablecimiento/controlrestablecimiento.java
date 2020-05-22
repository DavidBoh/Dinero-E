/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restablecimiento;

import Modelo.ModeloBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import loginapp.ControlLogin;
import loginapp.VistaLogin;

/**
 *
 * @author herrboh
 */
public class controlrestablecimiento implements ActionListener {

    vistarestablecimiento v;
    
    public controlrestablecimiento(vistarestablecimiento vis){
        v = vis;
        
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
            VistaLogin v1= new VistaLogin();
            ModeloBD m1= new ModeloBD();
            ControlLogin c1= new ControlLogin(m1,v1);          
            
            
        }
        
        
        
    }
    
}
