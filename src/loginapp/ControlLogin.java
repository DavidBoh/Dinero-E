/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import Hash.Sha;

import registro.ControlRegistro;
import Modelo.ModeloBD;
import Modelo.limitadorCaracteres;
import registro.VentanaRegistro;
import menuprincipal.vistamenuprincipal;
import menuprincipal.controlmenuprincipal;
import restablecimiento.controlrestablecimiento;
import restablecimiento.vistarestablecimiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author herrboh
 */
public class ControlLogin implements ActionListener {

    private VistaLogin v;
    private ModeloBD baseDatos;
    private Sha seguridad = new Sha();
    private ArrayList<limitadorCaracteres> limitadores = new ArrayList<limitadorCaracteres>();
    private int limitadorContra = 0;
    private char echoPass;
    private boolean banderaPass = true;

    public ControlLogin(ModeloBD baseDatos, VistaLogin vis) {

        this.v = vis;
        this.baseDatos = baseDatos;
        this.echoPass = v.pContra.getEchoChar();
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

        v.buttonxok.addActionListener(this);
        v.buttonxcancel.addActionListener(this);
        v.verContraseña.addActionListener(this);
        v.botonCerrar.addActionListener(this);

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

        v.tIdentificacion.addActionListener(this);

        v.usuarionuevo.addActionListener(this);
        v.restablecer.addActionListener(this);

        limiteCaracteres(v);
        limiteContrasena();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

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
        
        if (e.getSource() == v.verContraseña) {
            if (banderaPass) { 
                v.pContra.setEchoChar((char) 0);
                banderaPass = false;
            } else {
                v.pContra.setEchoChar(echoPass);
                banderaPass = true;
            }
        }

        if (e.getSource() == v.restablecer) {
            v.dispose();

            vistarestablecimiento restab = new vistarestablecimiento();
            controlrestablecimiento controlre = new controlrestablecimiento(restab);
        }

        if (e.getSource() == v.usuarionuevo) {

            v.dispose();

            VentanaRegistro r = new VentanaRegistro();
            ModeloBD bd = new ModeloBD();
            ControlRegistro ct = new ControlRegistro(r, bd);

        }

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

        if (e.getSource() == v.botonCerrar) {
            System.exit(0);
        }

        if (e.getSource() == v.buttonx1 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "1");
        }

