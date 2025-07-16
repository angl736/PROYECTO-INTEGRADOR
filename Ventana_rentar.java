package proyecto_integrador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ventana_rentar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventana_rentar.class.getName());

    public Ventana_rentar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField_rentar = new javax.swing.JTextField();
        jButton_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Herramienta disponible");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 340, 130));

        jLabel2.setText("Ingresa equipo a rentar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jTextField_rentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_rentarActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_rentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 330, -1));

        jButton_cerrar.setText("Aceptar");
        jButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_rentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_rentarActionPerformed
        
    }//GEN-LAST:event_jTextField_rentarActionPerformed

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed
        registrarPrestamo();
        Cerrar_Ventana();
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void Cerrar_Ventana(){
        this.dispose();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new Ventana_rentar().setVisible(true));
    }
    
    private void registrarPrestamo(){
        String nombreHerramienta = jTextField_rentar.getText().trim();
        if (nombreHerramienta.isEmpty()) {
            jTextArea1.setText("Error: Debe ingresar el nombre de una herramienta.");
            return;
        }

        // Buscar la herramienta en la lista
        Herramientas herramienta = Administrador.herramientasDisponibles.stream()
                .filter(h -> h.getNombre().equalsIgnoreCase(nombreHerramienta))
                .findFirst()
                .orElse(null);

        if (herramienta == null) {
            jTextArea1.setText("Error: La herramienta '" + nombreHerramienta + "' no está disponible.");
            return;
        }

        if (!"Disponible".equals(herramienta.getEstado())) {
            jTextArea1.setText("Error: La herramienta '" + nombreHerramienta + "' no está disponible para rentar.");
            return;
        }

        // Crear objeto Prestamo
        LocalDateTime fechaActual = LocalDateTime.now();
        Prestamo prestamo = new Prestamo(1, fechaActual, null, "Pendiente");

        // Actualizar estado de la herramienta
        herramienta.setEstado("Renta");

        // Actualizar jTextArea1 con información del préstamo
        jTextArea1.setText("Préstamo registrado:\n" +
                          "Herramienta: " + herramienta.getNombre() + "\n" +
                          "Categoría: " + herramienta.getCategoria() + "\n" +
                          "Fecha de préstamo: " + fechaActual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")) + "\n" +
                          "Estado: " + prestamo.getEstado());

        logger.info("Préstamo registrado para herramienta: " + herramienta.getNombre());  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField_rentar;
    // End of variables declaration//GEN-END:variables
}
