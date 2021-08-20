/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.ConexaoBD;
import control.ControleClientes;
import model.ModeloClientes;
public class CadastroClientes extends javax.swing.JFrame {

    /**
     * Creates new form CadastroClientes
     */
    public CadastroClientes() {
        initComponents();
    }
    ModeloClientes mod=new ModeloClientes();
    ControleClientes control=new ControleClientes();
    ConexaoBD conex=new ConexaoBD();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        camponome = new javax.swing.JTextField();
        camporua = new javax.swing.JFormattedTextField();
        camponumero = new javax.swing.JFormattedTextField();
        Salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        camponascimento = new javax.swing.JFormattedTextField();
        campotelefone = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        campobairro = new javax.swing.JFormattedTextField();
        campocidade = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campocep = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(586, 440));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(586, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Data de nascimento:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 126, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Rua:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 214, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Número:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 257, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Telefone:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 169, -1, -1));

        camponome.setBackground(new java.awt.Color(204, 204, 204));
        camponome.setBorder(null);
        jPanel3.add(camponome, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 87, 268, 25));

        camporua.setBackground(new java.awt.Color(204, 204, 204));
        camporua.setBorder(null);
        jPanel3.add(camporua, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 211, 414, 25));

        camponumero.setBackground(new java.awt.Color(204, 204, 204));
        camponumero.setBorder(null);
        jPanel3.add(camponumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 254, 98, 25));

        Salvar.setBackground(new java.awt.Color(204, 204, 204));
        Salvar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.setBorder(null);
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        jPanel3.add(Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 352, 105, 43));

        cancelar.setBackground(new java.awt.Color(204, 204, 204));
        cancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorder(null);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel3.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 352, 106, 43));

        camponascimento.setBackground(new java.awt.Color(204, 204, 204));
        camponascimento.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(camponascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 123, 188, 25));

        campotelefone.setBackground(new java.awt.Color(204, 204, 204));
        campotelefone.setBorder(null);
        jPanel3.add(campotelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 166, 188, 25));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Bairro:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 257, -1, -1));

        campobairro.setBackground(new java.awt.Color(204, 204, 204));
        campobairro.setBorder(null);
        jPanel3.add(campobairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 254, 125, 25));

        campocidade.setBackground(new java.awt.Color(204, 204, 204));
        campocidade.setBorder(null);
        jPanel3.add(campocidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 297, 160, 25));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Cidade:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("CEP:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 300, -1, -1));

        campocep.setBackground(new java.awt.Color(204, 204, 204));
        campocep.setBorder(null);
        jPanel3.add(campocep, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 297, 161, 25));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        mod.setNome(camponome.getText());
        mod.setDatanasc(camponascimento.getText());
        mod.setTelefone(campotelefone.getText());
        mod.setRua(camporua.getText());
        mod.setNumero(camponumero.getText());
        mod.setBairro(campobairro.getText());
        mod.setCidade(campocidade.getText());
        mod.setCep(campocep.getText());
        control.Salvar(mod);
    }//GEN-LAST:event_SalvarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
    dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JFormattedTextField campobairro;
    private javax.swing.JFormattedTextField campocep;
    private javax.swing.JFormattedTextField campocidade;
    private javax.swing.JFormattedTextField camponascimento;
    private javax.swing.JTextField camponome;
    private javax.swing.JFormattedTextField camponumero;
    private javax.swing.JFormattedTextField camporua;
    private javax.swing.JFormattedTextField campotelefone;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}