package com.mycompany.financaspessoa.classes;
public class ControladorQuestao {
    private final TelaQuestionario tela;
    public ControladorQuestao(TelaQuestionario tela) {
        this.tela = tela;
    }
    public void questao(int index, int correct){
        enable(true);
      String[] questao = {"1. Qual das alternativas a seguir não é considerada um ativo financeiro?"
              ,"2. Qual é o principal objetivo de um orçamento financeiro?",
              "3. A inflação afeta o poder de compra do dinheiro da seguinte maneira:"
              ,"4. . Qual das alternativas a seguir não é uma boa prática para se manter em dia com suas finanças?"
              ," MUITO BEM VAMOS MAIS UMA VEZ" }; 
      String[][] opcao = {{"Dívidas a receber","Dinheiro em espécie","Imóveis","Contas a pagar"},
          {" Diminuir o Pagamento de Imposto.","Investir seu dinheiro em ativos de alto risco.","Obter empréstimos com taxas de juros baixas.","Controlar seus gastos e evitar dívidas."}
              ,{"Aumenta o poder de compra, pois os preços dos produtos caem.","Não tem efeito no poder de compra, pois os salários também aumentam na mesma proporção"," Diminui o poder de compra, pois os preços dos produtos e serviços aumentam.","Afeta apenas os investimentos em renda fixa, não os investimentos em renda variável."}
              ,{"Criar um orçamento e acompanhar seus gastos regularmente","Reservar uma parte de sua renda para imprevistos."," Gastar mais do que você ganha.","Investir seu dinheiro para alcançar seus objetivos financeiros."},{"******","*******","*******","******"}};
      tela.getJquestao().setText(questao[index]);
      tela.getOpcao1().setText(opcao[index][0]);
      tela.getOpcao2().setText(opcao[index][1]);
      tela.getOpcao3().setText(opcao[index][2]);
      tela.getOpcao4().setText(opcao[index][3]);
        //System.out.println(index);
      if(index == questao.length-1){
          tela.getProximo().setText("reiniciar");
          tela.getCorretas().setText("VOCE ACERTOU "+String.valueOf(correct)+" DE " + String.valueOf(index));
      }else {
        tela.getProximo().setText("Proximo");  
        tela.getCorretas().setText("");
      }}
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
    public void enable(boolean yes_or_no){
        tela.getOpcao1().setEnabled(yes_or_no);
        tela.getOpcao2().setEnabled(yes_or_no);
        tela.getOpcao3().setEnabled(yes_or_no);
        tela.getOpcao4().setEnabled(yes_or_no);
        
    }
    
    
}
