package cassino;

public class CriarConta {
Integer depcash ;
    private String nome;
    private String login;
    private String senha;
    private Boolean jogando;
    private String roupa;
    private String acessorio;
    private String sapato;
    private Integer gold;
    private Float cash;
    private Boolean ativa;
    private String confirma;
   private  String Numerocartao;
    private String valorcash;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean isJogando() {
        return jogando;
    }

    public void setJogando(Boolean jogando) {
        this.jogando = jogando;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getSapato() {
        return sapato;
    }

    public void setSapato(String sapato) {
        this.sapato = sapato;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    public Boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public String getConfirma() {
        return confirma;
    }

    public void setConfirma(String confirma) {
        this.confirma = confirma;
    }

    public String getNumerocartao() {
        return Numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.Numerocartao = numerocartao;
    }

    public String getValorcash() {
        return valorcash;
    }

    public void setValorcash(String valorcash) {
        this.valorcash = valorcash;
    }

    CriarConta() {
       this. nome = null;
       this. login = null;
       this. senha = null;
       this. jogando = false;
      this.  roupa = null;
      this.  acessorio = null;
      this.sapato = null;
      this.gold = 0;
     this.cash = 50f;
     this.confirma = null;
    }

    Boolean entrar(String vsenha, String vlogin) {
        if (vsenha.equals(this.senha) && vlogin.equals(this.login)) {
            return true;
        } else {
            return false;
        }
    }

    Boolean abrircadastro(String vlogin, String vsenha, String confirmasenha, String vnome) {
        if (vsenha.equals(confirmasenha) == true) {
            nome = vnome;
            login = vlogin;
            senha = vsenha;
            gold = 50;
            cash = 0f;
            jogando = true;
            roupa = "Calça e camisa";
            acessorio = "Relógio vagabundo do camelô";
            sapato = "Havaianas";

            return true;
        } else {

            return false;

        }

    }

    Boolean colocarcash( String numerocartao,Integer valor) {
       
        if (numerocartao.length() == 16) {
            if (valor <= 10) {
                cash = cash + valor;
                return true;
            } else if (valor <= 50 && valor >= 11) {
                cash = cash + (valor * 2);
                return true;
            } else {
                cash = cash + (valor * 3);
                return true;
            }
        } else {

            return false;
        }
    }

    
     boolean compraroupa ( String opção ){
        boolean retorno;
      
        Integer valor ;
        if (jogando == true){
            switch (opção){
                case "terno":{
                    
                    valor = 40;
                    if ( cash >= valor){
                    cash = cash - valor ;
                    retorno = true ;
                    
                   
                
                }
                    else {
                      retorno = false ;  
                    }
                    break ;
                    }
                   
                case "smonking":{
                    valor = 45 ;
                    if (cash >= valor){
                        cash = cash - valor ;
                        retorno = true ;
                       
                }
                    else {
                        retorno = false ;
                        
                    } 
                    break ;
                }
                case "vestido rosa":{
                    valor = 35 ;
                    if (cash >= valor){
                        cash = cash - valor ;
                        retorno = true ;
                        
                    }
                    else {
                        retorno = false ;
                    }
                    break;
                }
                case "tubinho dourado":{
                    valor = 55 ;
                    if (cash >= valor){
                        cash = cash - valor ;
                        retorno = true ;
                    }
                    else {
                        retorno = false ;
                    }
                    break ;
                }
            }
            retorno = true ;
        }
        else {
            retorno = false ;
       
    }
        return retorno ;
    }
    boolean acessórioscompra (String op){
        boolean retorno = false  ;
        
        Integer valor ;
        if ( jogando = true){
          
        
            switch (op){
                case "R. ouro":{
                    valor = 30 ;
                    if (cash >= valor){
                        cash = cash - valor ;
                        retorno = true ;
                    }
                    else {
                        retorno = false ;
                    }
                    break ;
                }
                case "R. prata":{
                    valor = 25 ;
                    if ( cash >= valor){
                      cash = cash - valor ;  
                      retorno = true ;
                }
                    else {
                        retorno = false ;
                    }
                    break ;
            }
                case "Anel de ouro":{
                    valor = 15 ;
                    if ( cash >= valor ){
                        cash = cash - valor ;
                        retorno = true ;
                    }
                    else {
                        retorno = false ;
                    }
                    break ;
                }
                case "anel de prata":{
                    valor = 10 ;
                    if (cash >= valor){
                        cash = cash - valor ;
                        retorno = true ;
                    }
                    else {
                        retorno = false ;
                    }
                    
                }
            }
            
         retorno = true;
            }
        else {
            retorno = false ;
        }
        return retorno ;
    }
     boolean comprasapatos (String opc){
         boolean retorno = false  ;
       
         Integer valor ;
         if (jogando == true){
         switch (opc){
             case "S.social couro de jacaré":{
                 valor = 50 ;
                 if ( cash >= valor){
                     cash = cash - valor ;
                     retorno = true ;
                 }
                 else {
                     retorno = false ;
                    
                 }
                break;
             }
              case "S.social couro de vaca":{
                 valor = 40 ;
                 if (cash >= valor){
                     cash = cash - valor ;
                     retorno = true ;
                 }
                 else {
                     retorno = false ;
                 }
                 break ;
             }
              case "S.social comum":{
                  valor = 15 ;
                  if ( cash >= valor){
                      cash = cash - valor ;
                      retorno = true ;
                  }
                  else {
                      retorno = false ;
                  }
                  break ;
              }
            
         }
         retorno = true ;
     
}else{
             retorno = false ;
         }
    return retorno ;
     }
}
