/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deposito;

import Modelo.ModeloBD;
import Modelo.limitadorCaracteres;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import menuprincipal.controlmenuprincipal;
import menuprincipal.vistamenuprincipal;
import retiro.vistaretiro;

/**
 *
 * @author herrboh
 */
public class controldeposito implements ActionListener {

    vistadeposito v;
    
    ModeloBD baseDatos;
    private int usuario;
    private ArrayList<limitadorCaracteres> limitadores = new ArrayList<limitadorCaracteres>();

    public controldeposito(vistadeposito vis, ModeloBD bd, int usuario) {
        v = vis;
        
        this.baseDatos = bd;
        this.usuario = usuario;
        
        v.cerrarventanax.addActionListener(this);
        v.regresarx.addActionListener(this);
        v.aceptar.addActionListener(this);
        
        v.valordeposito.addActionListener(this);
        
        v.buttonx1.addActionListener(this);
        v.buttonx2.addActionListener(this);
        v.buttonx3.addActionListener(this);

        v.buttonx4.addActionListener(this);
        v.buttonx5.addActionListener(this);
        v.buttonx6.addActionListener(this);

        v.buttonx7.addActionListener(this);
        v.buttonx8.addActionListener(this);
        v.buttonx9.addActionListener(this);
        v.buttonx0.addActionListener(this);
        v.buttonxcancel.addActionListener(this);

        limiteCaracteres(v);
        
        v.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == v.cerrarventanax) {
            System.exit(0);
        }

        if (e.getSource() == v.regresarx) {
            v.dispose();

            vistamenuprincipal mainmenu = new vistamenuprincipal();
            controlmenuprincipal mainmenuc = new controlmenuprincipal(mainmenu, baseDatos, usuario);

        }
        
        if (e.getSource() == v.buttonx1) {
            v.valordeposito.setText(v.valordeposito.getText() + "1");
        }

        if (e.getSource() == v.buttonx2) {
            v.valordeposito.setText(v.valordeposito.getText() + "2");
        }

        if (e.getSource() == v.buttonx3) {
            v.valordeposito.setText(v.valordeposito.getText() + "3");
        }

        if (e.getSource() == v.buttonx4) {
            v.valordeposito.setText(v.valordeposito.getText() + "4");
        }

        if (e.getSource() == v.buttonx5) {
            v.valordeposito.setText(v.valordeposito.getText() + "5");
        }

        if (e.getSource() == v.buttonx6) {
            v.valordeposito.setText(v.valordeposito.getText() + "6");
        }

        if (e.getSource() == v.buttonx7) {
            v.valordeposito.setText(v.valordeposito.getText() + "7");
        }

        if (e.getSource() == v.buttonx8) {
            v.valordeposito.setText(v.valordeposito.getText() + "8");
        }

        if (e.getSource() == v.buttonx9) {
            v.valordeposito.setText(v.valordeposito.getText() + "9");
        }

        if (e.getSource() == v.buttonx0) {
            v.valordeposito.setText(v.valordeposito.getText() + "0");
        }

        if (e.getSource() == v.buttonxcancel) {
            v.valordeposito.setText(null);
        }

        if (e.getSource() == v.aceptar) {
            
            /**
             * Incluir método para verificar el saldo del usuario
             */
            sumarSaldo();
            
        }

    }

    private void limiteCaracteres(vistadeposito v) {
        limitadores.add(new limitadorCaracteres(v.valordeposito, 10, 2));

    }
    
   
    
    private void sumarSaldo(){
        
        if(!v.valordeposito.getText().isEmpty()){
        	try {
        	
        		baseDatos.conectar();
        
        		int valoractual = Integer.parseInt(baseDatos.consultarSaldo(usuario));
        		int valodeposito = Integer.parseInt(v.valordeposito.getText());
        		int valornuevo = valoractual+valodeposito;
        
        		if(valodeposito > 5000000){
            			JOptionPane.showMessageDialog(null, "Saldo Inválido");
        		}else {
        
        			baseDatos.actualizarSaldo(usuario, valornuevo);
        
        		}
        		baseDatos.cerrar();
        	
        	} catch (Exception e) {
        		JOptionPane.showMessageDialog(null, "Ingrese Datos");
        	}
        
        } else {
        	JOptionPane.showMessageDialog(null, "Ingrese Datos");
        }
        
        
        
        
    }
    
}
