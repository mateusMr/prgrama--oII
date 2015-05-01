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
public class testeapresentador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apresentador a = new Apresentador ();
        Integer q_eventos ;
        q_eventos = Integer.parseInt(JOptionPane.showInputDialog("De quntos eventos vc participou"));
        a.setCachepor_evento(Double.parseDouble(JOptionPane.showInputDialog(null,"Quanto vc ganha por evento ")));
        a.setSla(Double.parseDouble(JOptionPane.showInputDialog("Qual é seu salario")));
        JOptionPane.showMessageDialog(null," seus ganhos neste mes foi de"+a.ganhosdoapresentador(q_eventos) );
    }
    
}
