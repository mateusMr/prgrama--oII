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
public class novela {
   private String titulo ;
   private String duração ;
   private String horario_exebi ;
   private String autor ;
   private String emissora ;
private String endereço ;
   private  Integer violencia ;
   private Integer sexo ;
   private Integer drogas ;
private Boolean tv ;
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    public String getHorario_exebi() {
        return horario_exebi;
    }

    public void setHorario_exebi(String horario_exebi) {
        this.horario_exebi = horario_exebi;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

  
    public Integer getViolencia() {
        return violencia;
    }

    public void setViolencia(Integer violencia) {
        this.violencia = violencia;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public Integer getDrogas() {
        return drogas;
    }

    public void setDrogas(Integer drogas) {
        this.drogas = drogas;
    }
   
   
   String classificação (){
       Boolean retorno ;
      
       
       if (violencia == 1 && sexo == 1 && drogas == 1){
           return "18 anos" ;
       }
       else if (violencia == 0 && sexo == 0 && drogas == 0){
           return "livre" ;
       }
       else if (violencia == 1 && sexo == 0 && drogas == 0){
           return "14 anos" ;
       }
       else if (violencia == 1 && sexo == 1 || sexo ==0 && drogas == 1){
           return "16 anos" ;
       }
       else {
          return "não foi possivel identificar" ; 
       }
           
   }
   Integer ibope ( Integer numero_de_pessoas){
       Integer pontuacao ;
      pontuacao = numero_de_pessoas / 10000 ;
      return pontuacao ;
       
   }
  
}
