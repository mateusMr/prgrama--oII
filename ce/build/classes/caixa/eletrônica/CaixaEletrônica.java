

package caixa.eletrônica;

import javax.swing.JOptionPane;

public class CaixaEletrônica {

    
    public static void main(String[] args) {
       conta mc = new conta ();
       mc.abrir("0101","02596410 ","malaquias");
       boolean deucerto ;
       deucerto = mc.deposito(10);
       if (deucerto == true ){
           JOptionPane.showMessageDialog(null," depósito R$10,00");
       }
       else {
           JOptionPane.showMessageDialog(null,"Operação não realizada de R$ 10,00");
       }
       deucerto = mc.sacar(20);
       if (deucerto == true){
           JOptionPane.showMessageDialog(null,"Saque realizado de R$20,00");
       }
       else {
           JOptionPane.showMessageDialog(null,"Operação não realizada de saque R$ 20,00");
       }
       deucerto = mc.sacar(5);
       if (deucerto == true){
           JOptionPane.showMessageDialog(null,"Saque realizado de R$ 5,00");
       }
       else {
           JOptionPane.showMessageDialog(null,"Operação não realizada R$ 5,00");
       }
       JOptionPane.showMessageDialog(null,mc.retornarsaldo());
    }
    
}
