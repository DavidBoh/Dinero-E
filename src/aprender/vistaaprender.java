/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprender;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author herrboh
 */
public class vistaaprender extends JFrame {

    public JButton cerrarventanax;
    public JButton aceptar;
    public JButton regresarx;
    public JButton regresaraprender;

    public JButton ingresos;
    public JButton ahorros;
    public JButton interes;
    public JButton pensiones;

    public JLabel fondo;

    public JLabel labelahorro, labelinteres, labelpension, labelpresupuesto;

    public vistaaprender() {

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
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/APRENDE.jpg")));
        fondo.setBackground(new Color(72, 181, 232));

        labelahorro = new JLabel();
        labelahorro.setOpaque(true);
        labelahorro.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ahorrox.png")));
        labelahorro.setBackground(new Color(72, 181, 232));
        labelahorro.setVisible(false);

        labelinteres = new JLabel();
        labelinteres.setOpaque(true);
        labelinteres.setIcon(new ImageIcon(getClass().getResource("/Imagenes/interes_cx.png")));
        labelinteres.setBackground(new Color(72, 181, 232));
        labelinteres.setVisible(false);

        labelpension = new JLabel();
        labelpension.setOpaque(true);
        labelpension.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pensionx.png")));
        labelpension.setBackground(new Color(72, 181, 232));
        labelpension.setVisible(false);

        labelpresupuesto = new JLabel();
        labelpresupuesto.setOpaque(true);
        labelpresupuesto.setIcon(new ImageIcon(getClass().getResource("/Imagenes/presupuestox.png")));
        labelpresupuesto.setBackground(new Color(72, 181, 232));
        labelpresupuesto.setVisible(false);

        cerrarventanax = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cerrar.png")));
        cerrarventanax.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar_g.png")));
        cerrarventanax.setContentAreaFilled(false);
        cerrarventanax.setBorder(null);
        cerrarventanax.setCursor(new Cursor(HAND_CURSOR));

        aceptar = new JButton(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        aceptar.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_g.png")));
        aceptar.setContentAreaFilled(false);
        aceptar.setBorder(null);
        aceptar.setCursor(new Cursor(HAND_CURSOR));

        regresarx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/goback.png")));
        regresarx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/goback_g.png")));
        regresarx.setContentAreaFilled(false);
        regresarx.setBorder(null);
        regresarx.setCursor(new Cursor(HAND_CURSOR));

        regresaraprender = new JButton(new ImageIcon(getClass().getResource("/Imagenes/goback.png")));
        regresaraprender.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/goback_g.png")));
        regresaraprender.setContentAreaFilled(false);
        regresaraprender.setBorder(null);
        regresaraprender.setCursor(new Cursor(HAND_CURSOR));
        regresaraprender.setVisible(false);

        ingresos = new JButton(new ImageIcon(getClass().getResource("/Imagenes/moneda.png")));
        ingresos.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/moneda.png")));
        ingresos.setContentAreaFilled(false);
        ingresos.setBorder(null);
        ingresos.setCursor(new Cursor(HAND_CURSOR));

        ahorros = new JButton(new ImageIcon(getClass().getResource("/Imagenes/ahorro.png")));
        ahorros.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/ahorro.png")));
        ahorros.setContentAreaFilled(false);
        ahorros.setBorder(null);
        ahorros.setCursor(new Cursor(HAND_CURSOR));

        interes = new JButton(new ImageIcon(getClass().getResource("/Imagenes/calc.png")));
        interes.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/calc.png")));
        interes.setContentAreaFilled(false);
        interes.setBorder(null);
        interes.setCursor(new Cursor(HAND_CURSOR));

        pensiones = new JButton(new ImageIcon(getClass().getResource("/Imagenes/retiro.png")));
        pensiones.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/retiro.png")));
        pensiones.setContentAreaFilled(false);
        pensiones.setBorder(null);
        pensiones.setCursor(new Cursor(HAND_CURSOR));

    }

    private void localizar() {

        setLayout(null);

        fondo.setBounds(0, 0, 310, 546);

        labelahorro.setBounds(0, 0, 310, 546);
        labelinteres.setBounds(0, 0, 310, 546);
        labelpension.setBounds(0, 0, 310, 546);
        labelpresupuesto.setBounds(0, 0, 310, 546);

        cerrarventanax.setBounds(270, 10, 25, 25);

        regresarx.setBounds(20, 20, 47, 47);
        regresaraprender.setBounds(20, 490, 47, 47);

        ingresos.setBounds(30, 200, 80, 80);
        interes.setBounds(200, 200, 80, 80);

        pensiones.setBounds(200, 370, 80, 80);
        ahorros.setBounds(30, 370, 80, 80);

    }

    private void agregar() {

        add(cerrarventanax);
        add(regresarx);
        add(regresaraprender);
        add(aceptar);

        add(ingresos);
        add(ahorros);
        add(interes);
        add(pensiones);

        add(labelahorro);
        add(labelinteres);
        add(labelpension);
        add(labelpresupuesto);

        add(fondo);//siempre añadirlo al final

    }
}
