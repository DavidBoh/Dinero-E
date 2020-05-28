/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Christian
 */
public class ControlTerminos implements ActionListener{
    
    VistaTerminos terminos;
    public ControlTerminos(VistaTerminos terminos){
        this.terminos = terminos;
        terminos.cerrarventanax.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == terminos.cerrarventanax){
            terminos.dispose();
        }
    }
    
}
