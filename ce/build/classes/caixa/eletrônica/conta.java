

package caixa.eletrônica;

import javax.swing.JOptionPane;

public class conta {
    String numero_da_conta ;
    String agencia;
    String nome ;
    float saldo ;
    boolean ativa ;
   
    void abrir (String agen ,String nom,String nume ){
        agencia = agen ;
        nome = nom ;
        agencia = agen ;
        saldo = 0.0f ;
        ativa = true ;
        
    }
    boolean fecharconta(){
        if (saldo == 0){
            
                   ativa = false ;
                   return true;
        }
        else {
            return false ;
        }
    }
    boolean deposito (float transação){
        
        if (ativa == true){
            saldo = saldo + transação ;
            return true ;
        }
        else {
            return false ;
        }
            
              
        
    }
    boolean sacar(float valor){
        if (ativa == true && valor <= saldo  ){
            saldo =  saldo - valor ;
            return true ;
        }
        else {
            return false ;
        }
    }
    double retornarsaldo (){
        return saldo ;
    }
}


  

