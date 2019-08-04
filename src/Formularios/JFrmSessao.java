
package Formularios;

import java.io.IOException;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sistema.Filmes;
import Metodos.MetodosDaSessao;
import Metodos.MetodosDoFilme;
import Metodos.MetodosDoSala;
import sistema.Cliente;
import sistema.Departamento;
import sistema.Sala;
import sistema.Sessao;

/**
 *
 * @author tsaman.sumbane
 */
public class JFrmSessao extends javax.swing.JFrame {
     Vector<Sessao> ss =null;
      Vector<Filmes> listaDeFilmes =null;
     Vector<Sala> sa =null;
     Vector <Cliente> cl =null;
    
   
    public JFrmSessao() {
        initComponents();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSessao = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxFilme = new javax.swing.JComboBox<>();
        comboBoxGenero = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboBoxAno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboBoxSala = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboBoxHorario = new javax.swing.JComboBox<>();
        btnRemover = new javax.swing.JButton();

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

        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(10, 100, 80, 14);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(10, 120, 420, 29);

        jLabel4.setText("Nome do filme");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 240, 110, 14);

        jLabel5.setText("Genero");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 170, 60, 14);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(510, 120, 110, 60);

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(510, 200, 110, 60);

        BtnAtualizar.setText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAtualizar);
        BtnAtualizar.setBounds(510, 280, 110, 60);

        tabelaSessao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do filme", "Data", "Sala", "Genero", "Ano", "Horario"
            }
        ));
        tabelaSessao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSessaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSessao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 530, 960, 210);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("SESSÃO");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 10, 400, 40);

        getContentPane().add(comboBoxFilme);
        comboBoxFilme.setBounds(10, 260, 420, 30);

        comboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxGenero);
        comboBoxGenero.setBounds(10, 190, 420, 30);

        jLabel2.setText("Ano");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 450, 60, 14);

        getContentPane().add(comboBoxAno);
        comboBoxAno.setBounds(10, 470, 110, 30);

        jLabel3.setText("Sala");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 310, 70, 14);

        comboBoxSala.setToolTipText("");
        comboBoxSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSalaActionPerformed(evt);
            }
        });
        getContentPane().add(comboBoxSala);
        comboBoxSala.setBounds(10, 330, 110, 30);

        jLabel6.setText("Data");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 370, 80, 14);

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtData);
        txtData.setBounds(10, 390, 150, 30);
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(670, 120, 280, 30);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(823, 160, 130, 50);

        jLabel7.setText("Horario");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 310, 50, 14);

        getContentPane().add(comboBoxHorario);
        comboBoxHorario.setBounds(210, 330, 220, 30);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(510, 360, 110, 60);

        setSize(new java.awt.Dimension(997, 799));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void listar(){
         DefaultTableModel modeloDaTabela= (DefaultTableModel)tabelaSessao.getModel();
        modeloDaTabela.setNumRows(0);
        try{
            
            ss=MetodosDaSessao.listaDaSessao();
           for(Sessao sessao: ss){
            modeloDaTabela.addRow(new Object[]{
                sessao.getCodigo(),
                sessao.getCodigo_filme(),
                sessao.getGeneroFilme(),
                sessao.getSala(),
                sessao.getData(),
                
                sessao.getAno(),
                sessao.getHorario()
          
            });
           
           }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "nao foi possivel listar");
        }
    }
    
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        String codigo = txtCodigo.getText();
        
        String nomeFilme = comboBoxFilme.getSelectedItem()+ "";
        String generoFilme = comboBoxGenero.getSelectedItem()+"";
        String sala = comboBoxSala.getSelectedItem()+"";
        String data = txtData.getText();
        String ano = comboBoxAno.getSelectedItem()+"";
        String horario = comboBoxHorario.getSelectedItem()+"";
        
         try {
             MetodosDaSessao.adicionarSessaoNoFicheiro(codigo, nomeFilme, data, sala, generoFilme, ano, horario);
             JOptionPane.showMessageDialog(null, "Sucesso!");
         } catch (IOException ex) {
             Logger.getLogger(JFrmSessao.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void tabelaSessaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSessaoMouseClicked
        if(tabelaSessao.getSelectedRow()!=-1){
            int indice= tabelaSessao.getSelectedRow();
            TableModel modelo=tabelaSessao.getModel();
            txtCodigo.setText(modelo.getValueAt(indice,0).toString());
            txtData.setText(modelo.getValueAt(indice,4).toString());     
        }         
    }//GEN-LAST:event_tabelaSessaoMouseClicked

    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed
         String codigo= txtCodigo.getText();
         String data = txtData.getText();
  
        try
        {
             ss=MetodosDaSessao.listaDaSessao();
            MetodosDaSessao.atualizarSessao(ss, codigo, data);
                    
            JOptionPane.showMessageDialog(null, "atualizado com sucesso");
            limparCaixaTexto ();
    
        }catch(IOException e1){
            JOptionPane.showMessageDialog(null, "nao foi possivel");
        }
    }//GEN-LAST:event_BtnAtualizarActionPerformed

    private void comboBoxSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSalaActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String codigo = txtPesquisar.getText();
        String generoFilme = comboBoxGenero.getSelectedItem()+"";
       
        
        String sala = comboBoxSala.getSelectedItem()+"";
        
        
        try {
            DefaultTableModel modeloDaTabela= (DefaultTableModel)tabelaSessao.getModel();
            modeloDaTabela.setNumRows(0);
            ss=MetodosDaSessao.listaDaSessao();
            for (Sessao sessao : ss) {
                if (sessao.getCodigo().equalsIgnoreCase(codigo)|| sessao.getGeneroFilme().equalsIgnoreCase(generoFilme) || sessao.getSala().equalsIgnoreCase(sala)){
                    modeloDaTabela.addRow(new Object []{
                     sessao.getCodigo(),
                sessao.getCodigo_filme(),
                sessao.getGeneroFilme(),
                sessao.getSala(),
                sessao.getData(),
                
                sessao.getAno(),
                sessao.getHorario()
                     
                  });
                }        
                
            }     
            } catch (IOException ex) { 
             Logger.getLogger(JFrmSessao.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
             try {
                listaDeFilmes=MetodosDoFilme.listaDeFilme();
                for (Filmes s : listaDeFilmes) {
                 comboBoxFilme.addItem(s.getNome());
                 comboBoxGenero.addItem(s.getGenero());
                 comboBoxAno.addItem(s.getAno());
                 comboBoxHorario.addItem("10:00 am");
                 comboBoxHorario.addItem("12:00 pm");
                 comboBoxHorario.addItem("01:30 pm");
                 comboBoxHorario.addItem("03:00 pm");
                 comboBoxHorario.addItem("05:30 pm");
                 comboBoxHorario.addItem("07:30 pm");
                 comboBoxHorario.addItem("09:00 pm");
                 comboBoxHorario.addItem("10:00 pm");
                 comboBoxHorario.addItem("11:45 pm");
                 
                 ss = MetodosDaSessao.listaDaSessao();
              int codigo = MetodosDaSessao.linhasDoFicheiro();
                    txtCodigo.setText((codigo)+1+""); 
                 

      
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

    private void comboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGeneroActionPerformed
        
    }//GEN-LAST:event_comboBoxGeneroActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
         String codigo = txtCodigo.getText();
       
        try {
            ss=MetodosDaSessao.listaDaSessao();
            MetodosDoFilme.removerFilme(listaDeFilmes, codigo);
            JOptionPane.showMessageDialog(null, "O filme foi removido com sucesso");
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, "Error");
            
        }
    }//GEN-LAST:event_btnRemoverActionPerformed
    
    public void limparCaixaTexto () {
        //txtCodigo.setText("");
        txtData.setText("");
       
        
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
            java.util.logging.Logger.getLogger(JFrmSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmSessao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> comboBoxAno;
    private javax.swing.JComboBox<String> comboBoxFilme;
    private javax.swing.JComboBox<String> comboBoxGenero;
    private javax.swing.JComboBox<String> comboBoxHorario;
    private javax.swing.JComboBox<String> comboBoxSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JTable tabelaSessao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
