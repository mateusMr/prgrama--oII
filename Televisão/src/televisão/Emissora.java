/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisão;

/**
 *
 * @author Aluno
 */
public class Emissora {
    private  String nome;
    private String endereço ;
    private String aberta_fechada ;
    private String nu ;
    Emissora (){
    
    nome = null ;
    endereço = null ;
    aberta_fechada = null ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getAberta_fechada() {
        return aberta_fechada;
    }

    public void setAberta_fechada(String aberta_fechada) {
        this.aberta_fechada = aberta_fechada;
    }
    
    
    
     Boolean emissora (String op){
       
       if ("aberta".equals(op)){
           return true ;
       }
    else {
       return false ;
   }
    
   }
}
