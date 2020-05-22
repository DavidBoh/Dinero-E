/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;

import Modelo.ModeloBD;
import aprender.controlaprender;
import aprender.vistaaprender;
import deposito.controldeposito;
import deposito.vistadeposito;
import historial.historialControl;
import historial.historialVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import loginapp.ControlLogin;

import loginapp.VistaLogin;
import retiro.controlretiro;
import retiro.vistaretiro;

/**
 *
 * @author herrboh
 */
public class controlmenuprincipal implements ActionListener {
    
    vistamenuprincipal v;
    ModeloBD baseDatos;
    private int usuario;
    
    public controlmenuprincipal(vistamenuprincipal vis,ModeloBD bd, int usuario){
        this.v=vis;
        this.baseDatos = bd;
        this.usuario = usuario;
        
        v.cerrarventanax.addActionListener(this);
        v.depositarx.addActionListener(this);
        v.retirarx.addActionListener(this);
        v.cerrarsesionx.addActionListener(this);
        v.aprende.addActionListener(this);
        v.historial.addActionListener(this);
        consultarSaldo();
        
        v.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
         
        //System.out.println("clicked");
        if(e.getSource()==v.cerrarventanax){
            System.exit(0);
        }
        
        if(e.getSource()==v.cerrarsesionx){
            v.dispose();
            VistaLogin v1= new VistaLogin();
            ModeloBD m1= new ModeloBD();
            ControlLogin c1= new ControlLogin(m1,v1);
        }
        
        if(e.getSource() == v.retirarx){
            v.dispose();
            
            
            vistaretiro  retirovis = new vistaretiro();
            controlretiro retiroc = new controlretiro(retirovis, baseDatos, usuario);
        }
        
        if(e.getSource() == v.depositarx){
            v.dispose();
            
            
            vistadeposito  depositovis = new vistadeposito();
            controldeposito depositoc = new controldeposito(depositovis, baseDatos, usuario);
        }
        
        if(e.getSource() == v.aprende){
            v.dispose();
            
            
            vistaaprender  aprendevis = new vistaaprender();
            controlaprender aprendec = new controlaprender(aprendevis,baseDatos,usuario);
        }
        
        if(e.getSource() == v.historial){
            v.dispose();
            
            historialVista historialvis = new historialVista();
            historialControl historialc = new historialControl(historialvis, baseDatos, usuario);
     
        }
        
    }
    
    private void consultarSaldo(){        
        baseDatos.conectar(); 
        v.saldo.setText(baseDatos.consultarSaldo(usuario));
        baseDatos.cerrar();        
    }
    
}
