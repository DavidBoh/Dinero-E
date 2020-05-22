/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retiro;

import Modelo.ModeloBD;
import Modelo.limitadorCaracteres;
import confirmarretiro.confirmaControl;
import confirmarretiro.confirmaVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import menuprincipal.controlmenuprincipal;
import menuprincipal.vistamenuprincipal;

/**
 *
 * @author herrboh
 */
public class controlretiro implements ActionListener {

    vistaretiro v;
    ModeloBD baseDatos;
    private int usuario;
    private ArrayList<limitadorCaracteres> limitadores = new ArrayList<limitadorCaracteres>();

    public controlretiro(vistaretiro vis, ModeloBD bd, int usuario) {
        v = vis;
        this.baseDatos = bd;
        this.usuario = usuario;

        v.cerrarventanax.addActionListener(this);
        v.regresarx.addActionListener(this);
        v.aceptar.addActionListener(this);
        v.valorretiro.addActionListener(this);

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
            v.valorretiro.setText(v.valorretiro.getText() + "1");
        }

        if (e.getSource() == v.buttonx2) {
            v.valorretiro.setText(v.valorretiro.getText() + "2");
        }

        if (e.getSource() == v.buttonx3) {
            v.valorretiro.setText(v.valorretiro.getText() + "3");
        }

        if (e.getSource() == v.buttonx4) {
            v.valorretiro.setText(v.valorretiro.getText() + "4");
        }

        if (e.getSource() == v.buttonx5) {
            v.valorretiro.setText(v.valorretiro.getText() + "5");
        }

        if (e.getSource() == v.buttonx6) {
            v.valorretiro.setText(v.valorretiro.getText() + "6");
        }

        if (e.getSource() == v.buttonx7) {
            v.valorretiro.setText(v.valorretiro.getText() + "7");
        }

        if (e.getSource() == v.buttonx8) {
            v.valorretiro.setText(v.valorretiro.getText() + "8");
        }

        if (e.getSource() == v.buttonx9) {
            v.valorretiro.setText(v.valorretiro.getText() + "9");
        }

        if (e.getSource() == v.buttonx0) {
            v.valorretiro.setText(v.valorretiro.getText() + "0");
        }

        if (e.getSource() == v.buttonxcancel) {
            v.valorretiro.setText(null);
        }

        if (e.getSource() == v.aceptar) {
            //v.dispose();
            //confirmaVista confirmavis = new confirmaVista();
            //confirmaControl confirmac = new confirmaControl(confirmavis, baseDatos, usuario);
            restarSaldo();
            System.out.println("Transacción en proceso");
            /**
             * Incluir método para verificar el saldo del usuario
             */
        }

    }

    private void limiteCaracteres(vistaretiro v) {
        limitadores.add(new limitadorCaracteres(v.valorretiro, 10, 2));

    }
    
    private void restarSaldo(){
        
        baseDatos.conectar();
        
        int valoractual = Integer.parseInt(baseDatos.consultarSaldo(usuario));
        int valorretiro = Integer.parseInt(v.valorretiro.getText());
        int valornuevo = valoractual-valorretiro;
        if(valornuevo <= 0){
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        } else if(valorretiro > valoractual) {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
        } else {
            baseDatos.actualizarSaldo(usuario, valornuevo);    
        }
        
        baseDatos.cerrar();
        
    }

}
