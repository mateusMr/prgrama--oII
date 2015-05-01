/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisão;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class testeAtor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ator a = new Ator ();
       
         a.setNome_artistico(JOptionPane.showInputDialog("qual seu nome artisitico"));
       a.setData_nascimento(JOptionPane.showInputDialog("qual sua data de nascimento"));
       a.setEmail(JOptionPane.showInputDialog("qual seu email"));
       a.setQ_novelas(Integer.parseInt(JOptionPane.showInputDialog("quantas novela voce fez")));
       
       a.setSalario(Integer.parseInt(JOptionPane.showInputDialog("qual seu salario")));
       
       JOptionPane.showMessageDialog(null," dados do ator : \n seu status é como \n "+ a.Status()+ "\n nome artistico é \n"+a.getNome_artistico()+" \n data nascimento : \n"+ a.getData_nascimento()+" \n numero de novelas \n"+ a.getQ_novelas() + "\n salario \n"+a.getSalario());
       
       
    }
    
}
