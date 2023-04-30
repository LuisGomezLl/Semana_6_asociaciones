
package Formularios;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class EditarCurso extends javax.swing.JFrame {

    public ArrayList<Clases.Curso> ListaCursos;
    PantallaCurso pdf = new PantallaCurso();
    
    public EditarCurso() {
        initComponents();
        ListaCursos=new ArrayList<>();
        this.setLocationRelativeTo(null);
    }
    
    public void Listar(){
    
        
        DefaultListModel modelo=new DefaultListModel();
        for(int i=0; i<ListaCursos.size(); i++){
        
            modelo.addElement(ListaCursos.get(i).getCodigo()+"             "+
                    ListaCursos.get(i).getNombre()
                    +"             "+ListaCursos.get(i).getCreditos());        
        }
        
        pdf.LstCursos.setModel(modelo);
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtcodigoCurs = new javax.swing.JTextField();
        btnguardarCurs = new javax.swing.JButton();
        btncancelarCurs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombreCurs = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcreditos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("CODIGO");

        txtcodigoCurs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtcodigoCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoCursActionPerformed(evt);
            }
        });

        btnguardarCurs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnguardarCurs.setText("GUARDAR");
        btnguardarCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarCursActionPerformed(evt);
            }
        });

        btncancelarCurs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btncancelarCurs.setText("CANCELAR");
        btncancelarCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarCursActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("[Nombre de Curso]");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("CURSO");

        txtnombreCurs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtnombreCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreCursActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("CREDITOS");

        txtcreditos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnguardarCurs)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelarCurs))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigoCurs)
                            .addComponent(txtnombreCurs)
                            .addComponent(txtcreditos))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigoCurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombreCurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarCurs)
                    .addComponent(btncancelarCurs))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoCursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoCursActionPerformed

    private void btncancelarCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarCursActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncancelarCursActionPerformed

    private void txtnombreCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreCursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreCursActionPerformed

    private void btnguardarCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarCursActionPerformed
        Clases.Curso curso=new Clases.Curso();
        
        String codigo,nombre, credi;
        int credito=0;
        
        
        codigo=txtcodigoCurs.getText();
        nombre=txtnombreCurs.getText();
        
        credi=txtcreditos.getText();
        try{
            credito=Integer.parseInt(credi);
            
        }catch(NumberFormatException e){
        
            JOptionPane.showMessageDialog(null,"El dato debe de ser numerico","ERROR",JOptionPane.ERROR_MESSAGE);         
        }
        
        curso.setCodigo(codigo);
        curso.setNombre(nombre);
        curso.setCreditos(credito);
        
        ListaCursos.add(curso);
        Listar();
        this.setVisible(false);
        pdf.setVisible(true);
                
        JOptionPane.showMessageDialog(null,"Se agrego correctamente","AGREGAR",JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }//GEN-LAST:event_btnguardarCursActionPerformed

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
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelarCurs;
    private javax.swing.JButton btnguardarCurs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtcodigoCurs;
    private javax.swing.JTextField txtcreditos;
    private javax.swing.JTextField txtnombreCurs;
    // End of variables declaration//GEN-END:variables
}
