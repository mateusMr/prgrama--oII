/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisão;

import javax.swing.JOptionPane;

/**
 *
 * @author MateusMalaquias
 */
public class testeemissora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emissora  e = new Emissora () ;
        String op ;
       e.setNome(JOptionPane.showInputDialog("qual o nome da emissora"));
       e.setEndereço(JOptionPane.showInputDialog("qual o endereço"));
     
         op = JOptionPane.showInputDialog("A televisão é aberta ou fechada");
    if (e.emissora(op) == true ){
        JOptionPane.showMessageDialog(null," dados da emissora nome \n"+e.getNome()+"\nendereço\n"+e.getEndereço()+"\na emissora é aberta");
        
    }
    else {
        JOptionPane.showMessageDialog(null," \ndados da emissora nome\n"+e.getNome()+"\nendereço \n"+e.getEndereço()+"\na emissoré fechada\n");
    }
    }
    
}
