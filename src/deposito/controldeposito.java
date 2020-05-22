/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deposito;

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
public class controldeposito implements ActionListener {

    vistadeposito v;
    ModeloBD bd;
    private int usuario;

    public controldeposito(vistadeposito vis, ModeloBD bd, int usuario) {
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

        if (e.getSource() == v.cerrarventanax) {
            System.exit(0);
        }

        if (e.getSource() == v.regresarx) {
            v.dispose();

            vistamenuprincipal mainmenu = new vistamenuprincipal();
            controlmenuprincipal mainmenuc = new controlmenuprincipal(mainmenu, bd, usuario);

        }

    }

}
