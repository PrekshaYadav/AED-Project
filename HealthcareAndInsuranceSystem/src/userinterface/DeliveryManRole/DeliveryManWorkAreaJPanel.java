/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryManOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicalDeliveryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import userinterface.LoginJPanel;

/**
 *
 * 
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DeliveryManOrganization deliveryManOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil;
    private EcoSystem ecosystem;

    /**
     * Creates new form DeliveryManWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DeliveryManOrganization organization, Enterprise enterprise, DB4OUtil dB4OUtil, EcoSystem ecosystem) {
        initComponents();
        
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Coronavirus Delivery Preventions.gif"));
        icon.getImage().flush();
        jLabel5.setIcon(icon);

        this.userProcessContainer = userProcessContainer;
        this.deliveryManOrganization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        populateRequestTable();
        valueLabel1.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogoutPatient = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnAssignToMe = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnCompleteDelivery = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(207, 207, 207));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutPatient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogoutPatient.setText("Logout");
        btnLogoutPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutPatientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutPatientMouseExited(evt);
            }
        });
        btnLogoutPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutPatientActionPerformed(evt);
            }
        });
        add(btnLogoutPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(1082, 10, -1, 32));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MANAGE EMPLOYEE");

        btnAssignToMe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAssignToMe.setText("Assign to Me");
        btnAssignToMe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAssignToMeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAssignToMeFocusLost(evt);
            }
        });
        btnAssignToMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignToMeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignToMeMouseExited(evt);
            }
        });
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("You can manage your orders below.");

        enterpriseLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        enterpriseLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        enterpriseLabel1.setText("Enterprise :");

        valueLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        valueLabel1.setText("<value>");

        workRequestJTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor", "Delivery Man", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Delivery Work Queue");

        btnCompleteDelivery.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCompleteDelivery.setText("Complete Delivery");
        btnCompleteDelivery.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnCompleteDeliveryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnCompleteDeliveryFocusLost(evt);
            }
        });
        btnCompleteDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCompleteDeliveryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCompleteDeliveryMouseExited(evt);
            }
        });
        btnCompleteDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(enterpriseLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCompleteDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(71, 71, 71)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel1)
                    .addComponent(valueLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCompleteDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {enterpriseLabel1, valueLabel1});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 420, 550));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("DELIVERY PERSON WORK AREA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 6, 380, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Coronavirus Delivery Preventions.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 500, 500));
    }// </editor-fold>//GEN-END:initComponents
    public void populateRequestTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : deliveryManOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[4];
            row[0] = (MedicalDeliveryWorkRequest) request;
            if(((MedicalDeliveryWorkRequest) request).getDeliveryMan()==null)
                row[1]="";
            else
                row[1] = String.valueOf(((MedicalDeliveryWorkRequest) request).getDeliveryMan());
            row[2] = ((MedicalDeliveryWorkRequest) request).getStatus();
            model.addRow(row);
        }

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
    }
    private void btnLogoutPatientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutPatientMouseEntered
        // TODO add your handling code here:
//        btnLogoutPatient.setForeground(new Color(255, 255, 255));
//        btnLogoutPatient.setBackground(new Color(158, 33, 50));
    }//GEN-LAST:event_btnLogoutPatientMouseEntered

    private void btnLogoutPatientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutPatientMouseExited
        // TODO add your handling code here:
//        btnLogoutPatient.setForeground(new Color(188, 188, 188));
//        btnLogoutPatient.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnLogoutPatientMouseExited

    private void btnLogoutPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutPatientActionPerformed
        // TODO add your handling code here:

        userProcessContainer.removeAll();
        LoginJPanel lp = new LoginJPanel(ecosystem, dB4OUtil, userProcessContainer);
        userProcessContainer.add("LoginJPanel", lp);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnLogoutPatientActionPerformed

    private void btnAssignToMeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAssignToMeFocusGained
        // TODO add your handling code here:
//        btnAssignToMe.setForeground(new Color(255, 255, 255));
//        btnAssignToMe.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAssignToMeFocusGained

    private void btnAssignToMeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAssignToMeFocusLost
        // TODO add your handling code here:
//        btnAssignToMe.setForeground(new Color(188, 188, 188));
//        btnAssignToMe.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnAssignToMeFocusLost

    private void btnAssignToMeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignToMeMouseEntered
        // TODO add your handling code here:
//        btnAssignToMe.setForeground(new Color(255, 255, 255));
//        btnAssignToMe.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAssignToMeMouseEntered

    private void btnAssignToMeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignToMeMouseExited
        // TODO add your handling code here:
//        btnAssignToMe.setForeground(new Color(188, 188, 188));
//        btnAssignToMe.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnAssignToMeMouseExited

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            WorkRequest medicalDeliveryWorkRequest = (MedicalDeliveryWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            if (((MedicalDeliveryWorkRequest) medicalDeliveryWorkRequest).getDeliveryMan() == null) {

                if (medicalDeliveryWorkRequest.getStatus().equalsIgnoreCase("Medicines Sent")) {
                    ((MedicalDeliveryWorkRequest) medicalDeliveryWorkRequest).setDeliveryMan(userAccount);
                    medicalDeliveryWorkRequest.setStatus("Pending");
                    populateRequestTable();
                    JOptionPane.showMessageDialog(null, "Success!! Request is assigned to you.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot assign this patient as its current state is: " + medicalDeliveryWorkRequest.getStatus(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                if (((MedicalDeliveryWorkRequest) medicalDeliveryWorkRequest).getDeliveryMan() != null) {
                    JOptionPane.showMessageDialog(null, "Request is already assigned", "Error", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Not Authorized", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnCompleteDeliveryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCompleteDeliveryFocusGained
        // TODO add your handling code here:
//        btnCompleteDelivery.setForeground(new Color(255, 255, 255));
//        btnCompleteDelivery.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnCompleteDeliveryFocusGained

    private void btnCompleteDeliveryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCompleteDeliveryFocusLost
        // TODO add your handling code here:
//        btnCompleteDelivery.setForeground(new Color(188, 188, 188));
//        btnCompleteDelivery.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnCompleteDeliveryFocusLost

    private void btnCompleteDeliveryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompleteDeliveryMouseEntered
        // TODO add your handling code here:
//        btnCompleteDelivery.setForeground(new Color(255, 255, 255));
//        btnCompleteDelivery.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnCompleteDeliveryMouseEntered

    private void btnCompleteDeliveryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompleteDeliveryMouseExited
        // TODO add your handling code here:
//        btnCompleteDelivery.setForeground(new Color(188, 188, 188));
//        btnCompleteDelivery.setBackground(new Color(22, 27, 34));
    }//GEN-LAST:event_btnCompleteDeliveryMouseExited

    private void btnCompleteDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteDeliveryActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();
        MedicalDeliveryWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            workRequest = (MedicalDeliveryWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            if (workRequest.getDeliveryMan() != null) {
                if (userAccount.equals(workRequest.getDeliveryMan())) {
                    if (workRequest.getStatus().equalsIgnoreCase("Pending")) {

                        workRequest.setStatus("Delivered");
                        populateRequestTable();
                        JOptionPane.showMessageDialog(null, "Medicines have been delivered", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (workRequest.getStatus().equalsIgnoreCase("Delivered")) {
                            JOptionPane.showMessageDialog(null, "Medicines have already been delivered", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Not Authorised", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Assign the request first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCompleteDeliveryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnCompleteDelivery;
    private javax.swing.JButton btnLogoutPatient;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
