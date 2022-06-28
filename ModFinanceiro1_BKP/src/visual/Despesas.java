
package visual;

import java.io.File;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
//import jdk.internal.agent.Agent;


public class Despesas extends javax.swing.JFrame {

    public Despesas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelFornecedor1 = new javax.swing.JLabel();
        jLabelValrDesp1 = new javax.swing.JLabel();
        jLabelDescricao1 = new javax.swing.JLabel();
        jLabeldataDespe1 = new javax.swing.JLabel();
        txtFornecedor1 = new javax.swing.JTextField();
        txtValorDesp1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaDescricaoDespesa1 = new javax.swing.JTextArea();
        jButtonGravar = new javax.swing.JButton();
        jLabelComprovante = new javax.swing.JLabel();
        jButtonanxoimagemAnexarArquivo = new javax.swing.JButton();
        txtDataDesp1 = new javax.swing.JFormattedTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonGravar1 = new javax.swing.JButton();
        txtfile = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabelValrDesp2 = new javax.swing.JLabel();
        txtcentrocusto = new javax.swing.JTextField();
        jButtonGravar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesas");
        setResizable(false);

        jLabelFornecedor1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFornecedor1.setText("Fornecedor:");

        jLabelValrDesp1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelValrDesp1.setText("Valor da Despesa:");

        jLabelDescricao1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDescricao1.setText("Descrição:");

        jLabeldataDespe1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeldataDespe1.setText("Data da Despesa:");

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fornecedor", "Data", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jTableProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableProdutoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTableProduto);
        if (jTableProduto.getColumnModel().getColumnCount() > 0) {
            jTableProduto.getColumnModel().getColumn(0).setResizable(false);
            jTableProduto.getColumnModel().getColumn(1).setResizable(false);
            jTableProduto.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Registro de Despesas");

        jTextAreaDescricaoDespesa1.setColumns(20);
        jTextAreaDescricaoDespesa1.setRows(5);
        jScrollPane6.setViewportView(jTextAreaDescricaoDespesa1);

        jButtonGravar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonGravar.setText("Excluir Itens da Tabela");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jLabelComprovante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelComprovante.setText("Comprovante:");

        jButtonanxoimagemAnexarArquivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonanxoimagemAnexarArquivo.setText("Anexar Arquivo");
        jButtonanxoimagemAnexarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonanxoimagemAnexarArquivoActionPerformed(evt);
            }
        });

        try {
            txtDataDesp1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLimpar.setText("Limpar Campos");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonGravar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonGravar1.setText("Gravar");
        jButtonGravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabelValrDesp2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelValrDesp2.setText("Centro de Custo: ");

        jButtonGravar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonGravar2.setText("Atualizar");
        jButtonGravar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonGravar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGravar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabeldataDespe1)
                                    .addComponent(jLabelFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelValrDesp1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDataDesp1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorDesp1)
                                    .addComponent(txtFornecedor1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(jLabel4)))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValrDesp2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelComprovante, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtfile, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonanxoimagemAnexarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcentrocusto)
                                .addGap(473, 473, 473))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonGravar1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFornecedor1)
                            .addComponent(txtFornecedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescricao1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValrDesp1)
                            .addComponent(txtValorDesp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeldataDespe1)
                            .addComponent(txtDataDesp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValrDesp2)
                    .addComponent(txtcentrocusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComprovante)
                    .addComponent(txtfile)
                    .addComponent(jButtonanxoimagemAnexarArquivo))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonGravar)
                            .addComponent(jButton3)
                            .addComponent(jButtonGravar2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLimpar)
                            .addComponent(jButtonGravar1))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(900, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
             if(jTableProduto.getSelectedRow()!=-1){
        DefaultTableModel dtmProdutos = (DefaultTableModel)jTableProduto.getModel();
        dtmProdutos.removeRow(jTableProduto.getSelectedRow());
        //System.out.println("Linha Selecionada "+jTableProduto.getSelectedRows());
             }else{
             JOptionPane.showMessageDialog(null, "Selecione o item na tabela para excluir! ");
             }
      
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonanxoimagemAnexarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonanxoimagemAnexarArquivoActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("***Procurar Arquivo***");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("imagem", "jpg","png");
        
        fileChooser.setFileFilter(filter);
        int retorno = fileChooser.showOpenDialog(this);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            txtfile.setText(file.getPath());
                    
        }
        
        
    }//GEN-LAST:event_jButtonanxoimagemAnexarArquivoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        limparcampo();
       
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar1ActionPerformed
        
        DefaultTableModel dtmProdutos = (DefaultTableModel)jTableProduto.getModel();
        Object[] dados = {txtFornecedor1.getText(), txtDataDesp1.getText(), txtValorDesp1.getText()};
        dtmProdutos.addRow(dados);
    }//GEN-LAST:event_jButtonGravar1ActionPerformed

    private void jButtonGravar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravar2ActionPerformed
        // TODO add your handling code here:
        if(jTableProduto.getSelectedRow() != -1){
            jTableProduto.setValueAt(txtFornecedor1.getText(), jTableProduto.getSelectedRow(), 0);
            jTableProduto.setValueAt(txtDataDesp1.getText(), jTableProduto.getSelectedRow(), 1);
            jTableProduto.setValueAt(txtValorDesp1.getText(), jTableProduto.getSelectedRow(), 2);       
        }        
    }//GEN-LAST:event_jButtonGravar2ActionPerformed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked
        if(jTableProduto.getSelectedRow() != -1){
               txtFornecedor1.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 0).toString());
               txtDataDesp1.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 1).toString());
               txtValorDesp1.setText(jTableProduto.getValueAt(jTableProduto.getSelectedRow(), 2).toString());
}        // TODO add your handling code here:
    }//GEN-LAST:event_jTableProdutoMouseClicked

    private void jTableProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProdutoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTableProdutoKeyReleased

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Despesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonGravar1;
    private javax.swing.JButton jButtonGravar2;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonanxoimagemAnexarArquivo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelComprovante;
    private javax.swing.JLabel jLabelDescricao1;
    private javax.swing.JLabel jLabelFornecedor1;
    private javax.swing.JLabel jLabelValrDesp1;
    private javax.swing.JLabel jLabelValrDesp2;
    private javax.swing.JLabel jLabeldataDespe1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextArea jTextAreaDescricaoDespesa1;
    private javax.swing.JFormattedTextField txtDataDesp1;
    private javax.swing.JTextField txtFornecedor1;
    private javax.swing.JTextField txtValorDesp1;
    private javax.swing.JTextField txtcentrocusto;
    private javax.swing.JTextField txtfile;
    // End of variables declaration//GEN-END:variables

public void limparcampo(){
    
     txtFornecedor1.setText("");
     txtValorDesp1.setText("");
     txtDataDesp1.setText("");
     txtDataDesp1.setText(""); 
     jTextAreaDescricaoDespesa1.setText(""); 
     txtfile.setText("");
     txtcentrocusto.setText("");
     

}

}
