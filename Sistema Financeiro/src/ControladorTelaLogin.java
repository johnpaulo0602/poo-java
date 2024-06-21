package com.mycompany.financaspessoa.classes;

import com.mycompany.financaspessoa.*;
import javax.swing.JPasswordField;

public class ControladorTelaLogin {
    // conectando com a tela TelaLogin
    private final TelaLogin view;
    public ControladorTelaLogin(TelaLogin view) {
       this.view = view; 
     
    }
    // pegando as informaçôes dos compos nome e senha e colocando no objeto do tipo usuario
     public Usuario getCampos(){
        String nome = view.getCaixaUsuario().getText();
        String senha = view.getCaixaSenha().getText();
        Usuario usuario = new Usuario(nome,senha);
        return usuario;
        
    }
    public void entrarSistema(){
        //criando um objeto do tipo usuario e colocando o usuario e senha dos campos
        Usuario usuario = getCampos();
        //criando objeto do tipo banco de dados 
        BancoProjeto bancoprojeto = new BancoProjeto();
    
    // fazendo autentificaçâo entre o objeto usuario com o banco de dados
        if(usuario.getNome().equals(bancoprojeto.getNome() )&& usuario.getSenha().equals(bancoprojeto.getSenha())){
            // entrando na tela TelaCalculo
            //JPasswordField camposenha = new JPasswordField(); 
            //JPasswordField campoSenha = (JPasswordField) view.getCaixaSenha();
            //camposenha.setEchoChar('*');
            TelaMenu telamenu = new TelaMenu();
            telamenu.setVisible(true);
            //fechando tela login
            view.dispose();
            
        }else{
            // exibir mensagem de erro e limpar campos
            ExibirMensagem();
            setLimparTela();
        }
        
    }
    
   // setar no campos
    public void setCampos(Usuario usuario){
        String nome = usuario.getNome();
        String senha = usuario.getSenha();
        view.getCaixaUsuario().setText(nome);
        view.getCaixaSenha().setText(senha);
       
    }
    // limpar tela
    public void setLimparTela(){
        view.getCaixaUsuario().setText("");
        view.getCaixaSenha().setText("");
    }
    //exibir mensagem
  public void ExibirMensagem(){
      System.out.println("deu certo");
      this.view.exibirMensagem("usuario ou senha invalido");
      
  }
}
