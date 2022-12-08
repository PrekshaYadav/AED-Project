/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAuditorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.GovernmentSecretaryOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;


public class AuditorProcessWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private GovernmentFundRequest governmentFundRequest;
    private AuditorWorkAreaJPanel officerWorkAreaJPanel;
    private EcoSystem ecoSystem;

    public AuditorProcessWorkRequestJPanel(JPanel jPanel, UserAccount userAccount, GovernmentFundRequest fundRequest, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();

        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Co-workers.gif"));
        icon.getImage().flush();
        jLabel5.setIcon(icon);

        this.jPanel = jPanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.governmentFundRequest = fundRequest;
        this.ecoSystem = ecoSystem;
        amountTxt.setText(String.valueOf(governmentFundRequest.getRequestAmount()));
        locationTxt.setText(governmentFundRequest.getLocation());
        populationTxt.setText(String.valueOf(governmentFundRequest.getPopulation()));
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
        sendRequestToSecretaryBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        populationTxt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        messageTxt = new javax.swing.JTextField();
        btnReject = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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
        jLabel9.setText("AUDITOR WORK AREA");

        sendRequestToSecretaryBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sendRequestToSecretaryBtn.setText("Forward to Secretary");
        sendRequestToSecretaryBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sendRequestToSecretaryBtnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sendRequestToSecretaryBtnFocusLost(evt);
            }
        });
        sendRequestToSecretaryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendRequestToSecretaryBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendRequestToSecretaryBtnMouseExited(evt);
            }
        });
        sendRequestToSecretaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendRequestToSecretaryBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("You can manage requests below.");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Location :");

        locationTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        locationTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Amount($) :");

        amountTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amountTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Population :");

        populationTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        populationTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Message :");

        messageTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        messageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTxtActionPerformed(evt);
            }
        });

        btnReject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReject.setText("Reject Request");
        btnReject.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnRejectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnRejectFocusLost(evt);
            }
        });
        btnReject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRejectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRejectMouseExited(evt);
            }
        });
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(populationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(messageTxt))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sendRequestToSecretaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(locationTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(populationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(sendRequestToSecretaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 420, 550));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Co-workers.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 500, 500));
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

        jLabel5.setIcon(null);
        jLabel5.revalidate();

        jPanel.remove(this);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void sendRequestToSecretaryBtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sendRequestToSecretaryBtnFocusGained
        // TODO add your handling code here:
//        sendRequestToSecretaryBtn.setForeground(new Color(255, 255, 255));
//        sendRequestToSecretaryBtn.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_sendRequestToSecretaryBtnFocusGained

    private void sendRequestToSecretaryBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sendRequestToSecretaryBtnFocusLost
        // TODO add your handling code here:
//        sendRequestToSecretaryBtn.setForeground(new Color(188, 188, 188));
//        sendRequestToSecretaryBtn.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_sendRequestToSecretaryBtnFocusLost

    private void sendRequestToSecretaryBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendRequestToSecretaryBtnMouseEntered
        // TODO add your handling code here:
//        sendRequestToSecretaryBtn.setForeground(new Color(255, 255, 255));
//        sendRequestToSecretaryBtn.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_sendRequestToSecretaryBtnMouseEntered

    private void sendRequestToSecretaryBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendRequestToSecretaryBtnMouseExited
        // TODO add your handling code here:
//        sendRequestToSecretaryBtn.setForeground(new Color(188, 188, 188));
//        sendRequestToSecretaryBtn.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_sendRequestToSecretaryBtnMouseExited

    private void sendRequestToSecretaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendRequestToSecretaryBtnActionPerformed

        String message = messageTxt.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            governmentFundRequest.setMessage(message);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {

                governmentFundRequest.setSender(userAccount);
                governmentFundRequest.setStatus("Sent to Secretary");

                Organization org = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
                    if (organization instanceof GovernmentSecretaryOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequests().add(governmentFundRequest);
                    userAccount.getWorkQueue().getWorkRequests().add(governmentFundRequest);
                }
                JOptionPane.showMessageDialog(null, "Request sent to secretary successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                messageTxt.setText("");
                btnReject.setEnabled(false);
                sendRequestToSecretaryBtn.setEnabled(false);

                jLabel5.setIcon(null);
                jLabel5.revalidate();

                jPanel.remove(this);
                Component[] componentArray = jPanel.getComponents();
                Component component = componentArray[componentArray.length - 1];
                AuditorWorkAreaJPanel dwjp = (AuditorWorkAreaJPanel) component;
                dwjp.populateTable();
                CardLayout layout = (CardLayout) jPanel.getLayout();
                layout.previous(jPanel);
            }

            messageTxt.setText("");
        }
    }//GEN-LAST:event_sendRequestToSecretaryBtnActionPerformed

    private void messageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTxtActionPerformed

    private void btnRejectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRejectFocusGained
        // TODO add your handling code here:
//        sendRequestToSecretaryBtn.setForeground(new Color(255, 255, 255));
//        sendRequestToSecretaryBtn.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnRejectFocusGained

    private void btnRejectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRejectFocusLost
        // TODO add your handling code here:
//        sendRequestToSecretaryBtn.setForeground(new Color(188, 188, 188));
//        sendRequestToSecretaryBtn.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnRejectFocusLost

    private void btnRejectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRejectMouseEntered
        // TODO add your handling code here:
//        sendRequestToSecretaryBtn.setForeground(new Color(255, 255, 255));
//        sendRequestToSecretaryBtn.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnRejectMouseEntered

    private void btnRejectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRejectMouseExited
        // TODO add your handling code here:
//        sendRequestToSecretaryBtn.setForeground(new Color(188, 188, 188));
//        sendRequestToSecretaryBtn.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnRejectMouseExited

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:

        String message = messageTxt.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            governmentFundRequest.setMessage(message);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                governmentFundRequest.setStatus("Rejected");
                messageTxt.setText("");
                btnReject.setEnabled(false);
                sendRequestToSecretaryBtn.setEnabled(false);
                jLabel5.setIcon(null);
                jLabel5.revalidate();

                jPanel.remove(this);
                Component[] componentArray = jPanel.getComponents();
                Component component = componentArray[componentArray.length - 1];
                AuditorWorkAreaJPanel dwjp = (AuditorWorkAreaJPanel) component;
                dwjp.populateTable();
                CardLayout layout = (CardLayout) jPanel.getLayout();
                layout.previous(jPanel);
            }

            messageTxt.setText("");
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locationTxt;
    private javax.swing.JTextField messageTxt;
    private javax.swing.JLabel populationTxt;
    private javax.swing.JButton sendRequestToSecretaryBtn;
    // End of variables declaration//GEN-END:variables
}