/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import functions.CadastroUsuarios;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author mark
 */
public class telaAdicionarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form telaAdicionarUsuario
     */
    public telaAdicionarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgUser = new javax.swing.JLabel();
        textConfirmPassWord = new javax.swing.JLabel();
        textTitulo = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        textNome1 = new javax.swing.JLabel();
        inputConfirmPassWord = new javax.swing.JPasswordField();
        textPassWord1 = new javax.swing.JLabel();
        inputPassWord = new javax.swing.JPasswordField();
        btConfirma = new javax.swing.JButton();
        txtNaoUsar = new javax.swing.JLabel();
        btMostrarData = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Usuário");
        setResizable(false);
        setSize(new java.awt.Dimension(420, 331));
        getContentPane().setLayout(null);

        imgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/iconnUser.png"))); // NOI18N
        getContentPane().add(imgUser);
        imgUser.setBounds(0, 10, 540, 90);

        textConfirmPassWord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textConfirmPassWord.setForeground(new java.awt.Color(255, 255, 255));
        textConfirmPassWord.setText("Confirmar senha:");
        getContentPane().add(textConfirmPassWord);
        textConfirmPassWord.setBounds(51, 250, 119, 30);

        textTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitulo.setText("Adicionar Funcionário");
        getContentPane().add(textTitulo);
        textTitulo.setBounds(0, 100, 540, 30);

        inputName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inputName.setForeground(new java.awt.Color(51, 51, 51));
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });
        getContentPane().add(inputName);
        inputName.setBounds(170, 140, 300, 30);

        textNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textNome1.setForeground(new java.awt.Color(255, 255, 255));
        textNome1.setText("Nome de Usuário:");
        getContentPane().add(textNome1);
        textNome1.setBounds(40, 140, 130, 30);

        inputConfirmPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputConfirmPassWordActionPerformed(evt);
            }
        });
        getContentPane().add(inputConfirmPassWord);
        inputConfirmPassWord.setBounds(170, 250, 300, 30);

        textPassWord1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textPassWord1.setForeground(new java.awt.Color(255, 255, 255));
        textPassWord1.setText("Senha:");
        getContentPane().add(textPassWord1);
        textPassWord1.setBounds(120, 200, 50, 30);

        inputPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPassWordActionPerformed(evt);
            }
        });
        getContentPane().add(inputPassWord);
        inputPassWord.setBounds(170, 200, 300, 30);

        btConfirma.setBackground(new java.awt.Color(0, 153, 51));
        btConfirma.setText("Ok!");
        btConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmaActionPerformed(evt);
            }
        });
        getContentPane().add(btConfirma);
        btConfirma.setBounds(413, 320, 90, 30);

        txtNaoUsar.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        txtNaoUsar.setForeground(new java.awt.Color(255, 255, 255));
        txtNaoUsar.setText("Exibir senha");
        getContentPane().add(txtNaoUsar);
        txtNaoUsar.setBounds(400, 280, 60, 10);

        btMostrarData.setBackground(new java.awt.Color(255, 204, 0));
        btMostrarData.setForeground(new java.awt.Color(255, 204, 0));
        btMostrarData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarDataActionPerformed(evt);
            }
        });
        getContentPane().add(btMostrarData);
        btMostrarData.setBounds(410, 290, 30, 10);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fundoPlanoLoguin.jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 560, 440);

        setSize(new java.awt.Dimension(557, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputConfirmPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputConfirmPassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputConfirmPassWordActionPerformed

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void inputPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPassWordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_inputPassWordActionPerformed

    
    
    
    private void btConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmaActionPerformed
        // TODO add your handling code here:
        CadastroUsuarios user = new CadastroUsuarios(inputName.getText(), inputPassWord.getText());
        if(inputPassWord.getText().equals(inputConfirmPassWord.getText()) && !inputName.getText().equals("") && !inputPassWord.getText().equals("") && !inputConfirmPassWord.getText().equals("")){
            user.SalvarUsuario(inputName.getText());
            user.SalvarSenha(inputPassWord.getText());
            JOptionPane.showMessageDialog(null, "|OP|->Cadastro Realizado.\nSucesso!");
            telaLogin tela = new telaLogin();
            tela.setVisible(true);
            dispose();
        }else
            if(!inputPassWord.getText().equals(inputConfirmPassWord.getText())){
            JOptionPane.showMessageDialog(null, "|OP|->Verifique as Senhas\nIncompatibilidade...");
            inputPassWord.setForeground(Color.red);
            inputPassWord.setEchoChar((char) 0);
            inputConfirmPassWord.setForeground(Color.red);
            inputConfirmPassWord.setEchoChar((char) 0);
            }else
                if(inputName.getText().equals("") && inputPassWord.getText().equals("") && inputConfirmPassWord.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "|OP|->Preencha todos os campos!"); 
                }else
                    if(!inputName.getText().equals("") && inputPassWord.getText().equals("") && inputConfirmPassWord.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "|OP|->Preencha todos os campos!\nO cadastro deve conter uma senha.");
                    }else
                        if(inputName.getText().equals("") && !inputPassWord.getText().equals("") && !inputConfirmPassWord.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "|OP|->Preencha todos os campos!\nO cadastro deve conter um nome de usuário.");
                    }
       
    }//GEN-LAST:event_btConfirmaActionPerformed

    private void btMostrarDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarDataActionPerformed
        
            inputPassWord.setEchoChar((char) 0);
            inputConfirmPassWord.setEchoChar((char) 0);
            
    }//GEN-LAST:event_btMostrarDataActionPerformed

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
            java.util.logging.Logger.getLogger(telaAdicionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAdicionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAdicionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAdicionarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAdicionarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirma;
    private javax.swing.JButton btMostrarData;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel imgUser;
    private javax.swing.JPasswordField inputConfirmPassWord;
    private javax.swing.JTextField inputName;
    private javax.swing.JPasswordField inputPassWord;
    private javax.swing.JLabel textConfirmPassWord;
    private javax.swing.JLabel textNome1;
    private javax.swing.JLabel textPassWord1;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel txtNaoUsar;
    // End of variables declaration//GEN-END:variables
}
