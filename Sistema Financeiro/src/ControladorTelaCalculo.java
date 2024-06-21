package com.mycompany.financaspessoa.classes;

import com.mycompany.financaspessoa.*;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
public class ControladorTelaCalculo {
    //conecta a tela com a classe ControladorTelaCalculo
private final TelaCalculo tela;
private float resultado;
    public ControladorTelaCalculo(TelaCalculo tela) {
        this.tela = tela;
        
    }
    
    public void Calculo(){
        // pegando as informaçôes dos campos e colocando em variaveis
     float salariomensal = Float.valueOf(tela.getjSalarioMensal().getText());
     float gastoalimentacao = Float.valueOf(tela.getjGastoAlimentacao1().getText());
     float gastoenergia = Float.valueOf(tela.getjErnergia().getText());
     float gastoagua = Float.valueOf(tela.getjAgua().getText());
     float gastoextra = Float.valueOf(tela.getjGastoExtras1().getText());
     float gastolazer = Float.valueOf(tela.getjGastoLazer().getText());
     float gastointernet = Float.valueOf(tela.getjInternet().getText());
     // realizando o calculo
        resultado = salariomensal-gastoalimentacao-gastoenergia
             -gastoagua-gastoextra-gastolazer-gastointernet;
       
     // caso o resultado seja positivo mostra o saldo positivo
        if (resultado > 0){
        // setando o valor na tela    
            tela.getjEconomia().setText(String.valueOf(resultado));
            // limpar todos os campos acima
            limparTela();
            //limpar campo negativo
            tela.getjNegativo().setText("");
     // caso negativo ira mostrar o saldo negativo
        }else{
            // setando o valor na tela
            tela.getjNegativo().setText(String.valueOf(resultado));
            //limpar campos acima
            limparTela();
            // limpar campo economia
            tela.getjEconomia().setText("");
        }
    }
    // se algum campo estiver em branco
    public void campovazio(){
        if("".equals(tela.getjAgua().getText()) || "".equals(tela.getjErnergia().getText())
                || "".equals(tela.getjGastoAlimentacao1().getText())||"".equals
        (tela.getjGastoExtras1().getText())|| "".equals(tela.getjGastoLazer().getText())
                || "".equals(tela.getjInternet().getText())||"".equals
        (tela.getjSalarioMensal().getAccessibleContext())){
            tela.ExibirMensager(" algum dos campos esta em branco");
        }
    }
    // limpar todos os campos acima do botao calcular
    public void limparTela(){
        
     tela.getjSalarioMensal().setText((""));
     tela.getjGastoAlimentacao1().setText((""));
     tela.getjErnergia().setText((""));
     tela.getjAgua().setText((""));
     tela.getjGastoExtras1().setText((""));
     tela.getjGastoLazer().setText((""));
     tela.getjInternet().setText((""));
    }
  
     // se o valor der negativo mensagem saldo negativo
   public void entrarSistemaInvestimento(){
           TelaInvestimento investimento = new TelaInvestimento();
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
           tela.dispose();
           }
   public void valornegativo(){
       
       if (resultado < 0){
           String Mensagem = "seu saldo esta negativo";
    tela.ExibirMensager(Mensagem);
    tela.getjNegativo().setText("");
    tela.getjEconomia().setText("");
   }
       // caso o campo estiver em branco
   if( "".equals(tela.getjEconomia().getText())) {
       tela.ExibirMensager(" campo Economia em Branco");
   }
       
}}
