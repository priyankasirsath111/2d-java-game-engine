/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChangeRes.java
 *
 * Created on 02.01.2011, 07:06:32
 */

package game;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Philipp
 */
public class ChangeRes extends javax.swing.JFrame {

    Dimension resolution = new Dimension(320, 240);

    /** Creates new form ChangeRes */
    public ChangeRes() {
        initComponents();
    }

    //Combo Box:
    private class ComboBoxActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(jComboBox1.getSelectedIndex() == 0){
                resolution = new Dimension(320, 240);
            }
            if(jComboBox1.getSelectedIndex() == 1){
                resolution = new Dimension(480, 320);
            }
            if(jComboBox1.getSelectedIndex() == 2){
                resolution = new Dimension(640, 480);
            }
            if(jComboBox1.getSelectedIndex() == 3){
                resolution = new Dimension(1024, 768);
            }
            if(jComboBox1.getSelectedIndex() == 4){
                resolution = new Dimension(1920, 1080);
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "320x240", "480x320", "640x480", "1024x768", "1920x1080" }));
        jComboBox1.addActionListener(new ComboBoxActionListener());
        jComboBox1.setName("jComboBox1"); // NOI18N

        jButton1.setText("OK");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 213, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gameMain.resolution = resolution;
        System.out.println("changin resolution to: " + resolution.toString());
        gameMain.camera.bounds = new Rectangle(0, 0, gameMain.loadedLevel.getWidth()*16, (gameMain.loadedLevel.getHeight())*16 - resolution.height);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    // End of variables declaration//GEN-END:variables

}
