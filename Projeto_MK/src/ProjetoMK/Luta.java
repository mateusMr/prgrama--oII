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
public class Luta {
    
    private String cenario ;
    private Personagem personagem1 ;
    private Personagem personagem2 ;
    private Integer dano ;
    private Integer danocombo ;

    public String getCenario() {
        return cenario;
    }

    public void setCenario(String cenario) {
        this.cenario = cenario;
    }

    public Personagem getPersonagem1() {
        return personagem1;
    }

    public void setPersonagem1(Personagem personagem1) {
        this.personagem1 = personagem1;
    }

    public Personagem getPersonagem2() {
        return personagem2;
    }

    public void setPersonagem2(Personagem personagem2) {
        this.personagem2 = personagem2;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Integer getDanocombo() {
        return danocombo;
    }

    public void setDanocombo(Integer danocombo) {
        this.danocombo = danocombo;
    }

    
  
    public  Luta () {
        cenario = "casa do goro";
        personagem1 = new Personagem() ;
        personagem2 = new Personagem() ;
        dano = 5 ;
        danocombo = 20 ;
      
        
    }
    public void golpe (String lutador){
        
        if (lutador.equals("p1")){
        
       personagem2.setVida(personagem2.getVida() - dano);
        
        }
        else {
        
       personagem1.setVida(personagem1.getVida() - dano);
        
        }
        
        
    }
    public void combo (String lutador){
        if (lutador.equals("p1")){
        
        this.personagem2.setVida(this.personagem2.getVida() - this.danocombo);
        
        }
        else {
        
        this. personagem1.setVida(this.personagem1.getVida() - this.danocombo);
        
        }
    }
        public void combo2(String lutador) {

        if (lutador.equals("p1")) {
            this.personagem2.setVida(this.personagem2.getVida() - this.danocombo);
        } else {
            this.personagem1.setVida(this.personagem1.getVida() - this.danocombo);
        }
    
}
}
