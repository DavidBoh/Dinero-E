/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retiro;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import text.TextPrompt;

/**
 *
 * @author herrboh
 */
public class vistaretiro extends JFrame {
    
    /*Inicio ventana inicial */
    public JButton aceptar;
    public JButton buttonx1_1;
    public JButton buttonx2_1;
    public JButton buttonx3_1;
    public JButton buttonx4_1;
    public JButton buttonx5_1;
    public JButton buttonx6_1;
    public JButton buttonx7_1;
    public JButton buttonx8_1;
    public JButton buttonx9_1;
    public JButton buttonx0_1;
    public JButton buttonxcancel_1;
    public JTextField valorretiro;
    private TextPrompt valorretiroT;
    
    public JLabel fondo;
   
    /*Fin ventana inicial */
    /*Inicio ventana confirmar */
    
    public JLabel valoraretirar_ventanaconfirmacion;

    public JPasswordField confirmacontraseña;
    private TextPrompt confirmacontraseñaT;
    
    public JLabel fondo2;
    
    public JButton buttonx1;
    public JButton buttonx2;
    public JButton buttonx3;
    public JButton buttonx4;
    public JButton buttonx5;
    public JButton buttonx6;
    public JButton buttonx7;
    public JButton buttonx8;
    public JButton buttonx9;
    public JButton buttonx0;
    public JButton buttonxok;
    public JButton buttonxcancel;
    public JButton buttonxa;
    public JButton buttonxb;
    public JButton buttonxc;
    public JButton buttonxd;
    public JButton buttonxe;
    public JButton buttonxf;
    public JButton buttonxg;
    public JButton buttonxh;
    public JButton buttonxi;
    public JButton buttonxj;
    public JButton buttonxk;
    public JButton buttonxl;
    public JButton buttonxm;
    public JButton buttonxñ;
    public JButton buttonxo;
    public JButton buttonxp;
    public JButton buttonxq;
    public JButton buttonxr;
    public JButton buttonxs;
    public JButton buttonxt;
    public JButton buttonxu;
    public JButton buttonxv;
    public JButton buttonxw;
    public JButton buttonxx;
    public JButton buttonxy;
    public JButton buttonxz;
    public JButton buttonxn;
    public JButton buttonxA;
    public JButton buttonxB;
    public JButton buttonxC;
    public JButton buttonxD;
    public JButton buttonxE;
    public JButton buttonxF;
    public JButton buttonxG;
    public JButton buttonxH;
    public JButton buttonxI;
    public JButton buttonxJ;
    public JButton buttonxK;
    public JButton buttonxL;
    public JButton buttonxM;
    public JButton buttonxÑ;
    public JButton buttonxN;
    public JButton buttonxO;
    public JButton buttonxP;
    public JButton buttonxR;
    public JButton buttonxS;
    public JButton buttonxT;
    public JButton buttonxU;
    public JButton buttonxV;
    public JButton buttonxW;
    public JButton buttonxX;
    public JButton buttonxY;
    public JButton buttonxZ;
    public JButton buttonxQ;
    public JButton buttonxABC;
    public JButton buttonx123;
    public JButton mayus;
    public JButton minus;
    
    /*Fin ventana confirmar */
    
    
    public JButton cerrarventanax;
    
    public JButton regresarx;
    
    
    
    
    public vistaretiro(){
        
        setSize(310,546);
        setUndecorated(true);
        iniciar();
        localizar();
        agregar();       
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(3);
        
    }
    
