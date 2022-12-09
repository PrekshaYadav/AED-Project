/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.WorkQueue.PatientTreatmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author Sumit
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PatientTreatmentWorkRequest patientTreatmentWorkRequest;

    public ProcessWorkRequestJPanel(JPanel userProcessContainer, PatientTreatmentWorkRequest patientTreatmentWorkRequest) {
        initComponents();

        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Blood test result.gif"));
        icon.getImage().flush();
        jLabel7.setIcon(icon);

        this.userProcessContainer = userProcessContainer;
        this.patientTreatmentWorkRequest = patientTreatmentWorkRequest;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        resultJTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(207, 207, 207));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backJButtonMouseExited(evt);
            }
        });
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 6, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PROVIDE TEST RESULT");

        submitJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                submitJButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                submitJButtonFocusLost(evt);
            }
        });
        submitJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitJButtonMouseExited(evt);
            }
        });
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        resultJTextField.setAutoscrolls(false);
        resultJTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Result :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitJButton)
                .addGap(325, 325, 325))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 71, 460, 570));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Blood test result.gif"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 500, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseEntered
        // TODO add your handling code here:
//        backJButton.setForeground(new Color(0, 0, 0));
//        backJButton.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_backJButtonMouseEntered

    private void backJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseExited
        // TODO add your handling code here:
//        backJButton.setForeground(new Color(188, 188, 188));
//        backJButton.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_backJButtonMouseExited

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        jLabel7.setIcon(null);
        jLabel7.revalidate();

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_submitJButtonFocusGained
        // TODO add your handling code here:
//        submitJButton.setForeground(new Color(0, 0, 0));
//        submitJButton.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_submitJButtonFocusGained

    private void submitJButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_submitJButtonFocusLost
        // TODO add your handling code here:
//        submitJButton.setForeground(new Color(188, 188, 188));
//        submitJButton.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_submitJButtonFocusLost

    private void submitJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseEntered
        // TODO add your handling code here:
//        submitJButton.setForeground(new Color(0, 0, 0));
//        submitJButton.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_submitJButtonMouseEntered

    private void submitJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseExited
        // TODO add your handling code here:
//        submitJButton.setForeground(new Color(188, 188, 188));
//        submitJButton.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_submitJButtonMouseExited

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        String labResult = resultJTextField.getText().trim();
        if (labResult.equals("")) {
            JOptionPane.showMessageDialog(null, "Result is mandatory");
            return;
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                patientTreatmentWorkRequest.setLabResult(labResult);
                patientTreatmentWorkRequest.setStatus("Lab Test Completed");
                JOptionPane.showMessageDialog(null, "Result submitted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                resultJTextField.setText("");
                submitJButton.setEnabled(false);

                jLabel7.setIcon(null);
                jLabel7.revalidate();

                userProcessContainer.remove(this);
                Component[] componentArray = userProcessContainer.getComponents();
                Component component = componentArray[componentArray.length - 1];
                LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
                dwjp.populateTable();
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
            }

        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
