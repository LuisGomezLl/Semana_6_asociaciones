
package Formularios;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class EditarEstudiante extends javax.swing.JFrame {

    public ArrayList<Clases.Estudiante> ListaEstudiante;
    PantallaEstudiante estudiante =new PantallaEstudiante();
    
    public EditarEstudiante() {
        initComponents();
        ListaEstudiante=new ArrayList<>();
        this.setLocationRelativeTo(null);
        
    }
    
    public void Listar(){
    
        
        DefaultListModel modelo=new DefaultListModel();
        for(int i=0; i<ListaEstudiante.size(); i++){
        
            modelo.addElement(ListaEstudiante.get(i).getCodigo()+"             "+
                    ListaEstudiante.get(i).getNombre());        
            
        }
        
        estudiante.Lstestudiantes.setModel(modelo);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcodigoEstu = new javax.swing.JTextField();
        btnguardarEstu = new javax.swing.JButton();
        btncancelarEstu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombreEstu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("CODIGO");

        txtcodigoEstu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcodigoEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoEstuActionPerformed(evt);
            }
        });

        btnguardarEstu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnguardarEstu.setText("GUARDAR");
        btnguardarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarEstuActionPerformed(evt);
            }
        });

        btncancelarEstu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btncancelarEstu.setText("CANCELAR");
        btncancelarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarEstuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("[Nombre de Estudiante]");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE");

        txtnombreEstu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnombreEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreEstuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnguardarEstu)
                                .addGap(18, 18, 18)
                                .addComponent(btncancelarEstu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcodigoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnombreEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombreEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarEstu)
                    .addComponent(btncancelarEstu))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoEstuActionPerformed

    private void btncancelarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarEstuActionPerformed

        this.dispose();
    }//GEN-LAST:event_btncancelarEstuActionPerformed

    private void txtnombreEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreEstuActionPerformed

    private void btnguardarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarEstuActionPerformed
        
        Clases.Estudiante estudian = new Clases.Estudiante();
        
        String codigo, nombre;
        
        codigo=txtcodigoEstu.getText();
        nombre=txtnombreEstu.getText();
        
        estudian.setCodigo(codigo);
        estudian.setNombre(nombre);
        
        ListaEstudiante.add(estudian);
        Listar();
        this.setVisible(false);
        estudiante.setVisible(true);
        JOptionPane.showMessageDialog(null,"Se agrego correctamente","AGREGAR",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnguardarEstuActionPerformed

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
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelarEstu;
    private javax.swing.JButton btnguardarEstu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtcodigoEstu;
    private javax.swing.JTextField txtnombreEstu;
    // End of variables declaration//GEN-END:variables

}
