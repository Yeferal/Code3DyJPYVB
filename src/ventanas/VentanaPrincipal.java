
package ventanas;

import archivos.Archivo;
import archivos.ArchivoExtension;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import main.NumeroLinea;

public class VentanaPrincipal extends javax.swing.JFrame {

    private ArrayList<ArchivoExtension> listaArchivos = new ArrayList<>();
    int indicePetania = 0;
    static final String DIAGONAL = "/";
    Archivo archivo = new Archivo();
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void agregarPestania(ArchivoExtension archivoExtension){
        
        JScrollPane j = new JScrollPane();
            JTextArea jArea = new JTextArea();
            jArea.addCaretListener(new CaretListener() {
                @Override
                public void caretUpdate(CaretEvent e) {
                    JTextArea editArea = (JTextArea) e.getSource();
                    int linea = 1,columna = 1;
                    try {
                        int carePos = editArea.getCaretPosition();
                        linea = editArea.getLineOfOffset(carePos);
                        columna = carePos - editArea.getLineStartOffset(linea);
                        linea +=1;
                        columna +=1;
                    } catch (Exception ex) {
                    }
                    labelFilCol.setText("Fila: "+linea+",  Columna: "+columna);
                }
            });
            NumeroLinea nL = new NumeroLinea(jArea);
            jArea.setText("");
            j.setRowHeaderView(nL);
            j.setViewportView(jArea);
            
        for (int i = 0; i < listaArchivos.size(); i++) {
            if(listaArchivos.get(i).getTipo().equals(archivoExtension.getTipo())){
                listaArchivos.remove(i);
                tabbedPanelCode.remove(i);
                break;
            }
        }
        listaArchivos.add(archivoExtension);
        tabbedPanelCode.addTab("Programa", j);
        
    }

    private void guardar(){
            if(listaArchivos.get(indicePetania).getNombre()==null || listaArchivos.get(indicePetania).getPath()==null){
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                fileChooser.showOpenDialog(this);
                File file = fileChooser.getSelectedFile();
                if (file!=null) {
                    String nombre = JOptionPane.showInputDialog("Escribe el nombre del Archivo");
                    String ruta = file.getPath()+DIAGONAL+nombre+"."+listaArchivos.get(indicePetania).getExtension();
                    JScrollPane jAux = (JScrollPane) tabbedPanelCode.getComponent(indicePetania);
                    JTextArea areaAux = (JTextArea) jAux.getViewport().getComponent(0);
                    archivo.crearArchivo(ruta, areaAux.getText());
                    listaArchivos.get(indicePetania).setNombre(nombre+"."+listaArchivos.get(indicePetania).getExtension());
                    listaArchivos.get(indicePetania).setPath(ruta);
                    JOptionPane.showMessageDialog(null, "Se Guardo el nuevo archivo");
                }
            }else{
                String ruta = listaArchivos.get(indicePetania).getPath();
                JScrollPane jAux = (JScrollPane) tabbedPanelCode.getComponent(indicePetania);
                JTextArea areaAux = (JTextArea) jAux.getViewport().getComponent(0);
                archivo.crearArchivo(ruta, areaAux.getText());
                JOptionPane.showMessageDialog(null, "Se actualizo el nuevo archivo");
            }
        
    }
    
    private void abrirArchivo(ArchivoExtension archivoExtension){
        JScrollPane j = new JScrollPane();
            JTextArea jArea = new JTextArea();
            jArea.addCaretListener(new CaretListener() {
                @Override
                public void caretUpdate(CaretEvent e) {
                    JTextArea editArea = (JTextArea) e.getSource();
                    int linea = 1,columna = 1;
                    try {
                        int carePos = editArea.getCaretPosition();
                        linea = editArea.getLineOfOffset(carePos);
                        columna = carePos - editArea.getLineStartOffset(linea);
                        linea +=1;
                        columna +=1;
                    } catch (Exception ex) {
                    }
                    labelFilCol.setText("Fila: "+linea+",  Columna: "+columna);
                }
            });
            NumeroLinea nL = new NumeroLinea(jArea);
            jArea.setText(archivo.leerArchivo(archivoExtension.getPath()));
            j.setRowHeaderView(nL);
            j.setViewportView(jArea);
            
        for (int i = 0; i < listaArchivos.size(); i++) {
            if(listaArchivos.get(i).getTipo().equals(archivoExtension.getTipo())){
                listaArchivos.remove(i);
                tabbedPanelCode.remove(i);
                break;
            }
        }
        listaArchivos.add(archivoExtension);
        tabbedPanelCode.addTab("Programa", j);
    }
    
