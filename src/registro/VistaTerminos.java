/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Christian
 */
public class VistaTerminos extends JFrame {

    public JButton cerrarventanax;
    public JLabel fondo;

    public VistaTerminos() {

        setSize(310, 546);
        setUndecorated(true);
        iniciar();
        localizar();
        agregar();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(3);

    }

    private void iniciar() {

        fondo = new JLabel();
        fondo.setOpaque(true);
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Terminos.jpg")));
        fondo.setBackground(new Color(72, 181, 232));

        cerrarventanax = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cerrar.png")));
        cerrarventanax.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar_g.png")));
        cerrarventanax.setContentAreaFilled(false);
        cerrarventanax.setBorder(null);
        cerrarventanax.setCursor(new Cursor(HAND_CURSOR));
    }

    private void localizar() {

        setLayout(null);
        fondo.setBounds(0, 0, 310, 546);
        cerrarventanax.setBounds(270, 10, 25, 25);

    }

    private void agregar() {
        add(cerrarventanax);        
        add(fondo);
    }
}
