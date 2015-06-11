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
public class Scorpion extends Personagem{
   Scorpion(){
   
   
   
   }
    
    String Spear (){
        return "baixo,Cima"+chuteforte ;
        
}
    String teleport (){
        return "Esquerda,baixo"+socoforte;
}
    String takedown (){
        return "Cima , cima"+chutefraco ;
    }
   
    String Combo1 (){
        return socoforte+chutefraco ;
    }
    String Combo2 (){
        return socofraco+chuteforte+socoforte ;
    }
    String Fatality1 (){
        return "Baixo,Baixo,Baixo,baixo"+chutefraco ;
    }
     String Falality2 (){
         return "Baixo,cima,baixo,cima"+socofraco ;
     }
    
private String airdeamon (){
    return "Cima,direita,Cima,esquerda,cima"+socofraco ;
}

}
