/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmind;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Mensajes {
    
    public static void mostrarMensajeSimple(String msj){
        JOptionPane.showMessageDialog(null, msj);        
    }
    
    public static int mostrarMensajeConfirmacion(Component c,String msj){        
        int status = JOptionPane.showConfirmDialog(c, msj);                
        return status;
    }
    
    
    
}