        if (e.getSource() == v.buttonx2 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "2");
        }

        if (e.getSource() == v.buttonx3 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "3");
        }

        if (e.getSource() == v.buttonx4 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "4");
        }

        if (e.getSource() == v.buttonx5 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "5");
        }

        if (e.getSource() == v.buttonx6 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "6");
        }

        if (e.getSource() == v.buttonx7 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "7");
        }

        if (e.getSource() == v.buttonx8 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "8");
        }

        if (e.getSource() == v.buttonx9 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "9");
        }

        if (e.getSource() == v.buttonx0 && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "0");
        }

        if (e.getSource() == v.buttonxcancel) {
            v.pContra.setText(null);
            limitadorContra = 0;
        }

        if (e.getSource() == v.buttonxa && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "a");
        }

        if (e.getSource() == v.buttonxb && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "b");
        }

        if (e.getSource() == v.buttonxc && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "c");
        }

        if (e.getSource() == v.buttonxd && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "d");
        }

        if (e.getSource() == v.buttonxe && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "e");
        }

        if (e.getSource() == v.buttonxf && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "f");
        }

        if (e.getSource() == v.buttonxg && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "g");
        }

        if (e.getSource() == v.buttonxh && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "h");
        }

        if (e.getSource() == v.buttonxi && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "i");
        }

        if (e.getSource() == v.buttonxj && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "j");
        }

        if (e.getSource() == v.buttonxk && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "k");
        }

        if (e.getSource() == v.buttonxl && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "l");
        }

        if (e.getSource() == v.buttonxm && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "m");
        }

        if (e.getSource() == v.buttonxn && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "n");
        }

        if (e.getSource() == v.buttonxñ && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "ñ");
        }

        if (e.getSource() == v.buttonxo && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "o");
        }

        if (e.getSource() == v.buttonxp && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "p");
        }

        if (e.getSource() == v.buttonxq && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "q");
        }

        if (e.getSource() == v.buttonxr && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "r");
        }

        if (e.getSource() == v.buttonxs && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "s");
        }

        if (e.getSource() == v.buttonxt && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "t");
        }

        if (e.getSource() == v.buttonxu && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "u");
        }

        if (e.getSource() == v.buttonxv && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "v");
        }

        if (e.getSource() == v.buttonxw && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "w");
        }

        if (e.getSource() == v.buttonxx && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "x");
        }

        if (e.getSource() == v.buttonxy && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "y");
        }

        if (e.getSource() == v.buttonxz && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "z");
        }

        if (e.getSource() == v.buttonxA && limitadorContra < 15) {
            v.pContra.setText(v.pContra.getText() + "A");
        }

        if (e.getSource() == v.buttonxB && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "B");
        }
        if (e.getSource() == v.buttonxC && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "C");
        }
        if (e.getSource() == v.buttonxD && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "D");
        }
        if (e.getSource() == v.buttonxE && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "E");
        }
        if (e.getSource() == v.buttonxF && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "F");
        }
        if (e.getSource() == v.buttonxG && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "G");
        }
        if (e.getSource() == v.buttonxH && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "H");
        }
        if (e.getSource() == v.buttonxI && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "I");
        }
        if (e.getSource() == v.buttonxJ && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "J");
        }
        if (e.getSource() == v.buttonxK && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "K");
        }
        if (e.getSource() == v.buttonxL && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "L");
        }
        if (e.getSource() == v.buttonxM && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "M");
        }
        if (e.getSource() == v.buttonxN && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "N");
        }
        if (e.getSource() == v.buttonxÑ && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "Ñ");
        }
        if (e.getSource() == v.buttonxO && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "O");
        }
        if (e.getSource() == v.buttonxP && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "P");
        }
        if (e.getSource() == v.buttonxQ && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "Q");
        }
        if (e.getSource() == v.buttonxR && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "R");
        }
        if (e.getSource() == v.buttonxS && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "S");
        }
        if (e.getSource() == v.buttonxT && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "T");
        }
        if (e.getSource() == v.buttonxU && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "U");
        }
        if (e.getSource() == v.buttonxV && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "V");
        }
        if (e.getSource() == v.buttonxW && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "W");
        }
        if (e.getSource() == v.buttonxX && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "X");
        }
        if (e.getSource() == v.buttonxY && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "Y");
        }
        if (e.getSource() == v.buttonxZ && limitadorContra < 15) {

            v.pContra.setText(v.pContra.getText() + "Z");
        }
        
       if (e.getSource() == v.buttonxok) {

            try {
                char[] ar = v.pContra.getPassword();
                StringBuilder builder = new StringBuilder();
                for (char s : ar) {
                    builder.append(s);
                }

                String str = builder.toString();                                
                String clave = seguridad.get_SHA_256_SecurePassword(str);                
                int identificacion = Integer.parseInt(v.tIdentificacion.getText());
                baseDatos.conectar();
                if (baseDatos.ValidarU(identificacion, clave)) {
                    // aqui va el llamado a la ventana principal
                    v.dispose();
                    int usuario = baseDatos.identificador(identificacion, clave);
                    vistamenuprincipal mainmenu = new vistamenuprincipal();
                    controlmenuprincipal mainmenuc = new controlmenuprincipal(mainmenu,baseDatos,usuario);
                    System.out.println("conexion exitosa");

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos", "Error login", 2);
                }
                baseDatos.cerrar();
            } catch (Exception exc) {
                JOptionPane.showMessageDialog(null, "Error de Login", "Error", 2);
            }
        }
    }

    private void limiteCaracteres(VistaLogin v) {
        limitadores.add(new limitadorCaracteres(v.tIdentificacion, 10,2));
        limitadores.add(new limitadorCaracteres(v.pContra, 15,4));
    }
    
     private void limiteContrasena() {
        v.pContra.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (e.getDocument().getLength() <= 15) {
                    limitadorContra++;
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
    }

}
