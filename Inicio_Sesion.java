package proyecto_integrador;

import javax.swing.JOptionPane;

public class Inicio_Sesion extends javax.swing.JFrame {
    
    public Inicio_Sesion() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton_Ingresar = new javax.swing.JButton();
        jPasswordField_contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio de sesion");
        setResizable(false);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Matricula");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jTextField_Matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 220, -1));

        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jButton_Ingresar.setText("Ingresar");
        jButton_Ingresar.setToolTipText("");
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jPasswordField_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
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

    private void jTextField_MatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MatriculaActionPerformed
        
    }//GEN-LAST:event_jTextField_MatriculaActionPerformed
    
    //Aqui el se verifica que los datos que metio el usuario existan
    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        String matriculaIngresada = jTextField_Matricula.getText().trim();
        String contraseñaIngresada = new String(jPasswordField_contraseña.getPassword()).trim();
        
        //evita que haya campos vacios
        if (matriculaIngresada.isEmpty() || contraseñaIngresada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }
        
        //Muestra desde la terminal los datos de los usuarios que estan registrados
        System.out.println("Numero de usuarios registrados: " + Usuario.usuarios.size());
        System.out.println("Matricula ingresada: " + matriculaIngresada);
        System.out.println("Contrasenia ingresada: " + contraseñaIngresada);
        
        //Verificacion de datos, muestra desde la terminal los datos ingresados
        boolean encontrado = false;
        for (Usuario u : Usuario.usuarios) {
            System.out.println("Usuario almacenado - Matrícula: " + u.getMatricula() + ", Contraseña: " + u.getContraseña() + ", Rol: " + u.getRol());
            if (u.getMatricula().equals(matriculaIngresada) && u.getContraseña().equals(contraseñaIngresada)) {
                if ("admin".equals(u.getRol())) { // Verifica que sea administrador
                    new Menu_Principal().setVisible(true);
                    this.dispose();
                } else {//se nuega el acceso a alumnos, no funciona por el momento
                    JOptionPane.showMessageDialog(this, "Acceso denegado. Solo administradores pueden iniciar sesión por ahora.");
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas.");
        }
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    private void jPasswordField_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_contraseñaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Inicio_Sesion().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_contraseña;
    private javax.swing.JTextField jTextField_Matricula;
    // End of variables declaration//GEN-END:variables
}
