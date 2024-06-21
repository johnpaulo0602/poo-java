package com.mycompany.financaspessoa.classes;
public class ControladorTelaInvestimento {
   private final TelaInvestimento tela;

    public ControladorTelaInvestimento(TelaInvestimento tela) {
        this.tela = tela;
    }
    public void entrarSistemaEconomia(){
           TelaCalculo investimento = new TelaCalculo();
           investimento.setVisible(true);
           tela.dispose();
       }
           public void entrarSistemaEducacao(){
           TelaEducacaoFinanceira educacao = new TelaEducacaoFinanceira();
           educacao.setVisible(true);
           tela.dispose();
       }
            public void entrarSistemaQuestionario(){
           TelaQuestionario questionario = new TelaQuestionario();
           questionario.setVisible(true);
           tela.dispose();}
            
public void CalculoRendimentos(){
 // criando objetos rendimentos
       Rendimentos rendimentos = new Rendimentos();
       // pegando o resultado das economias e colocando na variavel
       //para realizar o calculo
       float resultados = Float.valueOf(tela.getJvalorinvestimento().getText());
       // condicional se o valor das economias for positivo
     
           //calculo e setando o resultado nos campos
       float poupanca = rendimentos.getPopança() * resultados; 
      tela.getjPoupanca1().setText(String.valueOf(String.format("%.2f", poupanca)));
      float LCI = rendimentos.getLCI() * resultados;
      tela.getjLCI().setText(String.valueOf(String.format("%.2f", LCI)));
      float  RDB = rendimentos.getRDB() * resultados;
      tela.getjRDB().setText(String.valueOf(String.format("%.2f", RDB)));
      float IPCA = rendimentos.getIPCA() * resultados;
      tela.getjIPCA().setText(String.valueOf(String.format("%.2f", IPCA)));
      float tesouro = rendimentos.getTesourodireto() * resultados;
      tela.getjTesoura().setText(String.valueOf(String.format("%.2f", tesouro)));
      
      
   }
   }  

