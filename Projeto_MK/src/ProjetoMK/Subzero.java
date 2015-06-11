/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoMK;

/**
 *
 * @author MateusMalaquias
 */
public class Subzero extends Personagem {
   Subzero (){
   
   
   }
    
    String Gelofrente (){
        return "Cima,Cima"+chuteforte ;
        
}
    String Gelochao (){
        return "Esquerda,direita"+chuteforte;
}
    String slide (){
        return "Cima , Esquerda"+chuteforte ;
    }
   
    String Combo1 (){
        return socoforte+chuteforte ;
    }
    String Combo2 (){
        return socofraco+chutefraco+socoforte ;
    }
    String Fatality1 (){
        return "Baixo,Baixo,Baixo,Cima"+chutefraco ;
    }
     String Falality2 (){
         return "Baixo,Esquerda,Direita,Esquerda"+socofraco ;
     }
    
private String Supergelo (){
    return "Cima,Baixo,Cima,Cima,Baixo"+socofraco ;
}

}
