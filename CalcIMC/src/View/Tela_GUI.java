
package View;

public class Tela_GUI extends javax.swing.JFrame {

    public Tela_GUI() {
        initComponents();
        res_txt.setVisible(false);
        res2_txt.setVisible(false);
        peso1_img.setVisible(false);
        peso2_img.setVisible(false);
        peso3_img.setVisible(false);
        peso4_img.setVisible(false);
        peso5_img.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imc1_txt = new javax.swing.JTextField();
        imc2_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        res2_txt = new javax.swing.JLabel();
        res_txt = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        peso4_img = new javax.swing.JLabel();
        peso5_img = new javax.swing.JLabel();
        peso3_img = new javax.swing.JLabel();
        peso2_img = new javax.swing.JLabel();
        peso1_img = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setText("Calculadora IMC");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 20, 200, 14);

        imc1_txt.setToolTipText("Utilize ponto ao invés de vírgula.");
        imc1_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        imc1_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imc1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imc1_txtActionPerformed(evt);
            }
        });
        jPanel1.add(imc1_txt);
        imc1_txt.setBounds(80, 110, 150, 16);

        imc2_txt.setToolTipText("Utilize ponto ao invés de vírgula.");
        imc2_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        imc2_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(imc2_txt);
        imc2_txt.setBounds(80, 140, 150, 16);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 180, 110, 50);

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        jLabel2.setText("Peso(kg):");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 70, 15);

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        jLabel3.setText("Altura(m):");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 140, 70, 15);

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        jLabel4.setText("Preencha os campos com suas informações:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 70, 320, 15);

        res2_txt.setFont(new java.awt.Font("Ebrima", 0, 11)); // NOI18N
        res2_txt.setText("Resultado:");
        jPanel1.add(res2_txt);
        res2_txt.setBounds(90, 250, 80, 10);

        res_txt.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jPanel1.add(res_txt);
        res_txt.setBounds(90, 270, 60, 70);

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 10, 50, 30);

        peso4_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/peso5.png"))); // NOI18N
        peso4_img.setText("jLabel8");
        jPanel1.add(peso4_img);
        peso4_img.setBounds(250, 20, 200, 340);

        peso5_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peso4.png"))); // NOI18N
        peso5_img.setText("jLabel7");
        jPanel1.add(peso5_img);
        peso5_img.setBounds(250, 10, 210, 360);

        peso3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peso3.png"))); // NOI18N
        peso3_img.setText("jLabel6");
        jPanel1.add(peso3_img);
        peso3_img.setBounds(260, 20, 200, 340);

        peso2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peso2.png"))); // NOI18N
        peso2_img.setText("jLabel9");
        jPanel1.add(peso2_img);
        peso2_img.setBounds(260, 20, 200, 350);

        peso1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peso1.png"))); // NOI18N
        peso1_img.setText("jLabel10");
        jPanel1.add(peso1_img);
        peso1_img.setBounds(280, 0, 180, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(464, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imc1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imc1_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imc1_txtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Controller.Funcoes_DAO.imc();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField imc1_txt;
    public static javax.swing.JTextField imc2_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel peso1_img;
    public static javax.swing.JLabel peso2_img;
    public static javax.swing.JLabel peso3_img;
    public static javax.swing.JLabel peso4_img;
    public static javax.swing.JLabel peso5_img;
    public static javax.swing.JLabel res2_txt;
    public static javax.swing.JLabel res_txt;
    // End of variables declaration//GEN-END:variables
}
