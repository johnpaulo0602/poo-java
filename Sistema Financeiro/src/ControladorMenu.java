package com.mycompany.financaspessoa.classes;
public class ControladorMenu {
private final TelaMenu tela;
    public ControladorMenu(TelaMenu tela) {
        this.tela = tela;
    }
       public void entrarSistemaInvestimento(){
           TelaInvestimento investimento = new TelaInvestimento();
           investimento.setVisible(true);
           tela.dispose();
 
       }
           public void entrarSistemaEconomia(){
           TelaCalculo economia = new TelaCalculo();
           economia.setVisible(true);
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
           tela.dispose();
 
       }
}
