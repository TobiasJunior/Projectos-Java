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
import sistema.Cinema;
import Metodos.MetodosDoCinema;

/**
 *
 * @author Edson Nhampossa
 */
public class JFrrCinema extends javax.swing.JFrame {
    Vector<Cinema> lista =null; 

    /**
     * Creates new form JFrrCinema
     */
    public JFrrCinema() {
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
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCinema = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Código");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 120, 60, 20);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(40, 150, 400, 30);

        jLabel2.setText("Nome do cinema");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 190, 90, 20);
        getContentPane().add(txtNome);
        txtNome.setBounds(40, 220, 400, 30);

        jLabel3.setText("Endereco");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 270, 70, 20);
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(40, 300, 400, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("CINEMA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(130, 10, 110, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 60, 360, 50);

        tabelaCinema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome do cinema", "Endereço", "Contacto"
            }
        ));
        tabelaCinema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCinemaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCinema);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 490, 890, 220);

        btnAdicionar.setText("Adcionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(490, 150, 100, 50);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(490, 220, 100, 50);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(490, 290, 100, 50);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(490, 360, 100, 50);
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(610, 150, 180, 30);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(820, 150, 120, 30);

        jLabel5.setText("Contacto");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 350, 60, 14);
        getContentPane().add(txtContacto);
        txtContacto.setBounds(40, 380, 400, 30);

        setSize(new java.awt.Dimension(986, 771));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    public void listar (){
        DefaultTableModel modelo= (DefaultTableModel)tabelaCinema.getModel();
        modelo.setNumRows(0);
         try{
            lista=MetodosDoCinema.listaDeCinema();
           for(Cinema cinema: lista){
            modelo.addRow(new Object[]{
                cinema.getCodigo(),
                cinema.getNome_cinema(),
                cinema.getEndereco(),
                cinema.getContacto()
            });
           
           }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "nao foi possivel listar");
        }
    }
    
    public void limpar () {
        txtCodigo.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtContacto.setText("");
    }
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String codigo = txtCodigo.getText();
        String nome_cinema = txtNome.getText();
        String endereco = txtEndereco.getText();
        String contacto = txtContacto.getText();
        
        try {
            MetodosDoCinema.adicionarCinema(codigo, nome_cinema, endereco, contacto);
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso");
            limpar();
            listar();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tabelaCinemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCinemaMouseClicked
        if(tabelaCinema.getSelectedRow()!=-1){
            int indice= tabelaCinema.getSelectedRow();
            TableModel modelo=tabelaCinema.getModel();
            txtCodigo.setText(modelo.getValueAt(indice,0).toString());
            txtNome.setText(modelo.getValueAt(indice,1).toString());
            txtEndereco.setText(modelo.getValueAt(indice,2).toString());
            txtContacto.setText(modelo.getValueAt(indice,3).toString());
        }         
    }//GEN-LAST:event_tabelaCinemaMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String codigo= txtCodigo.getText();
        String nome_cinema = txtNome.getText();
        String endereco = txtEndereco.getText();
        String contacto = txtContacto.getText();
      
        try
        {
             lista=MetodosDoCinema.listaDeCinema();
            MetodosDoCinema.atualizarCinema(lista, codigo, nome_cinema, endereco, contacto);
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");    
    
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "nao foi possivel");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        String codigo = txtCodigo.getText();
        String nome_cinema = txtNome.getText();
        String endereco = txtEndereco.getText();
        
        try { 
           
              
            lista=MetodosDoCinema.listaDeCinema();
            MetodosDoCinema.remover(lista, codigo);
            JOptionPane.showMessageDialog(null, "O cinema " +nome_cinema+ " foi removido com sucesso");
        } catch (IOException ex) {
            Logger.getLogger(JFrmDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            lista = MetodosDoCinema.listaDeCinema();
            int codigo = MetodosDoCinema.linhasDoFicheiro();
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
            java.util.logging.Logger.getLogger(JFrrCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrrCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrrCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrrCinema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrrCinema().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCinema;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}