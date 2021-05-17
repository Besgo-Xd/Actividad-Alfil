/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author madar
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        posicionA = new javax.swing.JLabel();
        filaA = new javax.swing.JLabel();
        columnaA = new javax.swing.JLabel();
        posicionP = new javax.swing.JLabel();
        filaP = new javax.swing.JLabel();
        columnaP = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        opcionDireccion = new javax.swing.JComboBox<>();
        jugar = new javax.swing.JButton();
        textFA = new javax.swing.JTextField();
        textCA = new javax.swing.JTextField();
        jTextFP = new javax.swing.JTextField();
        jTextCP = new javax.swing.JTextField();
        jSeparatorAbajo = new javax.swing.JSeparator();
        jSeparatorArriba = new javax.swing.JSeparator();
        juegoAlfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego del Alfil");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        posicionA.setBackground(new java.awt.Color(255, 255, 255));
        posicionA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        posicionA.setText("Posicion:");

        filaA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        filaA.setText("Fila:");
        filaA.setToolTipText("");
        filaA.setVerifyInputWhenFocusTarget(false);

        columnaA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        columnaA.setText("Columna:");

        posicionP.setBackground(new java.awt.Color(255, 255, 255));
        posicionP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        posicionP.setText("Posicion:");

        filaP.setBackground(new java.awt.Color(255, 255, 255));
        filaP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        filaP.setText("Fila:");

        columnaP.setBackground(new java.awt.Color(255, 255, 255));
        columnaP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        columnaP.setText("Columna:");

        Direccion.setBackground(new java.awt.Color(255, 255, 255));
        Direccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Direccion.setText("Direccion:");

        opcionDireccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ir hacia abajo", "Ir hacia Arriba" }));
        opcionDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionDireccionActionPerformed(evt);
            }
        });

        jugar.setBackground(new java.awt.Color(255, 255, 255));
        jugar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jugar.setText("JUGAR");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        textFA.setText("Ingresa la fila");
        textFA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFAActionPerformed(evt);
            }
        });

        textCA.setText("Ingresa la columna");

        jTextFP.setText("Ingresa la fila");

        jTextCP.setText("Ingresa la columna");

        jSeparatorAbajo.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorAbajo.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorAbajo.setToolTipText("");
        jSeparatorAbajo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSeparatorAbajo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSeparatorAbajoPropertyChange(evt);
            }
        });

        jSeparatorArriba.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorArriba.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorArriba.setToolTipText("");
        jSeparatorArriba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSeparatorArriba.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jSeparatorArriba.setName("Juego del Alfil"); // NOI18N

        juegoAlfil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        juegoAlfil.setText("Juego del Alfil");
        juegoAlfil.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparatorAbajo, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparatorArriba, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(juegoAlfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(posicionA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(columnaA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filaA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(columnaP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(filaP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(posicionP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152)
                                .addComponent(Direccion))
                            .addComponent(jugar))
                        .addGap(27, 27, 27)
                        .addComponent(opcionDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(juegoAlfil, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion)
                    .addComponent(opcionDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicionP)
                    .addComponent(posicionA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filaP)
                    .addComponent(filaA)
                    .addComponent(textFA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(columnaA)
                        .addComponent(textCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(columnaP)
                        .addComponent(jTextCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addComponent(jugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jSeparatorAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jSeparatorAbajo.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSeparatorAbajoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSeparatorAbajoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeparatorAbajoPropertyChange

    private void textFAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFAActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jugarActionPerformed

    private void opcionDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionDireccionActionPerformed
        // TODO add your hanjdling code here:
    }//GEN-LAST:event_opcionDireccionActionPerformed
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel columnaA;
    private javax.swing.JLabel columnaP;
    private javax.swing.JLabel filaA;
    private javax.swing.JLabel filaP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparatorAbajo;
    private javax.swing.JSeparator jSeparatorArriba;
    private javax.swing.JTextField jTextCP;
    private javax.swing.JTextField jTextFP;
    private javax.swing.JLabel juegoAlfil;
    private javax.swing.JButton jugar;
    private javax.swing.JComboBox<String> opcionDireccion;
    private javax.swing.JLabel posicionA;
    private javax.swing.JLabel posicionP;
    private javax.swing.JTextField textCA;
    private javax.swing.JTextField textFA;
    // End of variables declaration//GEN-END:variables
}
