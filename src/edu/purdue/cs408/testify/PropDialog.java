/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.purdue.cs408.testify;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Austin
 */
public class PropDialog extends javax.swing.JDialog {
    Test test;
    /**
     * Creates new form PropDialog
     */
    public PropDialog(java.awt.Frame parent, boolean modal, Test test) {
        super(parent, modal);
        this.test = test;
        this.setTitle("Test Properties");
        initComponents();
        SimpleDateFormat dateFmt = new SimpleDateFormat("M/d/yy");
        SimpleDateFormat timeFmt = new SimpleDateFormat("h:mm a");
        dateField.setText(dateFmt.format(test.getDate()));
        stTimeField.setText(test.getStartTime().toString());
        endTimeField.setText(test.getEndTime().toString());
        compCheckbox.setSelected(test.isEnable_compilation());
        invalidateCheckbox.setSelected(test.isInvalidate_on_focus());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelButton = new javax.swing.JButton();
        compCheckbox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        endTimeField = new javax.swing.JFormattedTextField();
        stTimeField = new javax.swing.JFormattedTextField();
        doneButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        invalidateCheckbox = new javax.swing.JCheckBox();
        dateField = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        compCheckbox.setText("Enable Compilation");
        compCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compCheckboxActionPerformed(evt);
            }
        });

        jLabel3.setText("End Time");

        endTimeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        stTimeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        doneButton.setText("Apply");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Start Time");

        invalidateCheckbox.setText("Invalidate on Lost Focus");
        invalidateCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invalidateCheckboxActionPerformed(evt);
            }
        });

        dateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel1.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invalidateCheckbox)
                    .addComponent(compCheckbox)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(endTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dateField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                .addComponent(stTimeField)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(doneButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(stTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(endTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(compCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidateCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneButton)
                    .addComponent(cancelButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // close this JFrame
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void compCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compCheckboxActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        saveProperties();
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

    private void invalidateCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invalidateCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invalidateCheckboxActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    private void saveProperties() {
        String dateText = dateField.getText();
        String stText = stTimeField.getText();
        test.setDate(new Date(dateField.getText()));
        test.setStartTime(new Time(stTimeField.getText()));
        test.setEndTime(new Time(endTimeField.getText()));
        test.setEnableCompilation(compCheckbox.isSelected());
        test.setInvalidateOnFocus(invalidateCheckbox.isSelected());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox compCheckbox;
    private javax.swing.JFormattedTextField dateField;
    private javax.swing.JButton doneButton;
    private javax.swing.JFormattedTextField endTimeField;
    private javax.swing.JCheckBox invalidateCheckbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JFormattedTextField stTimeField;
    // End of variables declaration//GEN-END:variables
}
