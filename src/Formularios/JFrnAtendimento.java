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
import sistema.Atendimento;
import Metodos.MetodosDoAtendimento;

/**
 *
 * @author tsaman.sumbane
 */
public class JFrnAtendimento extends javax.swing.JFrame {
    Vector <Atendimento> lista =null; 

    /**
     * Creates new form JFrnAtendimento
     */
    public JFrnAtendimento() {
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
        txtCodigoFunc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtServicos = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        btmPesquisar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAtendimento = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Código do funcionário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(21, 76, 210, 14);
        getContentPane().add(txtCodigoFunc);
        txtCodigoFunc.setBounds(20, 100, 260, 30);

        jLabel2.setText("Código do cliente");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 150, 230, 14);
        getContentPane().add(txtCodigoCliente);
        txtCodigoCliente.setBounds(20, 170, 260, 30);

        jLabel3.setText("Data");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 220, 100, 10);
        getContentPane().add(txtData);
        txtData.setBounds(20, 240, 120, 30);

        jLabel4.setText("Hora");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 220, 110, 14);
        getContentPane().add(txtHora);
        txtHora.setBounds(160, 240, 120, 30);

        jLabel5.setText("Serviços");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 290, 190, 14);
        getContentPane().add(txtServicos);
        txtServicos.setBounds(20, 310, 260, 30);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(330, 100, 90, 50);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(330, 160, 90, 50);

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 220, 90, 50);
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(450, 100, 150, 30);

        btmPesquisar.setText("Pesquisar");
        getContentPane().add(btmPesquisar);
        btmPesquisar.setBounds(620, 100, 100, 30);

        btnRemover.setText("Remover");
        getContentPane().add(btnRemover);
        btnRemover.setBounds(330, 290, 90, 50);

        tabelaAtendimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do funcionário", "Coódigo do cliente", "Data", "Hora", "Serviços"
            }
        ));
        tabelaAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAtendimentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAtendimento);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 380, 690, 250);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Atendimento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 10, 100, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 20, 290, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limparCaixaDeTexto () {
        txtCodigoFunc.setText("");
        txtCodigoCliente.setText("");
        txtData.setText("");
        txtHora.setText("");
        txtServicos.setText("");
    }
    
    public void listar () {
        DefaultTableModel modeloDaTabela = (DefaultTableModel)tabelaAtendimento.getModel();
        modeloDaTabela.setNumRows(0);
        
        try {
            lista = MetodosDoAtendimento.listaDoAtendimento();
            for (Atendimento atendimento : lista) {
                modeloDaTabela.addRow(new Object[] {
                    atendimento.getCodigo_func(),
                     atendimento.getCodigo_cliente(),
                     atendimento.getData(),
                     atendimento.getHora(),
                     atendimento.getServicos()
                    
                });
                
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String codigo = txtCodigoFunc.getText();
        String codigo_cliente = txtCodigoCliente.getText();
        String data = txtData.getText();
        String hora = txtHora.getText();
        String servicos = txtServicos.getText();
        
        try {
            MetodosDoAtendimento.adicionarSessaoNoFicheiro(codigo, codigo_cliente, data, hora, servicos);
            JOptionPane.showMessageDialog(null, "adicionado com sucesso");
            limparCaixaDeTexto();
            listar();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = txtCodigoFunc.getText();
        String codigo_cliente = txtCodigoCliente.getText();
        String data = txtData.getText();
        String hora = txtHora.getText();
        String servicos = txtServicos.getText();
        
        try {
            lista = MetodosDoAtendimento.listaDoAtendimento();
            MetodosDoAtendimento.atualizarAtendimento(lista, codigo, data, hora, servicos);
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
            limparCaixaDeTexto();
            
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error");;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaAtendimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAtendimentoMouseClicked
        if (tabelaAtendimento.getSelectedRow()!=-1) {
            int indice = tabelaAtendimento.getSelectedRow();
            TableModel modelo = tabelaAtendimento.getModel();
            txtCodigoFunc.setText(modelo.getValueAt(indice, 0).toString());
            txtCodigoCliente.setText(modelo.getValueAt(indice, 1).toString());
            txtData.setText(modelo.getValueAt(indice, 2).toString());
            txtHora.setText(modelo.getValueAt(indice, 3).toString());
            txtServicos.setText(modelo.getValueAt(indice, 4).toString());
            
        }
    }//GEN-LAST:event_tabelaAtendimentoMouseClicked

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
            java.util.logging.Logger.getLogger(JFrnAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrnAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrnAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrnAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrnAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmPesquisar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAtendimento;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtCodigoFunc;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtServicos;
    // End of variables declaration//GEN-END:variables
}