    private void guardarComo(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.showOpenDialog(this);
        File file = fileChooser.getSelectedFile();
        if (file!=null) {
            String nombre = JOptionPane.showInputDialog("Escribe el nombre del Archivo");
            String ruta = file.getPath()+DIAGONAL+nombre+"."+listaArchivos.get(indicePetania).getExtension();
            JScrollPane jAux = (JScrollPane) tabbedPanelCode.getComponent(indicePetania);
            JTextArea areaAux = (JTextArea) jAux.getViewport().getComponent(0);
            archivo.crearArchivo(ruta, areaAux.getText());
            JOptionPane.showMessageDialog(null, "Se Guardo el nuevo archivo");
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        tabbedPanelCode = new javax.swing.JTabbedPane();
        labelFilCol = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
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

        tabbedPanelCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedPanelCodeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedPanelCode)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 821, Short.MAX_VALUE)
                        .addComponent(labelFilCol, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPanelCode, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelFilCol, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel, java.awt.BorderLayout.CENTER);

        menuArchivo.setText("Archivo");

        menuItemNuevo.setText("Nuevo");
        menuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemNuevo);

        menuItemAbrir.setText("Abrir");
        menuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemAbrir);

        menuItemGuardar.setText("Guardar");
        menuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemGuardar);

        menuItemGuardarComo.setText("Guardar Como");
        menuItemGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGuardarComoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemGuardarComo);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemSalir);

        menuBar.add(menuArchivo);

        menuGenerarCodigo.setText("Generar Codigo");

        menuItemCodigo3D.setText("Codigo de Tres Direcciones");
        menuGenerarCodigo.add(menuItemCodigo3D);

        menuItemCodigoOp.setText("Codigo Optimizado");
        menuGenerarCodigo.add(menuItemCodigoOp);

        menuItemCodigoASSY.setText("Codigo Assembler");
        menuGenerarCodigo.add(menuItemCodigoASSY);

        menuBar.add(menuGenerarCodigo);

        menuEjecutar.setText("Ejecutar");

        menuItemEject3D.setText("Codigo en Tres Direcciones");
        menuEjecutar.add(menuItemEject3D);

        menuItemEjectOp.setText("Codigo Optimizado");
        menuEjecutar.add(menuItemEjectOp);

        menuItemEjectASSY.setText("Codigo Assembler");
        menuEjecutar.add(menuItemEjectASSY);

        menuBar.add(menuEjecutar);

        menuReporte.setText("Reporte");

        menuItemReporteOp.setText("Reporte Optimizacion");
        menuReporte.add(menuItemReporteOp);

        menuBar.add(menuReporte);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoActionPerformed
        ArchivoExtension archivoExtension = new ArchivoExtension(null, null, "mlg", "Programa");
        agregarPestania(archivoExtension);
    }//GEN-LAST:event_menuItemNuevoActionPerformed

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos", "mlg");
        fileChooser.setFileFilter(filter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.showOpenDialog(this);
        File file = fileChooser.getSelectedFile();
        if(file!=null){
            String ruta = file.getPath();
            String nombreA = file.getName();
            System.out.println("Nombre: "+nombreA);
            String [] arreglo = nombreA.split("\\.");
            ArchivoExtension a = new ArchivoExtension(nombreA, ruta, "mlg", "Programa");
            abrirArchivo(a);
        }
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private void menuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGuardarActionPerformed
        if(listaArchivos.size()>0){
            guardar();
        }else{
            JOptionPane.showMessageDialog(null, "No existen petañas abiertas");
        }
    }//GEN-LAST:event_menuItemGuardarActionPerformed

    private void tabbedPanelCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedPanelCodeMouseClicked
        indicePetania = tabbedPanelCode.getSelectedIndex();
    }//GEN-LAST:event_tabbedPanelCodeMouseClicked

    private void menuItemGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGuardarComoActionPerformed
        if(listaArchivos.size()>0){
            guardarComo();
        }else{
            JOptionPane.showMessageDialog(null, "No existen petañas abiertas");
        }
    }//GEN-LAST:event_menuItemGuardarComoActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelFilCol;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBar;
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
    private javax.swing.JPanel panel;
    private javax.swing.JTabbedPane tabbedPanelCode;
    // End of variables declaration//GEN-END:variables
}
