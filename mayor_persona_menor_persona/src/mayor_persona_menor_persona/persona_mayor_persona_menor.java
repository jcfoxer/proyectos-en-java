/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor_persona_menor_persona;

/**
 *
 * @author jcfoxer
 */
public class persona_mayor_persona_menor extends javax.swing.JFrame {

    /**
     * Creates new form persona_mayor_persona_menor
     */
    public persona_mayor_persona_menor() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("hombre ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 40));

        jLabel2.setText("mujer ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 70, 30));

        jLabel3.setText("ingresa tu nombre ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("ingresa tu edad ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setText("ingresa tu nombre ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel6.setText("ingresa tu edad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 50, -1));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 50, -1));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 70, -1));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 70, -1));

        jButton1.setText("MOSTRAR DATOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

//declarar variables 

String nombreh,nombrem;

int edadh,edadm;

  nombreh=txt1.getText();
  nombrem=txt3.getText();

  edadh=Integer.parseInt(txt2.getText());
  edadm=Integer.parseInt(txt4.getText());

  
        
      txtarea.setText("tu nombre es        :"+nombreh+"\ntu edad es :"+edadh+"\neres mayor de edad\n");
       
   txtarea.append("tu nombre es        :"+nombrem+"\ntu edad es :"+edadm+"\neres mayor de edad\n ");        
       
  
  
  

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(persona_mayor_persona_menor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(persona_mayor_persona_menor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(persona_mayor_persona_menor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(persona_mayor_persona_menor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new persona_mayor_persona_menor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
