/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.financaspessoa.classes;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Administrador
 */

public class TelaQuestionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaQuestionario
     */
    private final ControladorQuestao controlador;
    private int index;
    private int correct;
    ButtonGroup bg = new ButtonGroup();
    public TelaQuestionario() {
        initComponents();
        controlador = new  ControladorQuestao(this);
        proximoActionPerformed(null);
        bg.add(opcao1);
        bg.add(opcao2);
        bg.add(opcao3);
        bg.add(opcao4);
        setLocationRelativeTo(null);
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jquestao = new javax.swing.JLabel();
        opcao1 = new javax.swing.JRadioButton();
        opcao2 = new javax.swing.JRadioButton();
        opcao3 = new javax.swing.JRadioButton();
        opcao4 = new javax.swing.JRadioButton();
        proximo = new javax.swing.JButton();
        corretas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jquestao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jquestao.setText("Questao");
        getContentPane().add(jquestao, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 17, -1, -1));

        opcao1.setText("jRadioButton1");
        opcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao1ActionPerformed(evt);
            }
        });
        getContentPane().add(opcao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        opcao2.setText("jRadioButton2");
        opcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao2ActionPerformed(evt);
            }
        });
        getContentPane().add(opcao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        opcao3.setText("jRadioButton3");
        opcao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao3ActionPerformed(evt);
            }
        });
        getContentPane().add(opcao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        opcao4.setText("jRadioButton4");
        opcao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcao4ActionPerformed(evt);
            }
        });
        getContentPane().add(opcao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        proximo.setText("Proximo");
        proximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });
        proximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                proximoKeyPressed(evt);
            }
        });
        getContentPane().add(proximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 237, 100, 30));

        corretas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(corretas, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 100, 290, 60));

        jButton1.setText("Gabarito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 100, 30));

        img.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrador\\Downloads\\fundo tela calculo 6.jpg")); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 560, 370));

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Investimentos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Economias");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Educacao financeira");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao1ActionPerformed
        // TODO add your handling code here:
        index++;
        if(index == 1){
            correct++;
        
        }
        controlador.enable(false);
        
    }//GEN-LAST:event_opcao1ActionPerformed

    private void opcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao2ActionPerformed
        // TODO add your handling code here:
          index++;
        if(index == 0){
            correct++;
            
        }
         controlador.enable(false);   
    
    }//GEN-LAST:event_opcao2ActionPerformed

    private void opcao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao3ActionPerformed
        // TODO add your handling code here:
        index++;
        if(index == 3 || index ==4){
            correct++;
            
        }
         controlador.enable(false);   
    }//GEN-LAST:event_opcao3ActionPerformed

    private void opcao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcao4ActionPerformed
        // TODO add your handling code here:
        index++;
        if(index == 2){
            correct++;}
        controlador.enable(false);
    }//GEN-LAST:event_opcao4ActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        // TODO add your handling code here:
        if(getProximo().getText().equals("reiniciar")){
            index = 0;
            correct = 0;
        }
        controlador.questao(index,correct);
        bg.clearSelection();
        System.out.println(correct);
        System.out.println(index);
    }//GEN-LAST:event_proximoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        controlador.entrarSistemaInvestimento();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        controlador.entrarSistemaEconomia();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        controlador.entrarSistemaEducacao();

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaResposta controladortela = new TelaResposta();
        controladortela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void proximoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proximoKeyPressed
        // TODO add your handling code here:
        if(getProximo().getText().equals("reiniciar")){
            index = 0;
            correct = 0;
        }
        
         controlador.questao(index,correct);
         bg.clearSelection();
    }//GEN-LAST:event_proximoKeyPressed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestionario().setVisible(true);
            }
        });
    }

    public JButton getProximo() {
        return proximo;
    }

    public JLabel getJquestao() {
        return jquestao;
    }

    public void setJquestao(JLabel jquestao) {
        this.jquestao = jquestao;
    }

    public JRadioButton getOpcao1() {
        return opcao1;
    }

    public JLabel getCorretas() {
        return corretas;
    }

    public void setOpcao1(JRadioButton opcao1) {
        this.opcao1 = opcao1;
    }

    public JRadioButton getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(JRadioButton opcao2) {
        this.opcao2 = opcao2;
    }

    public JRadioButton getOpcao3() {
        return opcao3;
    }

    public void setOpcao3(JRadioButton opcao3) {
        this.opcao3 = opcao3;
    }

    public JRadioButton getOpcao4() {
        return opcao4;
    }

    public void setOpcao4(JRadioButton opcao4) {
        this.opcao4 = opcao4;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel corretas;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel jquestao;
    private javax.swing.JRadioButton opcao1;
    private javax.swing.JRadioButton opcao2;
    private javax.swing.JRadioButton opcao3;
    private javax.swing.JRadioButton opcao4;
    private javax.swing.JButton proximo;
    // End of variables declaration//GEN-END:variables
    
    
}
