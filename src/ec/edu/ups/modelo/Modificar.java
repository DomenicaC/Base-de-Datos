/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.excepciones.ValidarApellido;
import ec.edu.ups.excepciones.ValidarCedula;
import ec.edu.ups.excepciones.ValidarCelular;
import ec.edu.ups.excepciones.ValidarDosApellidos;
import ec.edu.ups.excepciones.ValidarDosNombres;
import ec.edu.ups.excepciones.ValidarEdad;
import ec.edu.ups.excepciones.ValidarFechaNac;
import ec.edu.ups.excepciones.ValidarNombre;
import ec.edu.ups.excepciones.ValidarSueldo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class Modificar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Modificar
     */
    public static String x;
    private ControladorPersona contPer;
    int pos;

    public Modificar(ControladorPersona contPer) {
        initComponents();

        this.contPer = contPer;
        x = "x";
        int a = Menu.DesktopPane.getWidth() - this.getWidth();
        int b = Menu.DesktopPane.getHeight() - this.getHeight();

        setLocation(a / 2, b / 2);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtCelular = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMod = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        txtApellido.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N

        txtEdad.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setText("Edad");

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel1.setText("Persona");

        btnBuscar.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtCelular.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setText("Cedula");

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");

        btnCancelar.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setText("Celular");

        txtCedula.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setText("Codigo");

        txtSueldo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N

        txtFecha.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");

        txtPos.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setText("Sueldo");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Fecha Nacimiento");

        btnMod.setFont(new java.awt.Font("Rockwell", 3, 18)); // NOI18N
        btnMod.setText("Modificar");
        btnMod.setToolTipText("");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtPos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnMod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar)
                            .addGap(74, 74, 74))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnMod))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String ruta = "archivo.ups";
        Persona persona = new Persona();

        try {
            System.out.println("\n");
            //no existe pasarela
            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");

            long tam = archivo.length();
            System.out.println("Tamaño archivo " + tam);

            pos = Integer.parseInt(txtPos.getText()) * 152;
            System.out.println(pos + " num");

            archivo.seek(pos);

            //leer nombre
            archivo.seek(pos);
            txtNombre.setText(archivo.readUTF().trim());

            //leer apellido
            archivo.seek(pos + 52);
            txtApellido.setText(archivo.readUTF().trim());

            //leer cedula 
            archivo.seek((Integer.parseInt(txtPos.getText()) * 152) + 104);
            txtCedula.setText(archivo.readUTF().trim());

            //leer celular
            archivo.seek(pos + 116);
            txtCelular.setText(archivo.readUTF().trim());

            //leer edad
            archivo.seek(pos + 128);
            txtEdad.setText(String.valueOf(archivo.readInt()).trim());

            //leer fecha
            archivo.seek(pos + 132);
            txtFecha.setText(archivo.readUTF().trim());

            //leer sueldo
            archivo.seek(pos + 144);
            txtSueldo.setText(String.valueOf(archivo.readDouble()).trim());

            //termina la conexion de java con el archivo
            archivo.close();

        } catch (FileNotFoundException error) {

            System.err.println("Archivo no encontrado " + error.toString());

        } catch (IOException error1) {

            System.err.println("Error de lectura " + error1.toString());

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.setVisible(false);
        this.dispose();
        x = null;

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed

        String ruta = "archivo.ups";
        Persona persona = new Persona();
        String nombre = txtNombre.getText();
         String apellido =txtApellido.getText();

        try {

            RandomAccessFile archivo = new RandomAccessFile(ruta, "rw");

            persona.setNombre(txtNombre.getText());
            persona.setApellido(txtApellido.getText());
            persona.setCedula(txtCedula.getText());
            persona.setEdad(Integer.parseInt(txtEdad.getText()));
//            persona.setFechaNac(txtFecha.getText());
            persona.setSueldo(Double.parseDouble(txtSueldo.getText()));
            persona.setCelular(txtCelular.getText());

            pos = Integer.parseInt(txtPos.getText());

            System.out.println(txtNombre.getText() + " " + txtApellido.getText() + " " + txtCedula.getText() + " " + Integer.parseInt(txtEdad.getText()) + " " + txtFecha.getText() + " " + Double.parseDouble(txtSueldo.getText()) + " " + txtCelular.getText());
            
            //if (persona.getNombre() != null && persona.getApellido() != null && persona.getCedula() != null && persona.getEdad() != 0 && persona.getFechaNac() != null && persona.getSueldo() != 0 && persona.getCelular() != null) {

            archivo.seek(archivo.length());
            archivo.seek(pos);
            for (int i = nombre.length() + 1; i <= 50; i++) {
                nombre = nombre.substring(0) + " ";

            }
            archivo.writeUTF(nombre);
            
            
            for (int i = apellido.length() + 1; i <= 50; i++) {
                apellido = apellido.substring(0) + " ";

            }
            
            archivo.writeUTF(apellido);
            

            archivo.writeUTF(persona.getCedula());
            archivo.writeUTF(persona.getCelular());
            archivo.writeInt(persona.getEdad());
//            archivo.writeUTF(persona.getFechaNac());
            archivo.writeDouble(persona.getSueldo());
            JOptionPane.showMessageDialog(this, "Persona Modificada");
            archivo.close();

            /*} else {

             JOptionPane.showMessageDialog(this, "Persona no modificada");

             }*/
        
        } catch (IOException ex) {

            JOptionPane.showMessageDialog(this, "Error " + ex.toString());

        } catch (ValidarNombre ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ValidarDosNombres ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ValidarApellido ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ValidarDosApellidos ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ValidarCedula ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ValidarEdad ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
/*        } catch (ValidarFechaNac ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        */} catch (ValidarSueldo ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ValidarCelular ex) {
            Logger.getLogger(Modificar.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtApellido.setText("");
        txtCedula.setText("");
        txtCelular.setText("");
        txtEdad.setText("");
        txtFecha.setText("");
        txtNombre.setText("");
        txtSueldo.setText("");

    }//GEN-LAST:event_btnModActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

        x = null;

    }//GEN-LAST:event_formInternalFrameClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPos;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
