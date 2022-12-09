/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacistRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.PharmacistOrganization;
import Business.Pharmacy.Medicine;
import Business.UserAccount.UserAccount;
import com.github.javafaker.Faker;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.LoginJPanel;


public class PharmacistWorkAreaJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private PharmacistOrganization pharmacistOrganization;
    private PharmacyEnterprise enterprise;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil;
    private EcoSystem ecoSystem;
    
    /**
     * Creates new form PharmacistWorkAreaJPanel
     */
    public PharmacistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PharmacistOrganization organization, Enterprise enterprise,DB4OUtil dB4OUtil,EcoSystem ecoSystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.pharmacistOrganization = organization;
        this.enterprise = (PharmacyEnterprise)enterprise;
        this.dB4OUtil=dB4OUtil;
        this.ecoSystem=ecoSystem;
        this.userAccount = account;
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        locationTxt = new javax.swing.JLabel();
        amountTxt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        medPriceTxt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        enterpriseLabel2 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        medNameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(207, 207, 207));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutPatient.setBackground(new java.awt.Color(242, 242, 242));
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PHARMACIST WORK AREA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 6, 430, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MANAGE MEDICINES");

        submitJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitJButton.setText("Generate Medicines");
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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("You can manage medicines below.");

        locationTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        locationTxt.setForeground(new java.awt.Color(188, 188, 188));

        amountTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        amountTxt.setForeground(new java.awt.Color(188, 188, 188));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Medicine Name :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Medicine Price($) :");

        medPriceTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medPriceTxtActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Add Medicine");
        btnAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnAddFocusLost(evt);
            }
        });
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        enterpriseLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        enterpriseLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        enterpriseLabel2.setText("Enterprise :");

        valueLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        valueLabel1.setText("<value>");

        medNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        medNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNameTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Generate random medicines.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(enterpriseLabel2)
                            .addGap(6, 6, 6)
                            .addComponent(valueLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(medNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(medPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel2)
                    .addComponent(valueLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(locationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(medNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 420, 550));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Medicine.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 500, 500));
    }// </editor-fold>//GEN-END:initComponents

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
        LoginJPanel lp = new LoginJPanel(ecoSystem, dB4OUtil, userProcessContainer);
        userProcessContainer.add("LoginJPanel", lp);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(ecoSystem);
    }//GEN-LAST:event_btnLogoutPatientActionPerformed

    private void submitJButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_submitJButtonFocusGained
        // TODO add your handling code here:
//        submitJButton.setForeground(new Color(255, 255, 255));
//        submitJButton.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_submitJButtonFocusGained

    private void submitJButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_submitJButtonFocusLost
        // TODO add your handling code here:
//        submitJButton.setForeground(new Color(188, 188, 188));
//        submitJButton.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_submitJButtonFocusLost

    private void submitJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseEntered
        // TODO add your handling code here:
//        submitJButton.setForeground(new Color(255, 255, 255));
//        submitJButton.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_submitJButtonMouseEntered

    private void submitJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseExited
        // TODO add your handling code here:
//        submitJButton.setForeground(new Color(188, 188, 188));
//        submitJButton.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_submitJButtonMouseExited

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Faker faker= new Faker();
        for(int i=0; i<20;i++){
            Medicine m=new Medicine();
            m.setMedicineName(faker.medical().medicineName());
            m.setMedicinePrice(faker.number().randomDouble(1, 20, 500));
            this.enterprise.addMedicine(m);
        }
        JOptionPane.showMessageDialog(null, "Random medicines generated", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void medPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medPriceTxtActionPerformed

    private void btnAddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddFocusGained
        // TODO add your handling code here:
//        btnAdd.setForeground(new Color(255, 255, 255));
//        btnAdd.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAddFocusGained

    private void btnAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAddFocusLost
        // TODO add your handling code here:
//        btnAdd.setForeground(new Color(188, 188, 188));
//        btnAdd.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnAddFocusLost

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
//        btnAdd.setForeground(new Color(255, 255, 255));
//        btnAdd.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
//        btnAdd.setForeground(new Color(188, 188, 188));
//        btnAdd.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        Medicine m= new Medicine();
        if(medNameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Medicine name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(medPriceTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Medicine price cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            m.setMedicinePrice(Double.parseDouble(medPriceTxt.getText()));
            m.setMedicineName(medNameTxt.getText());
            JOptionPane.showMessageDialog(null, "Medicine Added", "Success", JOptionPane.INFORMATION_MESSAGE);
            medNameTxt.setText("");
            medPriceTxt.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Medicine price has to be numeric", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void medNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medNameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountTxt;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLogoutPatient;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locationTxt;
    private javax.swing.JTextField medNameTxt;
    private javax.swing.JTextField medPriceTxt;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
