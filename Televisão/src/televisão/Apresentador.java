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
public class Apresentador {
    
    private  Double cachepor_evento ;
    private Double sla ;
    
   

    public Double getCachepor_evento() {
        return cachepor_evento;
    }

    public void setCachepor_evento(Double cachepor_evento) {
        this.cachepor_evento = cachepor_evento;
    }

    public Double getSla() {
        return sla;
    }

    public void setSla(Double sla) {
        this.sla = sla;
    }
    
    public Double ganhosdoapresentador (Integer q_eventos) {
    Double ganho ;
    ganho = sla + (q_eventos * cachepor_evento );
    return ganho ;
    }
    
}