    private void iniciar(){
        
        /* Inicio ventana original*/
        fondo = new JLabel();
        fondo.setOpaque(true);
        fondo.setIcon(new ImageIcon(getClass().getResource("/Imagenes/RETIRA.jpg")));
        fondo.setBackground(new Color(72, 181, 232));
        
        buttonx1_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/1small.png")));
        buttonx1_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/1big.png")));
        buttonx1_1.setContentAreaFilled(false);
        buttonx1_1.setBorder(null);
        buttonx1_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx2_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/2small.png")));
        buttonx2_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/2big.png")));
        buttonx2_1.setContentAreaFilled(false);
        buttonx2_1.setBorder(null);
        buttonx2_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx3_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/3small.png")));
        buttonx3_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/3big.png")));
        buttonx3_1.setContentAreaFilled(false);
        buttonx3_1.setBorder(null);
        buttonx3_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx4_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/4small.png")));
        buttonx4_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/4big.png")));
        buttonx4_1.setContentAreaFilled(false);
        buttonx4_1.setBorder(null);
        buttonx4_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx5_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/5small.png")));
        buttonx5_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/5big.png")));
        buttonx5_1.setContentAreaFilled(false);
        buttonx5_1.setBorder(null);
        buttonx5_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx6_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/6small.png")));
        buttonx6_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/6big.png")));
        buttonx6_1.setContentAreaFilled(false);
        buttonx6_1.setBorder(null);
        buttonx6_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx7_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/7small.png")));
        buttonx7_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/7big.png")));
        buttonx7_1.setContentAreaFilled(false);
        buttonx7_1.setBorder(null);
        buttonx7_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx8_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/8small.png")));
        buttonx8_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/8big.png")));
        buttonx8_1.setContentAreaFilled(false);
        buttonx8_1.setBorder(null);
        buttonx8_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx9_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/9small.png")));
        buttonx9_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/9big.png")));
        buttonx9_1.setContentAreaFilled(false);
        buttonx9_1.setBorder(null);
        buttonx9_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx0_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/0small.png")));
        buttonx0_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/0big.png")));
        buttonx0_1.setContentAreaFilled(false);
        buttonx0_1.setBorder(null);
        buttonx0_1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxcancel_1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cancelsmall.png")));
        buttonxcancel_1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cancelbig.png")));
        buttonxcancel_1.setContentAreaFilled(false);
        buttonxcancel_1.setBorder(null);
        buttonxcancel_1.setCursor(new Cursor(HAND_CURSOR));
        
      
        
        aceptar = new JButton(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        aceptar.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_g.png")));
        aceptar.setContentAreaFilled(false);
        aceptar.setBorder(null);
        aceptar.setCursor(new Cursor(HAND_CURSOR));
        
        valorretiro = new JTextField(6);
        valorretiro.setOpaque(false);
        valorretiro.setBorder(null);
        valorretiroT = new TextPrompt("Monto a retirar", valorretiro); 
        valorretiro.setEditable(false);
        valorretiro.setFocusable(false);
        
        
        /* Fin ventana original*/
 
        /* ************************** */
        
        /* Inicio ventana confirmar */
        
        fondo2 = new JLabel();
        fondo2.setOpaque(true);
        fondo2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/CONFIRMA_RETIRA.jpg")));
        fondo2.setBackground(new Color(72, 181, 232));
        fondo2.setVisible(false);
        
        valoraretirar_ventanaconfirmacion = new JLabel(" xxx ");
        valoraretirar_ventanaconfirmacion.setVisible(false);
        valoraretirar_ventanaconfirmacion.setFont(new Font("Serif", Font.PLAIN, 15)); 
        
        confirmacontraseña = new JPasswordField();
        confirmacontraseña.setOpaque(false);
        confirmacontraseña.setBorder(null);
        confirmacontraseñaT = new TextPrompt("Contraseña", confirmacontraseña); 
        confirmacontraseña.setEditable(false);
        confirmacontraseña.setFocusable(false);
        confirmacontraseña.setVisible(false);
        
        buttonx1 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/1small.png")));
        buttonx1.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/1big.png")));
        buttonx1.setContentAreaFilled(false);
        buttonx1.setBorder(null);
        buttonx1.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx2 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/2small.png")));
        buttonx2.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/2big.png")));
        buttonx2.setContentAreaFilled(false);
        buttonx2.setBorder(null);
        buttonx2.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx3 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/3small.png")));
        buttonx3.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/3big.png")));
        buttonx3.setContentAreaFilled(false);
        buttonx3.setBorder(null);
        buttonx3.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx4 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/4small.png")));
        buttonx4.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/4big.png")));
        buttonx4.setContentAreaFilled(false);
        buttonx4.setBorder(null);
        buttonx4.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx5 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/5small.png")));
        buttonx5.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/5big.png")));
        buttonx5.setContentAreaFilled(false);
        buttonx5.setBorder(null);
        buttonx5.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx6 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/6small.png")));
        buttonx6.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/6big.png")));
        buttonx6.setContentAreaFilled(false);
        buttonx6.setBorder(null);
        buttonx6.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx7 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/7small.png")));
        buttonx7.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/7big.png")));
        buttonx7.setContentAreaFilled(false);
        buttonx7.setBorder(null);
        buttonx7.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx8 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/8small.png")));
        buttonx8.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/8big.png")));
        buttonx8.setContentAreaFilled(false);
        buttonx8.setBorder(null);
        buttonx8.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx9 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/9small.png")));
        buttonx9.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/9big.png")));
        buttonx9.setContentAreaFilled(false);
        buttonx9.setBorder(null);
        buttonx9.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx0 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/0small.png")));
        buttonx0.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/0big.png")));
        buttonx0.setContentAreaFilled(false);
        buttonx0.setBorder(null);
        buttonx0.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxABC = new JButton(new ImageIcon(getClass().getResource("/Imagenes/abcsmall.png")));
        buttonxABC.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/abcbig.png")));
        buttonxABC.setContentAreaFilled(false);
        buttonxABC.setBorder(null);
        buttonxABC.setCursor(new Cursor(HAND_CURSOR));
        
        buttonx123 = new JButton(new ImageIcon(getClass().getResource("/Imagenes/123small.png")));
        buttonx123.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/123big.png")));
        buttonx123.setContentAreaFilled(false);
        buttonx123.setBorder(null);
        buttonx123.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxok = new JButton(new ImageIcon(getClass().getResource("/Imagenes/boton.png")));
        buttonxok.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/boton_g.png")));
        buttonxok.setContentAreaFilled(false);
        buttonxok.setBorder(null);
        buttonxok.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxcancel = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cancelsmall.png")));
        buttonxcancel.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cancelbig.png")));
        buttonxcancel.setContentAreaFilled(false);
        buttonxcancel.setBorder(null);
        buttonxcancel.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxa = new JButton(new ImageIcon(getClass().getResource("/Imagenes/asmall.png")));
        buttonxa.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/abig.png")));
        buttonxa.setContentAreaFilled(false);
        buttonxa.setBorder(null);
        buttonxa.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxb = new JButton(new ImageIcon(getClass().getResource("/Imagenes/bsmall.png")));
        buttonxb.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/bbig.png")));
        buttonxb.setContentAreaFilled(false);
        buttonxb.setBorder(null);
        buttonxb.setCursor(new Cursor(HAND_CURSOR));
        
        
        
        buttonxc = new JButton(new ImageIcon(getClass().getResource("/Imagenes/csmall.png")));
        buttonxc.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cbig.png")));
        buttonxc.setContentAreaFilled(false);
        buttonxc.setBorder(null);
        buttonxc.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxd = new JButton(new ImageIcon(getClass().getResource("/Imagenes/dsmall.png")));
        buttonxd.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/dbig.png")));
        buttonxd.setContentAreaFilled(false);
        buttonxd.setBorder(null);
        buttonxd.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxe = new JButton(new ImageIcon(getClass().getResource("/Imagenes/esmall.png")));
        buttonxe.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/ebig.png")));
        buttonxe.setContentAreaFilled(false);
        buttonxe.setBorder(null);
        buttonxe.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxf = new JButton(new ImageIcon(getClass().getResource("/Imagenes/fsmall.png")));
        buttonxf.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/fbig.png")));
        buttonxf.setContentAreaFilled(false);
        buttonxf.setBorder(null);
        buttonxf.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxg = new JButton(new ImageIcon(getClass().getResource("/Imagenes/gsmall.png")));
        buttonxg.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/gbig.png")));
        buttonxg.setContentAreaFilled(false);
        buttonxg.setBorder(null);
        buttonxg.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxh = new JButton(new ImageIcon(getClass().getResource("/Imagenes/hsmall.png")));
        buttonxh.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/hbig.png")));
        buttonxh.setContentAreaFilled(false);
        buttonxh.setBorder(null);
        buttonxh.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxi = new JButton(new ImageIcon(getClass().getResource("/Imagenes/ismall.png")));
        buttonxi.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/ibig.png")));
        buttonxi.setContentAreaFilled(false);
        buttonxi.setBorder(null);
        buttonxi.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxj = new JButton(new ImageIcon(getClass().getResource("/Imagenes/jsmall.png")));
        buttonxj.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/jbig.png")));
        buttonxj.setContentAreaFilled(false);
        buttonxj.setBorder(null);
        buttonxj.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxk = new JButton(new ImageIcon(getClass().getResource("/Imagenes/ksmall.png")));
        buttonxk.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/kbig.png")));
        buttonxk.setContentAreaFilled(false);
        buttonxk.setBorder(null);
        buttonxk.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxl = new JButton(new ImageIcon(getClass().getResource("/Imagenes/lsmall.png")));
        buttonxl.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/lbig.png")));
        buttonxl.setContentAreaFilled(false);
        buttonxl.setBorder(null);
        buttonxl.setCursor(new Cursor(HAND_CURSOR));
        
        
        
        buttonxm = new JButton(new ImageIcon(getClass().getResource("/Imagenes/msmall.png")));
        buttonxm.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/mbig.png")));
        buttonxm.setContentAreaFilled(false);
        buttonxm.setBorder(null);
        buttonxm.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxñ = new JButton(new ImageIcon(getClass().getResource("/Imagenes/ñsmall.png")));
        buttonxñ.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/ñbig.png")));
        buttonxñ.setContentAreaFilled(false);
        buttonxñ.setBorder(null);
        buttonxñ.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxn = new JButton(new ImageIcon(getClass().getResource("/Imagenes/nsmall.png")));
        buttonxn.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/nbig.png")));
        buttonxn.setContentAreaFilled(false);
        buttonxn.setBorder(null);
        buttonxn.setCursor(new Cursor(HAND_CURSOR));
        
        
        
        buttonxo = new JButton(new ImageIcon(getClass().getResource("/Imagenes/osmall.png")));
        buttonxo.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/obig.png")));
        buttonxo.setContentAreaFilled(false);
        buttonxo.setBorder(null);
        buttonxo.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxp = new JButton(new ImageIcon(getClass().getResource("/Imagenes/psmall.png")));
        buttonxp.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/pbig.png")));
        buttonxp.setContentAreaFilled(false);
        buttonxp.setBorder(null);
        buttonxp.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxq = new JButton(new ImageIcon(getClass().getResource("/Imagenes/qsmall.png")));
        buttonxq.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/qbig.png")));
        buttonxq.setContentAreaFilled(false);
        buttonxq.setBorder(null);
        buttonxq.setCursor(new Cursor(HAND_CURSOR));
        
        
        
        buttonxr = new JButton(new ImageIcon(getClass().getResource("/Imagenes/rsmall.png")));
        buttonxr.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/rbig.png")));
        buttonxr.setContentAreaFilled(false);
        buttonxr.setBorder(null);
        buttonxr.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxs = new JButton(new ImageIcon(getClass().getResource("/Imagenes/ssmall.png")));
        buttonxs.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/sbig.png")));
        buttonxs.setContentAreaFilled(false);
        buttonxs.setBorder(null);
        buttonxs.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxt = new JButton(new ImageIcon(getClass().getResource("/Imagenes/tsmall.png")));
        buttonxt.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/tbig.png")));
        buttonxt.setContentAreaFilled(false);
        buttonxt.setBorder(null);
        buttonxt.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxu = new JButton(new ImageIcon(getClass().getResource("/Imagenes/usmall.png")));
        buttonxu.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/ubig.png")));
        buttonxu.setContentAreaFilled(false);
        buttonxu.setBorder(null);
        buttonxu.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxv = new JButton(new ImageIcon(getClass().getResource("/Imagenes/vsmall.png")));
        buttonxv.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/vbig.png")));
        buttonxv.setContentAreaFilled(false);
        buttonxv.setBorder(null);
        buttonxv.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxw = new JButton(new ImageIcon(getClass().getResource("/Imagenes/wsmall.png")));
        buttonxw.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/wbig.png")));
        buttonxw.setContentAreaFilled(false);
        buttonxw.setBorder(null);
        buttonxw.setCursor(new Cursor(HAND_CURSOR));
        
        
        
        buttonxx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/xsmall.png")));
        buttonxx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/xbig.png")));
        buttonxx.setContentAreaFilled(false);
        buttonxx.setBorder(null);
        buttonxx.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxy = new JButton(new ImageIcon(getClass().getResource("/Imagenes/ysmall.png")));
        buttonxy.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/ybig.png")));
        buttonxy.setContentAreaFilled(false);
        buttonxy.setBorder(null);
        buttonxy.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxz = new JButton(new ImageIcon(getClass().getResource("/Imagenes/zsmall.png")));
        buttonxz.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/zbig.png")));
        buttonxz.setContentAreaFilled(false);
        buttonxz.setBorder(null);
        buttonxz.setCursor(new Cursor(HAND_CURSOR));
        
        mayus = new JButton(new ImageIcon(getClass().getResource("/Imagenes/upsmall.png")));
        mayus.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/upbig.png")));
        mayus.setContentAreaFilled(false);
        mayus.setBorder(null);
        mayus.setCursor(new Cursor(HAND_CURSOR));
        
        minus = new JButton(new ImageIcon(getClass().getResource("/Imagenes/upsmall.png")));
        minus.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/upbig.png")));
        minus.setContentAreaFilled(false);
        minus.setBorder(null);
        minus.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxA = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Asmall.png")));
        buttonxA.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Abig.png")));
        buttonxA.setContentAreaFilled(false);
        buttonxA.setBorder(null);
        buttonxA.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxB = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Bsmall.png")));
        buttonxB.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Bbig.png")));
        buttonxB.setContentAreaFilled(false);
        buttonxB.setBorder(null);
        buttonxB.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxC = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Csmall.png")));
        buttonxC.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Cbig.png")));
        buttonxC.setContentAreaFilled(false);
        buttonxC.setBorder(null);
        buttonxC.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxD = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Dsmall.png")));
        buttonxD.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Dbig.png")));
        buttonxD.setContentAreaFilled(false);
        buttonxD.setBorder(null);
        buttonxD.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxE = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Esmall.png")));
        buttonxE.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Ebig.png")));
        buttonxE.setContentAreaFilled(false);
        buttonxE.setBorder(null);
        buttonxE.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxF = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Fsmall.png")));
        buttonxF.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Fbig.png")));
        buttonxF.setContentAreaFilled(false);
        buttonxF.setBorder(null);
        buttonxF.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxG = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Gsmall.png")));
        buttonxG.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Gbig.png")));
        buttonxG.setContentAreaFilled(false);
        buttonxG.setBorder(null);
        buttonxG.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxH = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Hsmall.png")));
        buttonxH.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Hbig.png")));
        buttonxH.setContentAreaFilled(false);
        buttonxH.setBorder(null);
        buttonxH.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxI = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Ismall.png")));
        buttonxI.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Ibig.png")));
        buttonxI.setContentAreaFilled(false);
        buttonxI.setBorder(null);
        buttonxI.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxJ = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Jsmall.png")));
        buttonxJ.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Jbig.png")));
        buttonxJ.setContentAreaFilled(false);
        buttonxJ.setBorder(null);
        buttonxJ.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxK = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Ksmall.png")));
        buttonxK.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Kbig.png")));
        buttonxK.setContentAreaFilled(false);
        buttonxK.setBorder(null);
        buttonxK.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxL = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Lsmall.png")));
        buttonxL.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Lbig.png")));
        buttonxL.setContentAreaFilled(false);
        buttonxL.setBorder(null);
        buttonxL.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxM = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Msmall.png")));
        buttonxM.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Mbig.png")));
        buttonxM.setContentAreaFilled(false);
        buttonxM.setBorder(null);
        buttonxM.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxN = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Nsmall.png")));
        buttonxN.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Nbig.png")));
        buttonxN.setContentAreaFilled(false);
        buttonxN.setBorder(null);
        buttonxN.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxÑ = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Ñsmall.png")));
        buttonxÑ.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Ñbig.png")));
        buttonxÑ.setContentAreaFilled(false);
        buttonxÑ.setBorder(null);
        buttonxÑ.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxO = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Osmall.png")));
        buttonxO.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Obig.png")));
        buttonxO.setContentAreaFilled(false);
        buttonxO.setBorder(null);
        buttonxO.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxP = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Psmall.png")));
        buttonxP.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Pbig.png")));
        buttonxP.setContentAreaFilled(false);
        buttonxP.setBorder(null);
        buttonxP.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxQ = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Qsmall.png")));
        buttonxQ.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Qbig.png")));
        buttonxQ.setContentAreaFilled(false);
        buttonxQ.setBorder(null);
        buttonxQ.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxR = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Rsmall.png")));
        buttonxR.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Rbig.png")));
        buttonxR.setContentAreaFilled(false);
        buttonxR.setBorder(null);
        buttonxR.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxS = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Small.png")));
        buttonxS.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Sbig.png")));
        buttonxS.setContentAreaFilled(false);
        buttonxS.setBorder(null);
        buttonxS.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxT = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Tsmall.png")));
        buttonxT.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Tbig.png")));
        buttonxT.setContentAreaFilled(false);
        buttonxT.setBorder(null);
        buttonxT.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxU = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Usmall.png")));
        buttonxU.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Ubig.png")));
        buttonxU.setContentAreaFilled(false);
        buttonxU.setBorder(null);
        buttonxU.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxV = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Vsmall.png")));
        buttonxV.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Vbig.png")));
        buttonxV.setContentAreaFilled(false);
        buttonxV.setBorder(null);
        buttonxV.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxW = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Wsmall.png")));
        buttonxW.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Wbig.png")));
        buttonxW.setContentAreaFilled(false);
        buttonxW.setBorder(null);
        buttonxW.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxX = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Xsmall.png")));
        buttonxX.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Xbig.png")));
        buttonxX.setContentAreaFilled(false);
        buttonxX.setBorder(null);
        buttonxX.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxY = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Ysmall.png")));
        buttonxY.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Ybig.png")));
        buttonxY.setContentAreaFilled(false);
        buttonxY.setBorder(null);
        buttonxY.setCursor(new Cursor(HAND_CURSOR));
        
        buttonxZ = new JButton(new ImageIcon(getClass().getResource("/Imagenes/Zsmall.png")));
        buttonxZ.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/Zbig.png")));
        buttonxZ.setContentAreaFilled(false);
        buttonxZ.setBorder(null);
        buttonxZ.setCursor(new Cursor(HAND_CURSOR));
        
        
        /* Fin ventana confirmar*/
        

        cerrarventanax = new JButton(new ImageIcon(getClass().getResource("/Imagenes/cerrar.png")));
        cerrarventanax.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar_g.png")));
        cerrarventanax.setContentAreaFilled(false);
        cerrarventanax.setBorder(null);
        cerrarventanax.setCursor(new Cursor(HAND_CURSOR));

        regresarx = new JButton(new ImageIcon(getClass().getResource("/Imagenes/goback.png")));
        regresarx.setRolloverIcon(new ImageIcon(getClass().getResource("/Imagenes/goback_g.png")));
        regresarx.setContentAreaFilled(false);
        regresarx.setBorder(null);
        regresarx.setCursor(new Cursor(HAND_CURSOR));
        

    }
    
    private void localizar(){
        
        setLayout(null);
        
        /* Inicio ventana inicial*/
        fondo.setBounds(0,0,310,546);
        aceptar.setBounds(129, 465, 47, 47);
        
        buttonx1_1.setBounds(90,280,40,40);
        buttonx2_1.setBounds(130,280,40,40);
        buttonx3_1.setBounds(170,280,40,40);
        
        buttonx4_1.setBounds(90,320,40,40);
        buttonx5_1.setBounds(130,320,40,40);
        buttonx6_1.setBounds(170,320,40,40);
        
        buttonx7_1.setBounds(90,360,40,40);
        buttonx8_1.setBounds(130,360,40,40);
        buttonx9_1.setBounds(170,360,40,40);
        buttonx0_1.setBounds(130,400,40,40);
        
        buttonxcancel_1.setBounds(90,400,40,40);
        
        valorretiro.setBounds(109, 214, 125, 30);
        /* Fin ventana inicial*/
        
        /* --------------------- */
        
        /* Inicio ventana confirmar*/
        buttonx1.setBounds(90,320,40,40);
        buttonx2.setBounds(130,320,40,40);
        buttonx3.setBounds(170,320,40,40);
        
        buttonx4.setBounds(90,360,40,40);
        buttonx5.setBounds(130,360,40,40);
        buttonx6.setBounds(170,360,40,40);
        
        buttonx7.setBounds(90,400,40,40);
        buttonx8.setBounds(130,400,40,40);
        buttonx9.setBounds(170,400,40,40);
        buttonx0.setBounds(130,440,40,40);
        
        buttonxABC.setBounds(200,381,80,80);

        buttonxok.setBounds(170,440,45,45);
        
        buttonxcancel.setBounds(90,440,40,40);

        buttonxa.setBounds(55,320,40,40);      
        buttonxb.setBounds(90,320,40,40);
        buttonxc.setBounds(125,320,40,40);
        buttonxd.setBounds(160,320,40,40);
        buttonxe.setBounds(195,320,40,40);
        
        buttonxf.setBounds(55,360,40,40); 
        buttonxg.setBounds(90,360,40,40);
        buttonxh.setBounds(125,360,40,40);
        buttonxi.setBounds(160,360,40,40);
        buttonxj.setBounds(195,360,40,40);
 
        buttonxk.setBounds(55,400,40,40);
        buttonxl.setBounds(90,400,40,40);
        buttonxm.setBounds(125,400,40,40);
        buttonxn.setBounds(160,400,40,40);
        buttonxñ.setBounds(195,400,40,40);
        
        buttonxo.setBounds(55,440,40,40);
        buttonxp.setBounds(90,440,40,40);
        buttonxq.setBounds(125,440,40,40);
        buttonxr.setBounds(160,440,40,40);
        buttonxs.setBounds(195,440,40,40);
        buttonxt.setBounds(230,440,40,40);
        
        buttonxu.setBounds(55,480,40,40);
        buttonxv.setBounds(90,480,40,40);
        buttonxw.setBounds(125,480,40,40);
        buttonxx.setBounds(160,480,40,40);
        buttonxy.setBounds(195,480,40,40);
        buttonxz.setBounds(230,480,40,40);
        
        buttonx123.setBounds(220,330,80,80);
        mayus.setBounds(220,380,80,80);
        minus.setBounds(220,380,80,80);
        
 
        buttonxA.setBounds(51,320,40,40);
        buttonxB.setBounds(90,320,40,40);
        buttonxC.setBounds(125,320,40,40);
        buttonxD.setBounds(160,320,40,40);
        buttonxE.setBounds(195,320,40,40);

        buttonxF.setBounds(55,360,40,40);
        buttonxG.setBounds(90,360,40,40);
        buttonxH.setBounds(125,360,40,40);
        buttonxI.setBounds(160,360,40,40);
        buttonxJ.setBounds(195,360,40,40);

        buttonxK.setBounds(55,400,40,40);
        buttonxL.setBounds(90,400,40,40);
        buttonxM.setBounds(125,400,40,40);
        buttonxN.setBounds(160,400,40,40);
        buttonxÑ.setBounds(195,400,40,40);

        buttonxO.setBounds(55,440,40,40);
        buttonxP.setBounds(90,440,40,40);
        buttonxQ.setBounds(125,440,40,40);
        buttonxR.setBounds(160,440,40,40);
        buttonxS.setBounds(195,440,40,40);
        buttonxT.setBounds(230,440,40,40);

        buttonxU.setBounds(55,480,40,40);
        buttonxV.setBounds(90,480,40,40);
        buttonxW.setBounds(125,480,40,40);
        buttonxX.setBounds(160,480,40,40);
        buttonxY.setBounds(195,480,40,40);
        buttonxZ.setBounds(230,480,40,40);
        
        fondo2.setBounds(0,0,310,546);
        
        valoraretirar_ventanaconfirmacion.setBounds(78,165,100,100);
    
        confirmacontraseña.setBounds(90,215,100,100);
        /* Fin ventana confirmar*/

        cerrarventanax.setBounds(270, 10, 25, 25);
        regresarx.setBounds(20,20,47,47);
   
    }
    
    private void agregar(){
        
        /* Inicio ventana inicial*/
        
        
        add(buttonx1_1);
        add(buttonx2_1);
        add(buttonx3_1);
        add(buttonx4_1);
        add(buttonx5_1);
        add(buttonx6_1);
        add(buttonx7_1);
        add(buttonx8_1);
        add(buttonx9_1);
        add(buttonx0_1);
        add(buttonxcancel_1);
        add(valorretiro);
        add(aceptar);
        
        /* Fin ventana inicial*/
        /* -------------------- */
        /* Inicio ventana confirmar*/
       
        add(buttonx1);
        buttonx1.setVisible(false);    
        add(buttonx2);
        buttonx2.setVisible(false);
        add(buttonx3);
        buttonx3.setVisible(false);
        add(buttonx4);
        buttonx4.setVisible(false);
        add(buttonx5);
        buttonx5.setVisible(false);
        add(buttonx6);
        buttonx6.setVisible(false);
        add(buttonx7);
        buttonx7.setVisible(false);
        add(buttonx8);
        buttonx8.setVisible(false);
        add(buttonx9);
        buttonx9.setVisible(false);
        add(buttonxok);
        buttonxok.setVisible(false);
        add(buttonxcancel);
        buttonxcancel.setVisible(false);
        add(buttonx0);
        buttonx0.setVisible(false);
        add(buttonxABC);
        buttonxABC.setVisible(false);        
        add(buttonx123);
        buttonx123.setVisible(false);
        
        add(buttonxa);
        buttonxa.setVisible(false);
        add(buttonxb);
        buttonxb.setVisible(false);
        add(buttonxc);
        buttonxc.setVisible(false);
        add(buttonxd);
        buttonxd.setVisible(false);
        add(buttonxe);
        buttonxe.setVisible(false);
        add(buttonxf);
        buttonxf.setVisible(false);
        add(buttonxg);
        buttonxg.setVisible(false);
        add(buttonxh);
        buttonxh.setVisible(false);
        add(buttonxi);
        buttonxi.setVisible(false);
        add(buttonxj);
        buttonxj.setVisible(false);
        add(buttonxk);
        buttonxk.setVisible(false);
        add(buttonxl);
        buttonxl.setVisible(false);
        add(buttonxm);
        buttonxm.setVisible(false);
        add(buttonxn);
        buttonxn.setVisible(false);
        add(buttonxñ);
        buttonxñ.setVisible(false);
        add(buttonxo);
        buttonxo.setVisible(false);
        add(buttonxp);
        buttonxp.setVisible(false);
        add(buttonxq);
        buttonxq.setVisible(false);
        add(buttonxr);
        buttonxr.setVisible(false);
        add(buttonxs);
        buttonxs.setVisible(false);
        add(buttonxt);
        buttonxt.setVisible(false);
        add(buttonxu);
        buttonxu.setVisible(false);
        add(buttonxv);
        buttonxv.setVisible(false);
        add(buttonxw);
        buttonxw.setVisible(false);
        add(buttonxx);
        buttonxx.setVisible(false);
        add(buttonxy);
        buttonxy.setVisible(false);
        add(buttonxz);
        buttonxz.setVisible(false);

        add(buttonxA);
        buttonxA.setVisible(false);
        add(buttonxB);
        buttonxB.setVisible(false);
        add(buttonxC);
        buttonxC.setVisible(false);
        add(buttonxD);
        buttonxD.setVisible(false);
        add(buttonxE);
        buttonxE.setVisible(false);
        add(buttonxF);
        buttonxF.setVisible(false);
        add(buttonxG);
        buttonxG.setVisible(false);
        add(buttonxH);
        buttonxH.setVisible(false);
        add(buttonxI);
        buttonxI.setVisible(false);
        add(buttonxJ);
        buttonxJ.setVisible(false);
        add(buttonxK);
        buttonxK.setVisible(false);
        add(buttonxL);
        buttonxL.setVisible(false);
        add(buttonxM);
        buttonxM.setVisible(false);
        add(buttonxN);
        buttonxN.setVisible(false);
        add(buttonxÑ);
        buttonxÑ.setVisible(false);
        add(buttonxO);
        buttonxO.setVisible(false);
        add(buttonxP);
        buttonxP.setVisible(false);
        add(buttonxQ);
        buttonxQ.setVisible(false);
        add(buttonxR);
        buttonxR.setVisible(false);
        add(buttonxS);
        buttonxS.setVisible(false);
        add(buttonxT);
        buttonxT.setVisible(false);
        add(buttonxU);
        buttonxU.setVisible(false);
        add(buttonxV);
        buttonxV.setVisible(false);
        add(buttonxW);
        buttonxW.setVisible(false);
        add(buttonxX);
        buttonxX.setVisible(false);
        add(buttonxY);
        buttonxY.setVisible(false);
        add(buttonxZ);
        buttonxZ.setVisible(false);
        
        add(mayus);
        mayus.setVisible(false);
        
        add(minus);
        minus.setVisible(false);
        
        
        add(valoraretirar_ventanaconfirmacion);
        add(confirmacontraseña);
        /* Fin ventana confirmar*/
        
        
        add(cerrarventanax);
        add(regresarx);
        

        add(fondo2);
        add(fondo);//siempre añadirlo al final
        
    }
    
    
}
