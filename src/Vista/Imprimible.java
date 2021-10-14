/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;
import javax.swing.JOptionPane;
/**
 *
 * @author Paulo Acero
 */
public class Imprimible {
    int msg_default;
    
    public Imprimible(){
    }
    
    public void mostrar_mensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }
}