/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package examen;

import java.io.BufferedReader;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Texto extends javax.swing.JFrame {

    /** Creates new form Texto */
    public Texto() {
       //noVisible();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Txtdoc = new javax.swing.JTextArea();
        Panelb = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Txtdocb = new javax.swing.JTextArea();
        TxtNombreb = new javax.swing.JTextField();
        labelb = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del archivo");

        Txtdoc.setColumns(20);
        Txtdoc.setRows(5);
        Txtdoc.setBorder(null);
        jScrollPane1.setViewportView(Txtdoc);

        Panelb.setBackground(new java.awt.Color(0, 153, 153));
        Panelb.setBorder(javax.swing.BorderFactory.createTitledBorder("Abrir documento"));

        Txtdocb.setColumns(20);
        Txtdocb.setRows(5);
        Txtdocb.setBorder(null);
        jScrollPane2.setViewportView(Txtdocb);

        labelb.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        labelb.setForeground(new java.awt.Color(255, 255, 255));
        labelb.setText("Nombre del archivo");

        javax.swing.GroupLayout PanelbLayout = new javax.swing.GroupLayout(Panelb);
        Panelb.setLayout(PanelbLayout);
        PanelbLayout.setHorizontalGroup(
            PanelbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(PanelbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(PanelbLayout.createSequentialGroup()
                        .addComponent(labelb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNombreb, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        PanelbLayout.setVerticalGroup(
            PanelbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombreb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(Panelb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Guardar nuevo documento");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Guadar y remplazar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Abrir  documento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Abrir desde el navegador");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void limpiar(){
    TxtNombre.setText(null);
    Txtdoc.setText(null);
   
//}private void noVisible(){
   //Panelb.setVisible(false);
  //  TxtNombreb.setVisible(false);
  //  labelb.setVisible(false);
//}
//private void Visible(){
 //   Panelb.setVisible(true);
   // Txtdocb.setVisible(true);
   // TxtNombreb.setVisible(true);
   // labelb.setVisible(true);
   
}
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       String Nombre=TxtNombre.getText();
       String carpeta=System.getProperty("user.dir");
       String Direccion= (carpeta + "/" + Nombre+".txt");
       FileWriter File=null;
       
       try{
           File= new FileWriter(Direccion);
       }catch(IOException ex){
            Logger.getLogger(documento.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       //crear un buffered si nos da error siempre tendra la info y creara el archivo
       try{
           BufferedWriter esc = new BufferedWriter(File);
           esc.write(Txtdoc.getText());
           esc.close(); 
       }catch(Exception ex){
       
      }
        limpiar();
        JOptionPane.showMessageDialog(null, "El archivo ha sido guardado exitosamente");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       String Nombre=TxtNombreb.getText();
       String carpeta=System.getProperty("user.dir");
       String Direccion= (carpeta + "/" + Nombre);
       FileWriter File=null;
       
       try{
           File= new FileWriter(Direccion);
       }catch(IOException ex){
            Logger.getLogger(documento.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       //crear un buffered si nos da error siempre tendra la info y creara el archivo
       try{
           BufferedWriter esc = new BufferedWriter(File);
           esc.write(Txtdocb.getText());
           esc.close(); 
       }catch(Exception ex){
       
      }
        limpiar();
        JOptionPane.showMessageDialog(null, "Guardado Nuevamente");                                         

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    
    JFileChooser es=new JFileChooser();
    es.showOpenDialog(null);
    File archivo=es.getSelectedFile();
    
    
    try{
        FileReader ver=new FileReader(archivo);
        FileReader titulo=new FileReader(archivo);
        BufferedReader b=new BufferedReader(ver);
        String txt="";
        String linea="";
        while(((linea=b.readLine())!=null)){
            txt+=linea+"\n";
        }
        //donde colocara el texto
       
        Txtdocb.setText(txt);
        JOptionPane.showMessageDialog(null, "Archivo cargado");
    }catch(Exception e){
    }
    
    //obtenga el nombre del archivo
    if (archivo.exists()) {
           String a=null;
           a=archivo.getName();
           TxtNombreb.setText(a);
    }
                     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

 
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String uu = JOptionPane.showInputDialog("Ingrese el URL");
        if (java.awt.Desktop.isDesktopSupported()){
        java.awt.Desktop desktop=java.awt.Desktop.getDesktop();
        if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
            try{
            java.net.URI uri=new java.net.URI(uu);
            desktop.browse(uri);
            }catch(URISyntaxException| IOException ex){
            }
        }
        
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed


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
            java.util.logging.Logger.getLogger(Texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Texto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Texto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelb;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNombreb;
    private javax.swing.JTextArea Txtdoc;
    private javax.swing.JTextArea Txtdocb;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelb;
    // End of variables declaration//GEN-END:variables

}
