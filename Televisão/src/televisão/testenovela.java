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
public class testenovela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        novela n = new novela ();
        
        n.setEmissora(JOptionPane.showInputDialog(null,"Qual a emissora q a novela é transmitida"));
        n.setAutor(JOptionPane.showInputDialog("Qual o autor da novela"));
        n.setHorario_exebi(JOptionPane.showInputDialog("Qual o horario da exebição"));
       n.setTitulo(JOptionPane.showInputDialog("Qual o titulo da novela"));
       Integer numero_de_pessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas estam assistindo a novela"));
       n.setDrogas(Integer.parseInt(JOptionPane.showInputDialog("diga drogas 1- sim e 0- não")));
       n.setSexo(Integer.parseInt(JOptionPane.showInputDialog("diga sexo 1- sim e 0- não")));
       n.setViolencia(Integer.parseInt(JOptionPane.showInputDialog("diga violencia 1- sim e 0- não")));
       JOptionPane.showMessageDialog(null,"emissora :\t "+n.getEmissora() +"\nautor\n"+n.getAutor()+" \nhorario\n"+n.getHorario_exebi()+" \ntitulo da novela\n"+n.getTitulo()+"\nibope\n"+n.ibope(numero_de_pessoas)+"\nclassificação\n"+n.classificação()  );
   
    }
    
    
}
