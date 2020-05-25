/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retiro;

import Hash.Sha;
import Modelo.ModeloBD;
import Modelo.limitadorCaracteres;

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
    
    private Sha seguridad = new Sha();
    vistaretiro v;
    ModeloBD baseDatos;
    private int usuario;
    private ArrayList<limitadorCaracteres> limitadores = new ArrayList<limitadorCaracteres>();

    public controlretiro(vistaretiro vis, ModeloBD bd, int usuario) {
        v = vis;
        this.baseDatos = bd;
        this.usuario = usuario;
        
        /*Inicio ventana inicial*/
        v.buttonx1_1.addActionListener(this);
        v.buttonx2_1.addActionListener(this);
        v.buttonx3_1.addActionListener(this);

        v.buttonx4_1.addActionListener(this);
        v.buttonx5_1.addActionListener(this);
        v.buttonx6_1.addActionListener(this);

        v.buttonx7_1.addActionListener(this);
        v.buttonx8_1.addActionListener(this);
        v.buttonx9_1.addActionListener(this);
        v.buttonx0_1.addActionListener(this);
        v.buttonxcancel_1.addActionListener(this);
        v.aceptar.addActionListener(this);
        v.valorretiro.addActionListener(this);
        /*Fin ventana inicial*/
        /* ----------- */
        /*Inicio ventana confirmacion*/
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
        v.buttonxA.addActionListener(this);
        v.buttonxB.addActionListener(this);
        v.buttonxC.addActionListener(this);
        v.buttonxD.addActionListener(this);
        v.buttonxE.addActionListener(this);
        v.buttonxF.addActionListener(this);
        v.buttonxG.addActionListener(this);
        v.buttonxH.addActionListener(this);
        v.buttonxI.addActionListener(this);
        v.buttonxJ.addActionListener(this);
        v.buttonxK.addActionListener(this);
        v.buttonxL.addActionListener(this);
        v.buttonxM.addActionListener(this);
        v.buttonxN.addActionListener(this);
        v.buttonxO.addActionListener(this);
        v.buttonxP.addActionListener(this);
        v.buttonxQ.addActionListener(this);
        v.buttonxR.addActionListener(this);
        v.buttonxS.addActionListener(this);
        v.buttonxT.addActionListener(this);
        v.buttonxU.addActionListener(this);
        v.buttonxV.addActionListener(this);
        v.buttonxW.addActionListener(this);
        v.buttonxX.addActionListener(this);
        v.buttonxY.addActionListener(this);
        v.buttonxZ.addActionListener(this);
        v.buttonxABC.addActionListener(this);
        v.buttonx123.addActionListener(this);

        v.buttonxa.addActionListener(this);
        v.buttonxb.addActionListener(this);
        v.buttonxd.addActionListener(this);
        v.buttonxe.addActionListener(this);
        v.buttonxf.addActionListener(this);
        v.buttonxg.addActionListener(this);
        v.buttonxh.addActionListener(this);
        v.buttonxi.addActionListener(this);
        v.buttonxj.addActionListener(this);
        v.buttonxk.addActionListener(this);
        v.buttonxl.addActionListener(this);
        v.buttonxn.addActionListener(this);
        v.buttonxñ.addActionListener(this);
        v.buttonxo.addActionListener(this);
        v.buttonxp.addActionListener(this);
        v.buttonxq.addActionListener(this);
        v.buttonxr.addActionListener(this);
        v.buttonxs.addActionListener(this);
        v.buttonxt.addActionListener(this);
        v.buttonxu.addActionListener(this);
        v.buttonxv.addActionListener(this);
        v.buttonxc.addActionListener(this);
        v.buttonxw.addActionListener(this);
        v.buttonxx.addActionListener(this);
        v.buttonxy.addActionListener(this);
        v.buttonxz.addActionListener(this);
        v.buttonxm.addActionListener(this);
        v.mayus.addActionListener(this);
        v.minus.addActionListener(this);

        v.buttonxok.addActionListener(this);
        
        
        
        /*Fin ventana confirmacion*/

        v.cerrarventanax.addActionListener(this);
        v.regresarx.addActionListener(this);

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

        /*Inicio ventana inicial*/
        
        if (e.getSource() == v.buttonx1_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "1");
        }

        if (e.getSource() == v.buttonx2_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "2");
        }

        if (e.getSource() == v.buttonx3_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "3");
        }

        if (e.getSource() == v.buttonx4_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "4");
        }

        if (e.getSource() == v.buttonx5_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "5");
        }

        if (e.getSource() == v.buttonx6_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "6");
        }

        if (e.getSource() == v.buttonx7_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "7");
        }

        if (e.getSource() == v.buttonx8_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "8");
        }

        if (e.getSource() == v.buttonx9_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "9");
        }

        if (e.getSource() == v.buttonx0_1) {
            v.valorretiro.setText(v.valorretiro.getText() + "0");
        }

        if (e.getSource() == v.buttonxcancel_1) {
            v.valorretiro.setText(null);
        }
        
        if (e.getSource() == v.aceptar) {
                validacionAceptar();
                pasarValor();
        }
        
        /*Fin ventana inicial*/
          /* ----------- */
        /*Inicio ventana confirmacion*/
        
        if (e.getSource() == v.minus) {

            v.buttonxb.setVisible(true);
            v.buttonxc.setVisible(true);
            v.buttonxa.setVisible(true);
            v.buttonxd.setVisible(true);
            v.buttonxe.setVisible(true);
            v.buttonxf.setVisible(true);
            v.buttonxg.setVisible(true);
            v.buttonxh.setVisible(true);
            v.buttonxi.setVisible(true);
            v.buttonxj.setVisible(true);
            v.buttonxk.setVisible(true);
            v.buttonxl.setVisible(true);
            v.buttonxm.setVisible(true);
            v.buttonxn.setVisible(true);
            v.buttonxñ.setVisible(true);
            v.buttonxo.setVisible(true);
            v.buttonxp.setVisible(true);
            v.buttonxq.setVisible(true);
            v.buttonxr.setVisible(true);
            v.buttonxs.setVisible(true);
            v.buttonxt.setVisible(true);
            v.buttonxu.setVisible(true);
            v.buttonxv.setVisible(true);
            v.buttonxw.setVisible(true);
            v.buttonxx.setVisible(true);
            v.buttonxy.setVisible(true);
            v.buttonxz.setVisible(true);

            v.buttonxA.setVisible(false);
            v.buttonxB.setVisible(false);
            v.buttonxC.setVisible(false);
            v.buttonxD.setVisible(false);
            v.buttonxE.setVisible(false);
            v.buttonxF.setVisible(false);
            v.buttonxG.setVisible(false);
            v.buttonxH.setVisible(false);
            v.buttonxI.setVisible(false);
            v.buttonxJ.setVisible(false);
            v.buttonxK.setVisible(false);
            v.buttonxL.setVisible(false);
            v.buttonxM.setVisible(false);
            v.buttonxN.setVisible(false);
            v.buttonxÑ.setVisible(false);
            v.buttonxO.setVisible(false);
            v.buttonxP.setVisible(false);
            v.buttonxQ.setVisible(false);
            v.buttonxR.setVisible(false);
            v.buttonxS.setVisible(false);
            v.buttonxT.setVisible(false);
            v.buttonxU.setVisible(false);
            v.buttonxV.setVisible(false);
            v.buttonxW.setVisible(false);
            v.buttonxX.setVisible(false);
            v.buttonxY.setVisible(false);
            v.buttonxZ.setVisible(false);

            v.buttonxABC.setVisible(false);
            v.buttonx123.setVisible(true);
            v.minus.setVisible(false);
            v.mayus.setVisible(true);

        }

        if (e.getSource() == v.buttonx123) {
            v.buttonx1.setVisible(true);
            v.buttonx2.setVisible(true);
            v.buttonx3.setVisible(true);
            v.buttonx4.setVisible(true);
            v.buttonx5.setVisible(true);
            v.buttonx6.setVisible(true);
            v.buttonx7.setVisible(true);
            v.buttonx8.setVisible(true);
            v.buttonx9.setVisible(true);
            v.buttonx0.setVisible(true);
            v.buttonxcancel.setVisible(true);
            v.buttonxok.setVisible(true);
            v.buttonxABC.setVisible(true);
            v.buttonx123.setVisible(false);

            v.buttonxa.setVisible(false);
            v.buttonxb.setVisible(false);
            v.buttonxc.setVisible(false);
            v.buttonxd.setVisible(false);
            v.buttonxe.setVisible(false);
            v.buttonxf.setVisible(false);
            v.buttonxg.setVisible(false);
            v.buttonxh.setVisible(false);
            v.buttonxi.setVisible(false);
            v.buttonxj.setVisible(false);
            v.buttonxk.setVisible(false);
            v.buttonxl.setVisible(false);
            v.buttonxm.setVisible(false);
            v.buttonxn.setVisible(false);
            v.buttonxñ.setVisible(false);
            v.buttonxo.setVisible(false);
            v.buttonxp.setVisible(false);
            v.buttonxq.setVisible(false);
            v.buttonxr.setVisible(false);
            v.buttonxs.setVisible(false);
            v.buttonxt.setVisible(false);
            v.buttonxu.setVisible(false);
            v.buttonxv.setVisible(false);
            v.buttonxw.setVisible(false);
            v.buttonxx.setVisible(false);
            v.buttonxy.setVisible(false);
            v.buttonxz.setVisible(false);
            v.mayus.setVisible(false);
            v.minus.setVisible(false);

            v.buttonxB.setVisible(false);
            v.buttonxA.setVisible(false);
            v.buttonxC.setVisible(false);
            v.buttonxD.setVisible(false);
            v.buttonxE.setVisible(false);
            v.buttonxF.setVisible(false);
            v.buttonxG.setVisible(false);
            v.buttonxH.setVisible(false);
            v.buttonxI.setVisible(false);
            v.buttonxJ.setVisible(false);
            v.buttonxK.setVisible(false);
            v.buttonxL.setVisible(false);
            v.buttonxM.setVisible(false);
            v.buttonxN.setVisible(false);
            v.buttonxÑ.setVisible(false);
            v.buttonxO.setVisible(false);
            v.buttonxP.setVisible(false);
            v.buttonxQ.setVisible(false);
            v.buttonxR.setVisible(false);
            v.buttonxS.setVisible(false);
            v.buttonxT.setVisible(false);
            v.buttonxU.setVisible(false);
            v.buttonxV.setVisible(false);
            v.buttonxW.setVisible(false);
            v.buttonxX.setVisible(false);
            v.buttonxY.setVisible(false);
            v.buttonxZ.setVisible(false);

        }
        
        if (e.getSource() == v.buttonxABC) {
            v.buttonx1.setVisible(false);
            v.buttonx2.setVisible(false);
            v.buttonx3.setVisible(false);
            v.buttonx4.setVisible(false);
            v.buttonx5.setVisible(false);
            v.buttonx6.setVisible(false);
            v.buttonx7.setVisible(false);
            v.buttonx8.setVisible(false);
            v.buttonx9.setVisible(false);
            v.buttonx0.setVisible(false);
            v.buttonxcancel.setVisible(false);
            v.buttonxok.setVisible(false);
            v.buttonxABC.setVisible(false);
            v.buttonx123.setVisible(true);

            v.buttonxa.setVisible(true);
            v.buttonxb.setVisible(true);
            v.buttonxc.setVisible(true);
            v.buttonxd.setVisible(true);
            v.buttonxe.setVisible(true);
            v.buttonxf.setVisible(true);
            v.buttonxg.setVisible(true);
            v.buttonxh.setVisible(true);
            v.buttonxi.setVisible(true);
            v.buttonxj.setVisible(true);
            v.buttonxk.setVisible(true);
            v.buttonxl.setVisible(true);
            v.buttonxm.setVisible(true);
            v.buttonxn.setVisible(true);
            v.buttonxñ.setVisible(true);
            v.buttonxo.setVisible(true);
            v.buttonxp.setVisible(true);
            v.buttonxq.setVisible(true);
            v.buttonxr.setVisible(true);
            v.buttonxs.setVisible(true);
            v.buttonxt.setVisible(true);
            v.buttonxu.setVisible(true);
            v.buttonxv.setVisible(true);
            v.buttonxw.setVisible(true);
            v.buttonxx.setVisible(true);
            v.buttonxy.setVisible(true);
            v.buttonxz.setVisible(true);
            v.mayus.setVisible(true);

        }

        if (e.getSource() == v.mayus) {
            v.buttonxb.setVisible(false);
            v.buttonxc.setVisible(false);
            v.buttonxa.setVisible(false);
            v.buttonxd.setVisible(false);
            v.buttonxe.setVisible(false);
            v.buttonxf.setVisible(false);
            v.buttonxg.setVisible(false);
            v.buttonxh.setVisible(false);
            v.buttonxi.setVisible(false);
            v.buttonxj.setVisible(false);
            v.buttonxk.setVisible(false);
            v.buttonxl.setVisible(false);
            v.buttonxm.setVisible(false);
            v.buttonxn.setVisible(false);
            v.buttonxñ.setVisible(false);
            v.buttonxo.setVisible(false);
            v.buttonxp.setVisible(false);
            v.buttonxq.setVisible(false);
            v.buttonxr.setVisible(false);
            v.buttonxs.setVisible(false);
            v.buttonxt.setVisible(false);
            v.buttonxu.setVisible(false);
            v.buttonxv.setVisible(false);
            v.buttonxw.setVisible(false);
            v.buttonxx.setVisible(false);
            v.buttonxy.setVisible(false);
            v.buttonxz.setVisible(false);

            v.buttonxA.setVisible(true);
            v.buttonxB.setVisible(true);
            v.buttonxC.setVisible(true);
            v.buttonxD.setVisible(true);
            v.buttonxE.setVisible(true);
            v.buttonxF.setVisible(true);
            v.buttonxG.setVisible(true);
            v.buttonxH.setVisible(true);
            v.buttonxI.setVisible(true);
            v.buttonxJ.setVisible(true);
            v.buttonxK.setVisible(true);
            v.buttonxL.setVisible(true);
            v.buttonxM.setVisible(true);
            v.buttonxN.setVisible(true);
            v.buttonxÑ.setVisible(true);
            v.buttonxO.setVisible(true);
            v.buttonxP.setVisible(true);
            v.buttonxQ.setVisible(true);
            v.buttonxR.setVisible(true);
            v.buttonxS.setVisible(true);
            v.buttonxT.setVisible(true);
            v.buttonxU.setVisible(true);
            v.buttonxV.setVisible(true);
            v.buttonxW.setVisible(true);
            v.buttonxX.setVisible(true);
            v.buttonxY.setVisible(true);
            v.buttonxZ.setVisible(true);

            v.buttonxABC.setVisible(false);
            v.buttonx123.setVisible(true);
            v.minus.setVisible(true);
            v.mayus.setVisible(false);

        }
        
         if (e.getSource() == v.buttonx1) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "1");
        }

        if (e.getSource() == v.buttonx2) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "2");
        }

        if (e.getSource() == v.buttonx3) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "3");
        }

        if (e.getSource() == v.buttonx4) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "4");
        }

        if (e.getSource() == v.buttonx5) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "5");
        }

        if (e.getSource() == v.buttonx6) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "6");
        }

        if (e.getSource() == v.buttonx7) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "7");
        }

        if (e.getSource() == v.buttonx8) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "8");
        }

        if (e.getSource() == v.buttonx9) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "9");
        }

        if (e.getSource() == v.buttonx0) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "0");
        }

        if (e.getSource() == v.buttonxcancel) {
            v.confirmacontraseña.setText(null);
        }

        if (e.getSource() == v.buttonxa) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "a");
        }

        if (e.getSource() == v.buttonxb) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "b");
        }

        if (e.getSource() == v.buttonxc) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "c");
        }

        if (e.getSource() == v.buttonxd) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "d");
        }

        if (e.getSource() == v.buttonxe) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "e");
        }

        if (e.getSource() == v.buttonxf) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "f");
        }

        if (e.getSource() == v.buttonxg) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "g");
        }

        if (e.getSource() == v.buttonxh) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "h");
        }

        if (e.getSource() == v.buttonxi) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "i");
        }

        if (e.getSource() == v.buttonxj) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "j");
        }

        if (e.getSource() == v.buttonxk) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "k");
        }

        if (e.getSource() == v.buttonxl) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "l");
        }

        if (e.getSource() == v.buttonxm) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "m");
        }

        if (e.getSource() == v.buttonxn) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "n");
        }

        if (e.getSource() == v.buttonxñ) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "ñ");
        }

        if (e.getSource() == v.buttonxo) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "o");
        }

        if (e.getSource() == v.buttonxp) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "p");
        }

        if (e.getSource() == v.buttonxq) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "q");
        }

        if (e.getSource() == v.buttonxr) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "r");
        }

        if (e.getSource() == v.buttonxs) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "s");
        }

        if (e.getSource() == v.buttonxt) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "t");
        }

        if (e.getSource() == v.buttonxu) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "u");
        }

        if (e.getSource() == v.buttonxv) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "v");
        }

        if (e.getSource() == v.buttonxw) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "w");
        }

        if (e.getSource() == v.buttonxx) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "x");
        }

        if (e.getSource() == v.buttonxy) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "y");
        }

        if (e.getSource() == v.buttonxz) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "z");
        }

        if (e.getSource() == v.buttonxA) {
            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "A");
        }

        if (e.getSource() == v.buttonxB) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "B");
        }
        if (e.getSource() == v.buttonxC) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "C");
        }
        if (e.getSource() == v.buttonxD) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "D");
        }
        if (e.getSource() == v.buttonxE) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "E");
        }
        if (e.getSource() == v.buttonxF) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "F");
        }
        if (e.getSource() == v.buttonxG) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "G");
        }
        if (e.getSource() == v.buttonxH) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "H");
        }
        if (e.getSource() == v.buttonxI) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "I");
        }
        if (e.getSource() == v.buttonxJ) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "J");
        }
        if (e.getSource() == v.buttonxK) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "K");
        }
        if (e.getSource() == v.buttonxL) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "L");
        }
        if (e.getSource() == v.buttonxM) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "M");
        }
        if (e.getSource() == v.buttonxN) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "N");
        }
        if (e.getSource() == v.buttonxÑ) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "Ñ");
        }
        if (e.getSource() == v.buttonxO) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "O");
        }
        if (e.getSource() == v.buttonxP) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "P");
        }
        if (e.getSource() == v.buttonxQ) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "Q");
        }
        if (e.getSource() == v.buttonxR) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "R");
        }
        if (e.getSource() == v.buttonxS) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "S");
        }
        if (e.getSource() == v.buttonxT) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "T");
        }
        if (e.getSource() == v.buttonxU) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "U");
        }
        if (e.getSource() == v.buttonxV) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "V");
        }
        if (e.getSource() == v.buttonxW) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "W");
        }
        if (e.getSource() == v.buttonxX) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "X");
        }
        if (e.getSource() == v.buttonxY) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "Y");
        }
        if (e.getSource() == v.buttonxZ) {

            v.confirmacontraseña.setText(v.confirmacontraseña.getText() + "Z");
        }
        
        if (e.getSource() == v.buttonxok) {

            validarContraseña();

        }
        
        /*Fin ventana confirmacion*/
        
        

    }

    private void limiteCaracteres(vistaretiro v) {
        limitadores.add(new limitadorCaracteres(v.valorretiro, 10, 2));

    }
    
    private void restarSaldo(){
        
        if(!v.confirmacontraseña.getText().isEmpty()){
            try{
                baseDatos.conectar();
        
                int valoractual = Integer.parseInt(baseDatos.consultarSaldo(usuario));
                int valorretiro = Integer.parseInt(v.valorretiro.getText());
                int valornuevo = valoractual-valorretiro;
                if(valornuevo <= 0){
                    JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                } else if(valorretiro > valoractual) {
                    JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
                } else if (valorretiro > 5000000) {
                    JOptionPane.showMessageDialog(null, "Saldo Inválido");
                }else {
                    baseDatos.actualizarSaldo(usuario, valornuevo);    
                }
        
                baseDatos.cerrar();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ingrese Datos");
            }
        } else {
                JOptionPane.showMessageDialog(null, "Ingrese Datos");
        }

    }
    
    private void validacionAceptar(){
        if(!v.valorretiro.getText().isEmpty()){
            try{
                /*Magic tricks*/
                /*Desaparecer pantalla inicial*/
                v.fondo.setVisible(false);
                v.valorretiro.setVisible(false);
                v.buttonx0_1.setVisible(false);
                v.buttonx1_1.setVisible(false);
                v.buttonx2_1.setVisible(false);
                v.buttonx3_1.setVisible(false);
                v.buttonx4_1.setVisible(false);
                v.buttonx5_1.setVisible(false);
                v.buttonx6_1.setVisible(false);
                v.buttonx7_1.setVisible(false);
                v.buttonx8_1.setVisible(false);
                v.buttonx9_1.setVisible(false);
                v.buttonxcancel_1.setVisible(false);
                v.aceptar.setVisible(false);
                /*Fin Desaparecer pantalla inicial*/
                /* ----------------------------- */
                /* Hacer aparecer la ventana de confirmacion */
                v.fondo2.setVisible(true);
                v.confirmacontraseña.setVisible(true);
                v.buttonx0.setVisible(true);
                v.buttonx1.setVisible(true);
                v.buttonx2.setVisible(true);
                v.buttonx3.setVisible(true);
                v.buttonx4.setVisible(true);
                v.buttonx5.setVisible(true);
                v.buttonx6.setVisible(true);
                v.buttonx7.setVisible(true);
                v.buttonx8.setVisible(true);
                v.buttonx9.setVisible(true);
                v.buttonxABC.setVisible(true);
                v.buttonxcancel.setVisible(true);
                v.buttonxok.setVisible(true);
                v.valoraretirar_ventanaconfirmacion.setVisible(true);
           
            
            /* Fin Hacer aparecer la ventana de confirmacion */
            
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el monto");
        }
    }
    
    private void pasarValor(){
        v.valoraretirar_ventanaconfirmacion.setText(v.valorretiro.getText());
    }
    
    private void validarContraseña(){
        try {
                char[] ar = v.confirmacontraseña.getPassword();
                StringBuilder builder = new StringBuilder();
                for (char s : ar) {
                    builder.append(s);
                }

                String str = builder.toString();                                
                String clave = seguridad.get_SHA_256_SecurePassword(str);                
                
                baseDatos.conectar();
                if (baseDatos.ValidarContra(clave)) {
                    
                    restarSaldo();
                    JOptionPane.showMessageDialog(null, "Operación terminada con éxito");
                    v.dispose();
                    vistamenuprincipal mainmenu = new vistamenuprincipal();
                    controlmenuprincipal mainmenuc = new controlmenuprincipal(mainmenu,baseDatos,usuario);
                    System.out.println("conexion exitosa");

                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña invalida", "Error al verificar", 2);
                }
                baseDatos.cerrar();
            } catch (Exception exc) {
                JOptionPane.showMessageDialog(null, "Error", "Error", 2);
            }
    }

}
