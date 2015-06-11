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
public class Reptile extends Personagem{
   
    Reptile (){
    
    
    
    }
    
    String invesivel (){
        return "Cima,Baixo"+chuteforte ;
        
}
    String Acido (){
        return "Cima,direita"+chuteforte;
}
    String Bola_lenta (){
        return "Direita , Esquerda"+chuteforte ;
    }
    String Bola_rapida (){
        return "Esquerda,Direita"+chuteforte ;
    }
    String Combo1 (){
        return chutefraco+socoforte ;
    }
    String Combo2 (){
        return socofraco+chuteforte ;
    }
    String Fatality1 (){
        return "Cima,Baixo,Baixo,Cima"+chutefraco ;
    }
     String Falality2 (){
         return "Baixo,Esquerda,Direita,Cima"+chutefraco ;
     }
    
private String Bolaultrasonic (){
    return "Cima,Baixo,esquerda,Cima,Direita"+socofraco ;
}

}
