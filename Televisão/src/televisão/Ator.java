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
public class Ator {
    private String nome ;
  private   String data_nascimento ;
  private   Integer q_novelas ;
   private  String email ;
   private  String nome_artistico ;
    private Integer salario ;
   private  Double cachevento ;
   private  String cidade ;
   private  String endereco ;
   private  String bairro ;
  private Integer numero_eventos ;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Integer getQ_novelas() {
        return q_novelas;
    }

    public void setQ_novelas(Integer q_novelas) {
        this.q_novelas = q_novelas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_artistico() {
        return nome_artistico;
    }

    public void setNome_artistico(String nome_artistico) {
        this.nome_artistico = nome_artistico;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Double getCachevento() {
        return cachevento;
    }

    public void setCachevento(Double cachevento) {
        this.cachevento = cachevento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    Ator (){
       
       this.salario = 0; 
       this. nome = null ;
       this. q_novelas =  0 ;
       this. data_nascimento = null ;
       this.bairro = null ;
       this.cachevento = 0D ;
       this.cidade = null ;
      this.nome_artistico = null ;
      
      
       
       
    }
   
    String Status (){
        String retorno ;
        if( salario <= 5000 && q_novelas <= 3){
       retorno = "calouro";
    }else if (q_novelas <= 6 && salario <= 5000 ){
        retorno ="revelação" ;
    }else if (q_novelas <= 6 && salario >= 30000){
        retorno = "joia" ;
    }else if (q_novelas >= 9 && salario <= 30000){
        retorno = "elenco de apoio ";
    }else if (salario > 3000 && salario <= 100000){
        retorno = "elenco principal";
    }
    else if (salario > 100000){
        retorno = "Estrela";
    }
    else {
        retorno ="elenco regular";
    }
        return retorno ;
    }
    Double ganhosmensais (Integer numero_eventos){
        Double ganhos ;
        ganhos = salario +(numero_eventos * cachevento);
        
        return ganhos ;
    }

   
    
     
}
