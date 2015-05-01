 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixa.eletrônica;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class testadobanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Banco bn = new Banco ();
      bn.bucarsbanco("001");
      JOptionPane.showMessageDialog(null,bn.nome);
      bn.bucarsbanco("047");
      JOptionPane.showMessageDialog(null, bn.nome);
      bn.bucarsbanco("037");
      JOptionPane.showMessageDialog(null, bn.nome);
      bn.bucarsbanco("041");
      JOptionPane.showMessageDialog(null, bn.nome);
      bn.bucarsbanco("004");
      JOptionPane.showMessageDialog(null, bn.nome);
      
    }
    
}
