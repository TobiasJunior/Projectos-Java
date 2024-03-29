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
import Metodos.MetodosDaProdutora;
import sistema.Produtora;

/**
 *
 * @author tsaman.sumbane
 */
public class JFrmProdutora extends javax.swing.JFrame {
     Vector <Produtora> lista=null;

    /**
     * Creates new form JFrmProdutora
     */
    public JFrmProdutora() {
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

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProdutora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutora = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 90, 60, 14);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(30, 110, 220, 30);

        jLabel2.setText("Produtora");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 70, 14);
        getContentPane().add(txtProdutora);
        txtProdutora.setBounds(30, 170, 220, 30);

        jLabel3.setText("Endereço");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 210, 50, 14);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(30, 230, 220, 30);

        tabelaProdutora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Produtora", "Endereço"
            }
        ));
        tabelaProdutora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutora);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 680, 230);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(310, 110, 90, 30);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(310, 150, 90, 30);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(310, 190, 90, 30);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(310, 230, 90, 30);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(610, 110, 90, 30);
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(450, 110, 150, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("PRODUTORA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 10, 140, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(250, 10, 240, 40);

        setSize(new java.awt.Dimension(766, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void listar (){
       DefaultTableModel modeloDaTabela= (DefaultTableModel)tabelaProdutora.getModel();
        modeloDaTabela.setNumRows(0);
        try{
            lista=MetodosDaProdutora.listaDaProdutora();
           for(Produtora pro: lista){
            modeloDaTabela.addRow(new Object[]{
                pro.getCodigo(),
                pro.getNome_produtora(),
                pro.getEndereco()        
            });
           
           }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "nao foi possivel listar");
        }
    }
    public void limparCaixaDeText () {
        txtCodigo.setText("");
        txtProdutora.setText("");
        txtEndereco.setText("");
    }
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
       String codigo = txtCodigo.getText();
       String nome_produtora = txtProdutora.getText();
       String endereco = txtEndereco.getText();
       
       try {
           MetodosDaProdutora.adicionar(codigo, nome_produtora, endereco);
           JOptionPane.showMessageDialog(null, "Adicionado com sucesso");
           limparCaixaDeText();
       } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
    }//GEN-LAST:event_formMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
         String codigo = txtCodigo.getText();
            String nome_produtora = txtProdutora.getText();
            String endereco = txtEndereco.getText();
       
       try {
           lista=MetodosDaProdutora.listaDaProdutora();
           MetodosDaProdutora.atualizarProdutora(lista, codigo, nome_produtora, endereco);
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
            limparCaixaDeText();
            listar();
    
        }catch(IOException e1){
            JOptionPane.showMessageDialog(null, "nao foi possivel");
        }
       
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tabelaProdutoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoraMouseClicked
       if(tabelaProdutora.getSelectedRow()!=-1){
            int indice= tabelaProdutora.getSelectedRow();
            TableModel modelo=tabelaProdutora.getModel();
            txtCodigo.setText(modelo.getValueAt(indice,0).toString());
            txtProdutora.setText(modelo.getValueAt(indice,1).toString());
            txtEndereco.setText(modelo.getValueAt(indice,2).toString());
        }
    }//GEN-LAST:event_tabelaProdutoraMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
       String codigo = txtCodigo.getText();
        
            try {
                lista = MetodosDaProdutora.listaDaProdutora();
                MetodosDaProdutora.RemoverProdutora(lista, codigo);
                JOptionPane.showMessageDialog(null, "removido com sucesso");
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null, "error");
            }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
         String codigo=txtPesquisar.getText();
        String nome_produtora = txtPesquisar.getText();
        String endereco = txtPesquisar.getText();
        
        try {
            DefaultTableModel modeloDaTabela= (DefaultTableModel)tabelaProdutora.getModel();
            modeloDaTabela.setNumRows(0);
            lista=MetodosDaProdutora.listaDaProdutora();
            for (Produtora pro : lista) {
                if (pro.getCodigo().equalsIgnoreCase(codigo)|| pro.getNome_produtora().equalsIgnoreCase(nome_produtora) || pro.getEndereco().equalsIgnoreCase(endereco)){
                    modeloDaTabela.addRow(new Object []{
                     pro.getCodigo(),
                     pro.getNome_produtora(),
                     pro.getEndereco()
                     
                             });
                } 
                    
            } 
        } catch (IOException ex) {
           
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            lista = MetodosDaProdutora.listaDaProdutora();
            int codigo = MetodosDaProdutora.linhasDoFicheiro();
              txtCodigo.setText((codigo+1)+"");
        } catch (IOException ex) {
            Logger.getLogger(JFrrCinema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(JFrmProdutora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmProdutora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmProdutora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmProdutora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmProdutora().setVisible(true);
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
    private javax.swing.JTable tabelaProdutora;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtProdutora;
    // End of variables declaration//GEN-END:variables
}
