/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio_tres_notas;

/**
 *
 * @author jcfoxer
 */
public class promedio_tres_notas_con_if extends javax.swing.JFrame {

    /**
     * Creates new form promedio_tres_notas_con_if
     */
    public promedio_tres_notas_con_if() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnota1 = new javax.swing.JTextField();
        txtnota2 = new javax.swing.JTextField();
        txtnota3 = new javax.swing.JTextField();
        btnborrar = new javax.swing.JButton();
        btnprocesar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NOTA 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel2.setText("NOTA 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel3.setText("NOTA 3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        getContentPane().add(txtnota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, -1));
        getContentPane().add(txtnota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 80, -1));
        getContentPane().add(txtnota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 80, -1));

        btnborrar.setText("BOORRAR");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        btnprocesar.setText("CALCULAR");
        btnprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnprocesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, 362, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocesarActionPerformed
       
         
  {
   // Declaración de Variables
   double n1, n2, n3, promedio;
    
   // Entrada de Datos
   n1 = Double.parseDouble(txtnota1.getText());
   n2 = Double.parseDouble(txtnota2.getText());
   n3 = Double.parseDouble(txtnota3.getText());
    
   // Si amerita, añade 2 puntos a la n3
   if (n3 >= 10) {
    n3 = n3 + 2;
    if (n3 >= 20)
     n3 = 20;
   }
    
   // Determina el promedio
   promedio = (n1 + n2 + n3) / 3;
    
   // Salida de Resultados
   txtarea.setText("Promedio Final: " + promedio);
  
  }
  
        
        
         
        
    }//GEN-LAST:event_btnprocesarActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        
        
   txtnota1.setText("");
   txtnota2.setText("");
   txtnota3.setText("");
   txtarea.setText("");
   txtnota1.requestFocus();
  
   
 

    
        
    }//GEN-LAST:event_btnborrarActionPerformed

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
            java.util.logging.Logger.getLogger(promedio_tres_notas_con_if.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(promedio_tres_notas_con_if.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(promedio_tres_notas_con_if.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(promedio_tres_notas_con_if.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new promedio_tres_notas_con_if().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnprocesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtnota1;
    private javax.swing.JTextField txtnota2;
    private javax.swing.JTextField txtnota3;
    // End of variables declaration//GEN-END:variables
}