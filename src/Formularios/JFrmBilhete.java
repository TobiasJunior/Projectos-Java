/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Metodos.MetodosDoBilhete;
import Metodos.MetodosDoCinema;
import Metodos.MetodosDoSala;
import java.io.IOException;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sistema.Bilhete;
import sistema.Cinema;
import sistema.Sala;

/**
 *
 * @author it Solution
 */
public class JFrmBilhete extends javax.swing.JFrame {
     Vector<Cinema> lista =null;
     Vector<Bilhete> listas =null;
     Vector<Sala> sa =null;
     
    /**
     * Creates new form JFrmBilhete
     */
    public JFrmBilhete() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNib = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboBoxSala = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaBilhete = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        comboBoxCinema = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comboBoxEndereco = new javax.swing.JComboBox<>();

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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("BILHETE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 90, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(180, 20, 300, 40);

        jLabel2.setText("Cinema");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 100, 60, 14);

        jLabel3.setText("NIB");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 80, 14);
        getContentPane().add(txtNib);
        txtNib.setBounds(20, 190, 270, 30);

        jLabel4.setText("Data");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 240, 40, 20);
        getContentPane().add(txtData);
        txtData.setBounds(20, 260, 270, 30);

        jLabel5.setText("Sala");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 310, 40, 20);

        getContentPane().add(comboBoxSala);
        comboBoxSala.setBounds(20, 340, 270, 30);

        tabelaBilhete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cinema", "NIB", "Data", "Sala", "Endereco"
            }
        ));
        jScrollPane1.setViewportView(tabelaBilhete);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 480, 710, 250);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(350, 120, 110, 60);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(350, 200, 110, 60);

        btnAtualizar.setText("Atualizar");
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(350, 280, 110, 60);

        getContentPane().add(comboBoxCinema);
        comboBoxCinema.setBounds(20, 120, 270, 30);

        jLabel6.setText("Endereco");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 390, 80, 14);

        getContentPane().add(comboBoxEndereco);
        comboBoxEndereco.setBounds(20, 420, 270, 30);

        setSize(new java.awt.Dimension(769, 793));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String cinema = comboBoxCinema.getSelectedItem()+"";
        String nib = txtNib.getText();
        String data = txtData.getText();
        String sala = comboBoxSala.getSelectedItem()+"";
        String endereco = comboBoxEndereco.getSelectedItem()+"";
        
         try {
             MetodosDoBilhete.adicionarSessaoNoFicheiro(cinema, nib, data, sala, endereco);
             JOptionPane.showMessageDialog(null, "Sucesso!");
         } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, "Error 404 not found");
         }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(tabelaBilhete.getSelectedRow()!=-1){
            int indice= tabelaBilhete.getSelectedRow();
            TableModel modelo=tabelaBilhete.getModel();
            txtNib.setText(modelo.getValueAt(indice,0).toString());
            txtData.setText(modelo.getValueAt(indice,3).toString());     
        }        
    }//GEN-LAST:event_formMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
                lista=MetodosDoCinema.listaDeCinema();
                for (Cinema s : lista) {
                 comboBoxCinema.addItem(s.getNome_cinema());
                 comboBoxEndereco.addItem(s.getEndereco());
                 
                 
            Calendar cal = Calendar.getInstance();
            String data= cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)+ "/"+ cal.get(Calendar.MONTH)
                    + "/"+ cal.get(Calendar.YEAR);
            txtData.setText(data);
            
                 sa=MetodosDoSala.listaDeSala();
                    for (Sala sa : sa ) {
                        comboBoxSala.addItem(sa.getNumeroDaSala());
                        
                        
                    }
                
                 }             
        } catch (IOException ex) {
                Logger.getLogger(JFrnFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

   public void listar(){
         DefaultTableModel modeloDaTabela= (DefaultTableModel)tabelaBilhete.getModel();
        modeloDaTabela.setNumRows(0);
        try{
            
            listas=MetodosDoBilhete.listaDoBilhete();
           for(Bilhete bilhete: listas){
            modeloDaTabela.addRow(new Object[]{
                bilhete.getCinema(),
                bilhete.getNib(),  
                bilhete.getData(),
                bilhete.getSala(),
                bilhete.getEndereco()
            });
           
           }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "nao foi possivel listar");
        }
    }
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
            java.util.logging.Logger.getLogger(JFrmBilhete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmBilhete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmBilhete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmBilhete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmBilhete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox<String> comboBoxCinema;
    private javax.swing.JComboBox<String> comboBoxEndereco;
    private javax.swing.JComboBox<String> comboBoxSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaBilhete;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtNib;
    // End of variables declaration//GEN-END:variables
}