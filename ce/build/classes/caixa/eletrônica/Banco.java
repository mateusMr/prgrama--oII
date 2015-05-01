

package caixa.eletrônica;


public class Banco {
    String numero ;
    String nome ;
    
    
    
    
    void bucarsbanco (String vnumero){
        
        switch (vnumero){
            case "001":{
                vnumero= numero;
                nome = "banco do brasil";
                break ;
            }
            case "047":{
                vnumero = numero ;
                nome = "Banco do estado do sergipe";
                break;
            }
            case "037":{
                vnumero = numero ;
                nome = "bancop do estado do pará";
                break;
            }
            case "041":{
                vnumero = numero ;
                nome = "banco do estado do Rio Grande do Sul";
                break;
                
            }
            case "004":{
                vnumero = numero ;
                nome = "banco do nordeste do brasil";
                break ;
            }
            default :{
                nome = null ;
            }
        }
        
}
}


