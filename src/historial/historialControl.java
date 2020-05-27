/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historial;

import Modelo.ModeloBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import menuprincipal.controlmenuprincipal;
import menuprincipal.vistamenuprincipal;

/**
 *
 * @author Christian
 */
public class historialControl implements ActionListener {

    historialVista v;
    private ModeloBD modeloBD;
    private int usuario;

    public historialControl(historialVista vis, ModeloBD bd, int usuario) {

        v = vis;
        this.modeloBD = bd;
        this.usuario = usuario;

        v.cerrarventanax.addActionListener(this);
        v.regresarx.addActionListener(this);

        historial();
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
            controlmenuprincipal mainmenuc = new controlmenuprincipal(mainmenu, modeloBD, usuario);
        }
    }

    private void historial() {
        ArrayList<String> datos = new ArrayList<>();
        modeloBD.conectar();
        try {
            datos = modeloBD.consultarHistorial(usuario);
            DefaultTableModel dtm = (DefaultTableModel) v.table.getModel();
            for (int i = 0; i < datos.size(); i += 5) {
                dtm.addRow(new Object[]{
                    datos.get(i),
                    datos.get(i + 1),
                    datos.get(i + 2),
                    datos.get(i + 3),
                    datos.get(i + 4),});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el Historial");
        }
        modeloBD.cerrar();
    }
}