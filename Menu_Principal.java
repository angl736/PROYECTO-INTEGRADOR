package proyecto_integrador;


public class Menu_Principal extends javax.swing.JFrame {
    
    public Menu_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Rentar = new javax.swing.JButton();
        jButton_Devolver = new javax.swing.JButton();
        jButton_Historial = new javax.swing.JButton();
        jButton_Reportar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton_Stock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Renta de equipo de computo-Universidad");
        setResizable(false);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Equipos disponibles");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 22, 141, -1));

        jButton_Rentar.setText("Rentar");
        jButton_Rentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RentarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Rentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jButton_Devolver.setText("Devolver");
        jButton_Devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DevolverActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Devolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jButton_Historial.setText("Ver historial completo");
        jButton_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HistorialActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        jButton_Reportar.setText("Reportar");
        jButton_Reportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReportarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Reportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel2.setText("Historial reciente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 197, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 46, 400, 140));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 400, -1));

        jButton_Stock.setText("Ver stock");
        jButton_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StockActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RentarActionPerformed
        (new Ventana_rentar()).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton_RentarActionPerformed

    private void jButton_HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HistorialActionPerformed
        (new Ventana_historial()).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton_HistorialActionPerformed

    private void jButton_DevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DevolverActionPerformed
       (new Ventana_Devolver()).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton_DevolverActionPerformed

    private void jButton_ReportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReportarActionPerformed
        (new Ventana_Reporte()).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton_ReportarActionPerformed

    private void jButton_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StockActionPerformed
        (new Ventana_Stock()).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton_StockActionPerformed
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new Menu_Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Devolver;
    private javax.swing.JButton jButton_Historial;
    private javax.swing.JButton jButton_Rentar;
    private javax.swing.JButton jButton_Reportar;
    private javax.swing.JButton jButton_Stock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
