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
import Metodos.MetodosDaReserva;
import Metodos.MetodosDoFilme;
import Metodos.MetodosDoSala;
import sistema.Cliente;
import sistema.Filmes;
import sistema.Reservas;
import sistema.Sala;

/**
 *
 * @author tsaman.sumbane
 */
public class JFrmReserva extends javax.swing.JFrame {
    Vector <Reservas> rs =null;
    Vector<Filmes> listaDeFilmes =null;
    Vector<Sala> sa =null;
    Vector <Cliente> cl =null;
    int contactoCliente;
    String codigo, nomeCliente, nomeFilme, generoFilme;
    
    

    /**
     * Creates new form JFrmReserva
     */
    public JFrmReserva() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaReserva = new javax.swing.JTable();
        comboBoxTitulo = new javax.swing.JComboBox<>();
        comboBoxGenero = new javax.swing.JComboBox<>();
        comboBoxbi = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboBoxSala = new javax.swing.JComboBox<>();
        txtSala = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        lblCodigo.setText("Codigo");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(10, 90, 110, 22);
        getContentPane().add(txtNomeCliente);
        txtNomeCliente.setBounds(10, 290, 360, 30);

        lblNomeCliente.setText("Nome cliente");
        getContentPane().add(lblNomeCliente);
        lblNomeCliente.setBounds(10, 270, 190, 14);

        jLabel2.setText("Titulo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 340, 150, 14);

        jLabel3.setText("Genero");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 430, 100, 14);

        jLabel1.setText("Contacto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 430, 70, 14);

        txtContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactoActionPerformed(evt);
            }
        });
        getContentPane().add(txtContacto);
        txtContacto.setBounds(210, 450, 150, 30);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(430, 90, 140, 60);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(430, 230, 140, 60);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(430, 160, 140, 60);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("RESERVAS");
        jPanel1.add(jLabel4);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 10, 440, 40);

        tabelaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número da sala", "Nome de cliente", "Nome do filme", "Genero", "Contacto"
            }
        ));
        tabelaReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaReservaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaReserva);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 620, 780, 190);

        getContentPane().add(comboBoxTitulo);
        comboBoxTitulo.setBounds(10, 370, 360, 30);

        getContentPane().add(comboBoxGenero);
        comboBoxGenero.setBounds(10, 450, 160, 30);

        getContentPane().add(comboBoxbi);
        comboBoxbi.setBounds(10, 210, 360, 30);

        jLabel5.setText("Sala");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 490, 40, 14);

        getContentPane().add(comboBoxSala);
        comboBoxSala.setBounds(10, 510, 160, 30);
        getContentPane().add(txtSala);
        txtSala.setBounds(10, 570, 160, 30);

        jLabel6.setText("Nome da sala");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 550, 90, 14);

        jLabel7.setText("Bilhete de identidade");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 180, 110, 14);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(10, 120, 360, 30);

        setSize(new java.awt.Dimension(816, 860));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
            String codigo = txtNomeCliente.getText();
            String nomeCliente = txtNomeCliente.getText();
            String nomeFilme = comboBoxTitulo.getSelectedItem()+"";
            String generoFilme = comboBoxGenero.getSelectedItem()+"";
            String sala = comboBoxSala.getSelectedItem()+"";
            String nomeDaSala = txtSala.getText();
            int contactoCliente = Integer.parseInt(txtContacto.getText());
            
            try {
                MetodosDaReserva.adicionarReservaNoFicheiro(codigo, nomeCliente, nomeFilme, generoFilme, contactoCliente, nomeDaSala, sala);
                JOptionPane.showMessageDialog(null, "adicionado com sucesso");
                limparCaixasDeTexto();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error 404 Not Found");
            }
    }//GEN-LAST:event_btnAdicionarActionPerformed
            private void limparCaixasDeTexto()
             {
                txtNomeCliente.setText("");
                txtNomeCliente.setText("");
                txtSala.setText("");
                txtContacto.setText("");
                   }
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
         String codigo= txtNomeCliente.getText();
        String nomeCliente = txtNomeCliente.getText();

        int contacto = Integer.parseInt(txtContacto.getText());
 
        try
        {
             rs=MetodosDaReserva.listaDaReserva();
            MetodosDaReserva.atualizarReserva(rs, codigo, nomeCliente, nomeFilme, generoFilme, contactoCliente);
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
            limparCaixasDeTexto();
            listar();
    
        }catch(IOException e1){
            JOptionPane.showMessageDialog(null, "nao foi possivel");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    public void listar(){
         DefaultTableModel modeloDaTabela= (DefaultTableModel)tabelaReserva.getModel();
        modeloDaTabela.setNumRows(0);
        try{
            rs=MetodosDaReserva.listaDaReserva();
           for(Reservas reserva: rs){
            modeloDaTabela.addRow(new Object[]{
                reserva.getCodigo(),
                reserva.getNomeCliente(),
                reserva.getNomeFilme(),
                reserva.getGeneroFilme(),
                reserva.getContactoCliente(),
                reserva.getSala(),
                reserva.getNomeDaSala()
                
            });
           
           }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "nao foi possivel listar");
        }
    }
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void tabelaReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaReservaMouseClicked
       if(tabelaReserva.getSelectedRow()!=-1){
            int indice= tabelaReserva.getSelectedRow();
            TableModel modelo=tabelaReserva.getModel();
            txtNomeCliente.setText(modelo.getValueAt(indice,0).toString());
            txtNomeCliente.setText(modelo.getValueAt(indice,1).toString());
            
            txtContacto.setText(modelo.getValueAt(indice,4).toString());
                 
        }         
    }//GEN-LAST:event_tabelaReservaMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        try {
            listaDeFilmes=MetodosDoFilme.listaDeFilme();
            for (Filmes s : listaDeFilmes) {
                 comboBoxTitulo.addItem(s.getNome());
                 comboBoxGenero.addItem(s.getGenero());
                 
                 
                 }
            sa=MetodosDoSala.listaDeSala();
                    for (Sala sa : sa ) {
                     comboBoxSala.addItem(sa.getNumeroDaSala());
                        
                        
                    }
        } catch (IOException ex) {
            Logger.getLogger(JFrmReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                 
                         
    }//GEN-LAST:event_formWindowActivated

    private void txtContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox<String> comboBoxGenero;
    private javax.swing.JComboBox<String> comboBoxSala;
    private javax.swing.JComboBox<String> comboBoxTitulo;
    private javax.swing.JComboBox<String> comboBoxbi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JTable tabelaReserva;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtSala;
    // End of variables declaration//GEN-END:variables
}
