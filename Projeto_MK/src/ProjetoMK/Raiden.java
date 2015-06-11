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
public class Raiden extends Personagem{
     String raiofrente (){
        return "Cima,Cima"+chuteforte ;
        
}
    String teleport (){
        return "Esquerda,direita"+chuteforte;
}
    String boladeraio (){
        return "Cima , Esquerda"+chuteforte ;
    }
   
    String Combo1 (){
        return socoforte+chuteforte+chutefraco ;
    }
    String Combo2 (){
        return socofraco+chutefraco+socoforte ;
    }
    String Fatality1 (){
        return "Baixo,esquerda,Baixo,Cima"+chutefraco ;
    }
     String Falality2 (){
         return "Baixo,cima,Direita,Esquerda"+socofraco ;
     }
    
private String bolaultrasonica (){
    return "Cima,Baixo,Cima,Cima,Baixo"+socofraco ;
}
}
