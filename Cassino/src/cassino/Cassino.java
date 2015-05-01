package cassino;

import javax.swing.JOptionPane;

public class Cassino {

    public static void main(String[] args) {
        CriarConta c = new CriarConta();
        Jogos a = new Jogos();
        int opcao = 0;

        while (opcao != 3) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("SELECIONE A OPERAÇÃO DESEJADA: \n"
                    + "1- Criar o cadastro no cassino \n"
                    + "2-Fazer o login \n"
                    + "3-Sair \n"));

            switch (opcao) {
                case 1: {
                    String nomeuser;
                    String senhauser;
                    String loginuser;
                    String confirmasenha;

                    nomeuser = JOptionPane.showInputDialog("Informe o nome do jogador");
                    loginuser = JOptionPane.showInputDialog("Informe o login do usuário");
                    senhauser = JOptionPane.showInputDialog("Digite a senha escolhida");
                    confirmasenha = JOptionPane.showInputDialog("Digite a senha novamente");

                    if ((c.abrircadastro(loginuser, senhauser, confirmasenha, nomeuser)) == true) {
                        JOptionPane.showMessageDialog(null, "Conta criada com succeso");

                    } else {
                        JOptionPane.showInputDialog(null, "Tente novamente");
                    }

                    break;
                }

                case 2: {
                    int escolha = 0;
                    if (c.entrar(JOptionPane.showInputDialog("Informe a senha"), JOptionPane.showInputDialog("Informe o login")) == true) {
                        JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");

                        while (escolha != 4) {
                            escolha = Integer.parseInt(JOptionPane.showInputDialog("1-LOJA \n 2-COLOCAR CASH \n 3-ÁREA DOS JOGOS(+18) \n 4-SAIR"));

                            switch (escolha) {

                                case 1: {
                                       Integer opc = 0 ;
                                        
                                           opc = Integer.parseInt(JOptionPane.showInputDialog("informe sua opção desejada 1 - roupa \n 2 - acessórios 3 - sapatos :"));
                                            switch(opc){
                                                case 1:{
                                                  String opção = null;
                                                       {
                                                     
                                                                    opção = JOptionPane.showInputDialog("terno \n smonking \n vestido rosa \n tubinho dourado :");
                                                                    if ( c.compraroupa(opção)== true){
                                                                        JOptionPane.showMessageDialog(null,"Compra efetuda com sucesso \n seu saldo em cash é"+ c.getCash() );
                                                                    }
                                                                    else {
                                                                        JOptionPane.showMessageDialog(null," Compra não efetuada"
                                                                                + "");
                                                                    }
                                                                    break ;
                                                      }
                                                       
                                                }case 2:{
                                                    String opcc = null ;
                                                    opcc = JOptionPane.showInputDialog(null,"informe sua opção  1 - r.ouro \n 2 - r.prata 3 - anel ouro \n 4 - anel prata" );
                                                    if ( c.acessórioscompra(opcc)== true ){
                                                        JOptionPane.showMessageDialog(null,"compra realizada com sucesso \n seu saldo em cash é"+ c.getCash() );
                                                    }
                                                    else {
                                                       JOptionPane.showMessageDialog(null,"compra não realizada " );
                                                    }
                                                    break ;
                                                }case 3:{
                                                    String op = null ;
                                                    op = JOptionPane.showInputDialog(null,"informe sua opção  1 - S.social c.jacaré \n 2 - S.social c.vaca 3 - S.social comum " );
                                                    if ( c.acessórioscompra(op)== true ){
                                                        JOptionPane.showMessageDialog(null,"compra realizada com sucesso \n seu saldo em cash é"+ c.getCash() );
                                                    }
                                                    else {
                                                       JOptionPane.showMessageDialog(null,"compra não realizada " );
                                                    }
                                                    break ;
                                                }  
                                            
                                                default:{
                                                    JOptionPane.showMessageDialog(null,"Opção incorreta" );
                                                }
                                                    break ;
                                            }
                                        
                                    break ;

                                }

                                case 2: {
                      String numerocartao ;
                         Integer valor = 0 ;
                                    if (c.isJogando() == true ){
                                            numerocartao=(JOptionPane.showInputDialog("Insira o número do cartão:"));
                                           
                                    if (c.colocarcash(numerocartao, valor) == true) {
                                       valor = Integer.parseInt("qual seu valor em deposito");
                                        
                                        JOptionPane.showMessageDialog(null, "VALOR DEPOSITADO COM EXITO!\n SEU SALDO ATUAL É: " + c.getCash());
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Cartão de Crédito inválido ou operação não aprovada.", "OPERAÇÃO REALIZADA", JOptionPane.WARNING_MESSAGE);
                                    }
                                    

                                }else {
                                        JOptionPane.showMessageDialog(null,"No momento voce não esta jogando" );
                                        break ;
                                    }
                                }

                                case 3: {
                                    int opcaojogos = 0;
                                    while (opcaojogos != 3) {

                                     
                                        opcaojogos = Integer.parseInt(JOptionPane.showInputDialog("1-Jogo dos dados  \n 2-Jogo da roleta  \n 3-SAIR "));

                                        switch (opcaojogos) {
                                            case 1: {
                                               a.aposta=(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da aposta:")));
                                                if (a.gold > a.aposta) {
                                                    a.setNumerojogado(Integer.parseInt(JOptionPane.showInputDialog("Insira o número desejado:")));
                                                    if ( a.getNumerojogado() < 12 || 2 < a.getNumerojogado() && a.getSoma() > 2 || a.getSoma() < 12) {
                                                        if (a.jogodosdados() == true) {
                                                            JOptionPane.showMessageDialog(null, "Número sorteado: " + a.getSoma() + "/nVocê ganhou, seu saldo atual é: " + a.getGold());
                                                        } else {
                                                            JOptionPane.showMessageDialog(null, "Você perdeu, seu saldo atual é: " + a.getGold() + "o numero sorteado foi "+ a.getSoma());

                                                        }

                                                    }
                                                    else {
                                                    JOptionPane.showMessageDialog(null,"Este numero não esta entre 2 e 12" );
                                                }
                                                }
                                                else {
                                                JOptionPane.showMessageDialog(null,"Infelizmente voce não possui tantos gols" );
                                            }
                                               break ;
                                            }
                                            case 2:{
                                            }case 3 :{
                                            }
                                            default :{
                                                JOptionPane.showMessageDialog(null,"OPÇÃO INCORRETA  " );
                                            }

                                        }
                                    }

                                }

                            }

                        }

                    }

                }case 3:{
                    Integer op ;
                   op = JOptionPane.showConfirmDialog(null,"tem certeza de sair");
                    if (op == 0){
                        JOptionPane.showMessageDialog(null,"Obrigado pela a atenção");
                    }else {
                        JOptionPane.showMessageDialog(null,"retome ao menu");
                    }
                }

            }
        }
    }
    
    }
        
