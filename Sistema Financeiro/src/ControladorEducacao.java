package com.mycompany.financaspessoa.classes;
public class ControladorEducacao {
 private final TelaEducacaoFinanceira tela;
// conectando a tela
    public ControladorEducacao(TelaEducacaoFinanceira tela) {
        this.tela = tela;
    }
    // classe pra entra na telas
    public void entrarSistemaInvestimento(){
           TelaInvestimento investimento = new TelaInvestimento();
           investimento.setVisible(true);
           tela.dispose();
 
       }
     public void entrarSistemaQuestionario(){
           TelaQuestionario questionario = new TelaQuestionario();
           questionario.setVisible(true);
           tela.dispose();}
     
           public void entrarSistemaEconomia(){
           TelaCalculo economia = new TelaCalculo();
           economia.setVisible(true);
           tela.dispose();
       }
}
