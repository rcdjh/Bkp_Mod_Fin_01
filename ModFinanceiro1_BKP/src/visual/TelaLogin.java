package visual;

import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUser = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        txtsenha = new javax.swing.JPasswordField();
        jButtonentrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUser.setText("Login:");
        getContentPane().add(jLabelUser);
        jLabelUser.setBounds(70, 170, 60, 14);
        getContentPane().add(txtlogin);
        txtlogin.setBounds(150, 160, 230, 30);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(70, 200, 60, 14);
        getContentPane().add(txtsenha);
        txtsenha.setBounds(150, 200, 230, 30);

        jButtonentrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonentrar.setText("Entrar");
        jButtonentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonentrarActionPerformed(evt);
            }
        });
        jButtonentrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonentrarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonentrar);
        jButtonentrar.setBounds(150, 240, 70, 23);

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(250, 240, 80, 23);

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo-login.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoLogin);
        jLabelFundoLogin.setBounds(0, 0, 474, 350);

        setSize(new java.awt.Dimension(490, 386));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonentrarActionPerformed
            if(txtlogin.getText().equals("")&&txtsenha.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Bem Vindo! ");
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
        dispose(); 
            }else{
            JOptionPane.showMessageDialog(null, "Dados Incorreto");
            }

        
    }//GEN-LAST:event_jButtonentrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonentrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonentrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonentrarKeyPressed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonentrar;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}
