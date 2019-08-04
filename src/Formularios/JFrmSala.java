/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Metodos.MetodosDoSala;
import sistema.Sala;

/**
 *
 * @author Devil
 */
public class JFrmSala extends javax.swing.JFrame {
    Vector<Sala> listaDeSala =null;
    int numeroDaSala;
    int capacidade;
    
public String [] colunasTab = {"Número da sala", "Capacidade"};
public DefaultTableModel tabela = new DefaultTableModel();

    
    /**
     * Creates new form JFrmSala
     */
    public JFrmSala() throws IOException {
        initComponents();
       
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCapacidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSala = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroDaSala = new javax.swing.JTextField();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("SALAS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 80, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(170, 10, 350, 50);

        jLabel2.setText("Número da sala");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 180, 90, 30);
        getContentPane().add(txtCapacidade);
        txtCapacidade.setBounds(230, 210, 160, 30);

        jLabel3.setText("Capacidade");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 184, 80, 20);
        getContentPane().add(txtNome);
        txtNome.setBounds(20, 130, 160, 30);

        tabelaSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome da sala", "Número da sala", "Capacidade"
            }
        ));
        tabelaSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSalaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSala);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 530, 240);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(580, 320, 100, 60);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(580, 180, 100, 60);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(580, 250, 100, 60);

        jLabel4.setText("Nome da sala");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 80, 14);
        getContentPane().add(txtNumeroDaSala);
        txtNumeroDaSala.setBounds(20, 210, 160, 30);
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(460, 90, 170, 30);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(650, 90, 110, 30);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(580, 390, 100, 60);

        setSize(new java.awt.Dimension(802, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String nome = txtNome.getText();
        String numeroDaSala = txtNumeroDaSala.getText();
        String capacidade = txtCapacidade.getText();
        
        try {
            MetodosDoSala.adicionarSala(nome, numeroDaSala, capacidade);
            JOptionPane.showMessageDialog(null, "adicionado com sucesso");
            listar();
            limparCaixaDeTexto();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error 404 not found");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed
public void listar(){
         DefaultTableModel modeloDaTabela= (DefaultTableModel)tabelaSala.getModel();
        modeloDaTabela.setNumRows(0);
        try{
            listaDeSala=MetodosDoSala.listaDeSala();
           for(Sala sala: listaDeSala){
            modeloDaTabela.addRow(new Object[]{
                sala.getNome(),
                sala.getNumeroDaSala(),
                sala.getCapacidade()
            });
           
           }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "nao foi possivel listar");
        }
    }

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void tabelaSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSalaMouseClicked
        
        if(tabelaSala.getSelectedRow()!=-1){
            int indice= tabelaSala.getSelectedRow();
            TableModel modelo=tabelaSala.getModel();
            txtNome.setText(modelo.getValueAt(indice,0).toString());
            txtNumeroDaSala.setText(modelo.getValueAt(indice,1).toString());
            txtCapacidade.setText(modelo.getValueAt(indice,2).toString());
                 
        }                            
    }//GEN-LAST:event_tabelaSalaMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
         String nome = txtNome.getText();
        String numeroDaSala= txtNumeroDaSala.getText();
        String capacidade = txtCapacidade.getText();
       
        try
        {
             listaDeSala=MetodosDoSala.listaDeSala();
            MetodosDoSala.atualizarSala(listaDeSala, nome, numeroDaSala, capacidade);
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
            listar();
            limparCaixaDeTexto();
    
        }catch(IOException e1){
            JOptionPane.showMessageDialog(null, "nao foi possivel");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome=txtPesquisar.getText();
        String numeroDaSala = txtPesquisar.getText();
        String capacidade = txtPesquisar.getText();
        
        try {
            DefaultTableModel modeloDaTabela= (DefaultTableModel)tabelaSala.getModel();
            modeloDaTabela.setNumRows(0);
            listaDeSala=MetodosDoSala.listaDeSala();
            for (Sala sa : listaDeSala) {
                if (sa.getNome().equalsIgnoreCase(nome)|| sa.getNumeroDaSala().equalsIgnoreCase(numeroDaSala) || sa.getCapacidade().equalsIgnoreCase(capacidade)){
                    modeloDaTabela.addRow(new Object []{
                     sa.getNome(),
                     sa.getNumeroDaSala(),
                     sa.getCapacidade()
                     
                             });
                } 
                    
            } 
        } catch (IOException ex) {
           
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
          String numeroDaSala = txtNumeroDaSala.getText();
        
            try {
                listaDeSala = MetodosDoSala.listaDeSala();
                MetodosDoSala.removerSala(listaDeSala, numeroDaSala);
                JOptionPane.showMessageDialog(null, "removido com sucesso");
                limparCaixaDeTexto();
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null, "error");
            }
    }//GEN-LAST:event_btnRemoverActionPerformed
    
    public void limparCaixaDeTexto () {
        txtNome.setText("");
        txtNumeroDaSala.setText("");
        txtCapacidade.setText("");
        
    }
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
            java.util.logging.Logger.getLogger(JFrmSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrmSala().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(JFrmSala.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaSala;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroDaSala;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
