/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprender;

import Modelo.ModeloBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import menuprincipal.controlmenuprincipal;
import menuprincipal.vistamenuprincipal;

/**
 *
 * @author herrboh
 */
public class controlaprender implements ActionListener {

    vistaaprender v;
    ModeloBD bd;
    private int usuario;

    public controlaprender(vistaaprender vis, ModeloBD bd, int usuario) {
        v = vis;
        this.bd = bd;
        this.usuario = usuario;
        v.cerrarventanax.addActionListener(this);
        v.regresarx.addActionListener(this);
        v.aceptar.addActionListener(this);

        v.ahorros.addActionListener(this);
        v.ingresos.addActionListener(this);
        v.pensiones.addActionListener(this);
        v.interes.addActionListener(this);
        v.regresaraprender.addActionListener(this);

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
            controlmenuprincipal mainmenuc = new controlmenuprincipal(mainmenu, bd, usuario);

        }

        if (e.getSource() == v.regresaraprender) {
            v.dispose();

            vistaaprender aprendevis = new vistaaprender();
            controlaprender aprendec = new controlaprender(aprendevis, bd, usuario);
        }

        if (e.getSource() == v.ahorros) {
            v.labelahorro.setVisible(true);
            v.regresaraprender.setVisible(true);

            v.fondo.setVisible(false);
            v.ahorros.setVisible(false);
            v.ingresos.setVisible(false);
            v.pensiones.setVisible(false);
            v.interes.setVisible(false);
            v.regresarx.setVisible(false);
        }

        if (e.getSource() == v.ingresos) {
            v.labelpresupuesto.setVisible(true);
            v.regresaraprender.setVisible(true);

            v.fondo.setVisible(false);
            v.ahorros.setVisible(false);
            v.ingresos.setVisible(false);
            v.pensiones.setVisible(false);
            v.interes.setVisible(false);
            v.regresarx.setVisible(false);
        }

        if (e.getSource() == v.pensiones) {
            v.labelpension.setVisible(true);
            v.regresaraprender.setVisible(true);

            v.fondo.setVisible(false);
            v.ahorros.setVisible(false);
            v.ingresos.setVisible(false);
            v.pensiones.setVisible(false);
            v.interes.setVisible(false);
            v.regresarx.setVisible(false);
        }

        if (e.getSource() == v.interes) {
            v.labelinteres.setVisible(true);
            v.regresaraprender.setVisible(true);

            v.fondo.setVisible(false);
            v.ahorros.setVisible(false);
            v.ingresos.setVisible(false);
            v.pensiones.setVisible(false);
            v.interes.setVisible(false);
            v.regresarx.setVisible(false);
        }

    }

}
