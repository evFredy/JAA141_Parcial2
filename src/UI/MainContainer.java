/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Docente;
import gb090091_hs110065.Utileria;

/**
 *
 * @author eleme
 */
public class MainContainer extends javax.swing.JFrame {
    Docente _gDocente;
    /**
     * Creates new form MainContainer
     */
    public MainContainer(Docente _gDocente) {
        initComponents(); 
        if (_gDocente == null) {
            this.dispose();
        }
        this._gDocente = _gDocente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiIngresarNotas = new javax.swing.JMenuItem();
        jmiModificarNotas = new javax.swing.JMenuItem();
        jmiCierreNotas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiCrearActividades = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu3.setText("Archivo");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu3.add(jmiSalir);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Notas");

        jmiIngresarNotas.setText("Ingresar");
        jmiIngresarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIngresarNotasActionPerformed(evt);
            }
        });
        jMenu1.add(jmiIngresarNotas);

        jmiModificarNotas.setText("Modificar");
        jmiModificarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarNotasActionPerformed(evt);
            }
        });
        jMenu1.add(jmiModificarNotas);

        jmiCierreNotas.setText("Cierre");
        jmiCierreNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCierreNotasActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCierreNotas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Actividades");

        jmiCrearActividades.setText("Crear");
        jmiCrearActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearActividadesActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCrearActividades);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiIngresarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIngresarNotasActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jmiIngresarNotasActionPerformed

    private void jmiModificarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiModificarNotasActionPerformed

    private void jmiCierreNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCierreNotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiCierreNotasActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiCrearActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearActividadesActionPerformed
        Actividades act = new Actividades(_gDocente);
        //Utileria.abriVentana(act, this.jDesktopPane1);        // TODO add your handling code here:
    }//GEN-LAST:event_jmiCrearActividadesActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiCierreNotas;
    private javax.swing.JMenuItem jmiCrearActividades;
    private javax.swing.JMenuItem jmiIngresarNotas;
    private javax.swing.JMenuItem jmiModificarNotas;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
