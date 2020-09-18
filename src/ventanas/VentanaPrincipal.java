
package ventanas;

public class VentanaPrincipal extends javax.swing.JFrame {

    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemNuevo = new javax.swing.JMenuItem();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemGuardar = new javax.swing.JMenuItem();
        menuItemGuardarComo = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        menuGenerarCodigo = new javax.swing.JMenu();
        menuItemCodigo3D = new javax.swing.JMenuItem();
        menuItemCodigoOp = new javax.swing.JMenuItem();
        menuItemCodigoASSY = new javax.swing.JMenuItem();
        menuEjecutar = new javax.swing.JMenu();
        menuItemEject3D = new javax.swing.JMenuItem();
        menuItemEjectOp = new javax.swing.JMenuItem();
        menuItemEjectASSY = new javax.swing.JMenuItem();
        menuReporte = new javax.swing.JMenu();
        menuItemReporteOp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        menuArchivo.setText("Archivo");

        menuItemNuevo.setText("Nuevo");
        menuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemNuevo);

        menuItemAbrir.setText("Abrir");
        menuArchivo.add(menuItemAbrir);

        menuItemGuardar.setText("Guardar");
        menuArchivo.add(menuItemGuardar);

        menuItemGuardarComo.setText("Guardar Como");
        menuArchivo.add(menuItemGuardarComo);

        menuItemSalir.setText("Salir");
        menuArchivo.add(menuItemSalir);

        jMenuBar1.add(menuArchivo);

        menuGenerarCodigo.setText("Generar Codigo");

        menuItemCodigo3D.setText("Codigo de Tres Direcciones");
        menuGenerarCodigo.add(menuItemCodigo3D);

        menuItemCodigoOp.setText("Codigo Optimizado");
        menuGenerarCodigo.add(menuItemCodigoOp);

        menuItemCodigoASSY.setText("Codigo Assembler");
        menuGenerarCodigo.add(menuItemCodigoASSY);

        jMenuBar1.add(menuGenerarCodigo);

        menuEjecutar.setText("Ejecutar");

        menuItemEject3D.setText("Codigo en Tres Direcciones");
        menuEjecutar.add(menuItemEject3D);

        menuItemEjectOp.setText("Codigo Optimizado");
        menuEjecutar.add(menuItemEjectOp);

        menuItemEjectASSY.setText("Codigo Assembler");
        menuEjecutar.add(menuItemEjectASSY);

        jMenuBar1.add(menuEjecutar);

        menuReporte.setText("Reporte");

        menuItemReporteOp.setText("Reporte Optimizacion");
        menuReporte.add(menuItemReporteOp);

        jMenuBar1.add(menuReporte);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemNuevoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuEjecutar;
    private javax.swing.JMenu menuGenerarCodigo;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemCodigo3D;
    private javax.swing.JMenuItem menuItemCodigoASSY;
    private javax.swing.JMenuItem menuItemCodigoOp;
    private javax.swing.JMenuItem menuItemEject3D;
    private javax.swing.JMenuItem menuItemEjectASSY;
    private javax.swing.JMenuItem menuItemEjectOp;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemGuardarComo;
    private javax.swing.JMenuItem menuItemNuevo;
    private javax.swing.JMenuItem menuItemReporteOp;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuReporte;
    // End of variables declaration//GEN-END:variables
}
