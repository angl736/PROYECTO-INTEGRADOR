package proyecto_integrador;


public class Inicio extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Inicio.class.getName());

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_inicioSesion = new javax.swing.JButton();
        jButton_registroUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bienvenido");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 22, 90, -1));

        jButton_inicioSesion.setText("Iniciar sesion");
        jButton_inicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_inicioSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_inicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jButton_registroUsuario.setText("Registrar usuario nuevo");
        jButton_registroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registroUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_registroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_inicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_inicioSesionActionPerformed
        (new Inicio_Sesion()).setVisible(rootPaneCheckingEnabled);

    }//GEN-LAST:event_jButton_inicioSesionActionPerformed

    private void jButton_registroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registroUsuarioActionPerformed
        (new Registro_Usuario()).setVisible(rootPaneCheckingEnabled);

    }//GEN-LAST:event_jButton_registroUsuarioActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Inicio().setVisible(true));
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_inicioSesion;
    private javax.swing.JButton jButton_registroUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
