/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceBrokerRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HealthCenterEnterprise;
import Business.Enterprise.InsuranceEnterprise;
import Business.Insurance.Insurance;
import Business.InsuranceCustomer.InsuranceCustomer;
import Business.Network.Network;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AddNewPolicyHolderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private InsuranceEnterprise insuranceCompanyEnterprise;
    private String policyNumber;

    public AddNewPolicyHolderJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, String policyNumber) {
        initComponents();
        
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Insurance policy.gif"));
        icon.getImage().flush();
        jLabel7.setIcon(icon);
        
        this.userProcessContainer = userProcessContainer;
        this.insuranceCompanyEnterprise = (InsuranceEnterprise) enterprise;
        this.userAccount = userAccount;
        this.policyNumber = policyNumber;
        populateFields();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jDateChooserDob = new com.toedter.calendar.JDateChooser();
        txtPhone = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        cmbInsuranceName = new javax.swing.JComboBox();
        btnAddCustomer = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPolicyNumber = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtInsuranceCoverage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(207, 207, 207));
        setPreferredSize(new java.awt.Dimension(1200, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(13, 17, 23));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(188, 188, 188));
        jLabel9.setText("Address");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1071, 107, -1));

        jLabel14.setBackground(new java.awt.Color(13, 17, 23));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(188, 188, 188));
        jLabel14.setText("Email");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1023, 107, -1));

        backJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 6, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("ADD NEW CUSTOMER PANEL");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 6, 400, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ADD CUSTOMERS");

        tblCustomer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Policy Number", "Policy Name", "Coverage %"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("First Name :");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Last Name :");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Date of Birth :");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Phone Number :");

        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFirstName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLastName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jDateChooserDob.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserDob.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jDateChooserDob.setMaxSelectableDate(Calendar.getInstance().getTime());

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhone.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("SSN :");

        txtSSN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSSN.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Gender :");

        cmbGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male", "Other" }));
        cmbGender.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Policy Name :");

        cmbInsuranceName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbInsuranceName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cmbInsuranceName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbInsuranceNameFocusGained(evt);
            }
        });
        cmbInsuranceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbInsuranceNameActionPerformed(evt);
            }
        });

        btnAddCustomer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddCustomer.setText("Add Customer");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Address :");

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Email :");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtPolicyNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPolicyNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Policy Number :");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Policy Coverage(%) :");

        txtInsuranceCoverage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtInsuranceCoverage.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserDob, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23)
                        .addGap(5, 5, 5)
                        .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInsuranceCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbInsuranceName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooserDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel27)
                    .addComponent(txtInsuranceCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInsuranceName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel20, jLabel21, jLabel22, jLabel24});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbGender, cmbInsuranceName});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 510, 610));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Insurance policy.gif"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 500, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbInsuranceNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbInsuranceNameFocusGained
        System.out.println("Gained");
    }//GEN-LAST:event_cmbInsuranceNameFocusGained

    private void cmbInsuranceNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbInsuranceNameActionPerformed
        Insurance selectedPolicy = (Insurance) cmbInsuranceName.getSelectedItem();
        txtInsuranceCoverage.setText(String.valueOf(selectedPolicy.getCoverage()));
    }//GEN-LAST:event_cmbInsuranceNameActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed

        if (txtFirstName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "First name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtLastName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Last name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (jDateChooserDob.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please provide Date of birth", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cmbGender.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Please select Gender", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtSSN.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "SSN cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtPhone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide phone", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Address cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtInsuranceCoverage.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide Insurance Coverage", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {

            String firstName = txtFirstName.getText().trim();
            String lastName = txtLastName.getText().trim();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
            String dateOfBirth = "";
            try {
                dateOfBirth = sdf.format(jDateChooserDob.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Select customer's dob", "Error", JOptionPane.ERROR_MESSAGE);
            }
            String gender = cmbGender.getSelectedItem().toString();

            String ssn = txtSSN.getText().trim();
            if (!ssnPatternCheck()) {
                JOptionPane.showMessageDialog(null, "Invalid SSN format", "Error", JOptionPane.ERROR_MESSAGE);
                txtSSN.setBorder(BorderFactory.createLineBorder(Color.RED));

                return;
            }

            if (ssnPatternCheck()) {
                txtSSN.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            }

            String address = txtAddress.getText().trim();

            String phone = txtPhone.getText().trim();

            if (!phonePatternCorrect()) {
                JOptionPane.showMessageDialog(null, "Invalid phone number format", "Error", JOptionPane.ERROR_MESSAGE);
                txtPhone.setBorder(BorderFactory.createLineBorder(Color.RED));

                return;
            }

            if (phonePatternCorrect()) {
                txtPhone.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            }
            if (txtEmail.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please provide an Email ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (!usernamePatternCorrect(txtEmail.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Please provide a valid email ID in the format abc@xx.xx", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String policyNumber = txtPolicyNumber.getText().trim();
            String insurancePolicyName = cmbInsuranceName.getSelectedItem().toString();

            double coverage = Double.parseDouble(txtInsuranceCoverage.getText().trim());

            try {
                Double.parseDouble(txtInsuranceCoverage.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Coverage should be numeric", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Insurance insurance = new Insurance(insurancePolicyName, insuranceCompanyEnterprise.getName(), coverage);

            InsuranceCustomer insuranceCustomer = new InsuranceCustomer(insurance, policyNumber);

            insuranceCustomer.setCustFirstName(firstName);
            insuranceCustomer.setCustLastName(lastName);
            insuranceCustomer.setCustDOB(dateOfBirth);
            insuranceCustomer.setCustGender(gender);
            insuranceCustomer.setCustSSN(ssn);
            insuranceCustomer.setCustEmail(txtEmail.getText().trim());
            insuranceCustomer.setPhoneNumber(phone);
            insuranceCustomer.setCustAddress(address);

            insuranceCustomer.setInsurance(insurance);

            insuranceCompanyEnterprise.getInsuranceCustomerDirectory().getInsuranceCustomers().add(insuranceCustomer);

            insuranceCompanyEnterprise.getInsuranceCustomerDirectory().getInsuranceCustomers();

            populateTable();
            refresh();
            JOptionPane.showMessageDialog(null, "Customer is added", "Success", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnAddCustomerActionPerformed
    private boolean usernamePatternCorrect(String username) {
        Pattern p = Pattern.compile("^(.+)@(.+)$");
        Matcher m = p.matcher(username);
        boolean b = m.matches();
        return b;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmbInsuranceName;
    private com.toedter.calendar.JDateChooser jDateChooserDob;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtInsuranceCoverage;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables

    private boolean phonePatternCorrect() {

        Pattern pattern = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(txtPhone.getText());

        boolean b = false;

        if (matcher.matches()) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    private boolean ssnPatternCheck() {

        Pattern pattern = Pattern.compile("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$");
        Matcher matcher = pattern.matcher(txtSSN.getText());

        boolean b = false;

        if (matcher.matches()) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    private void refresh() {

        txtPolicyNumber.setText(UUID.randomUUID().toString().substring(0, 7));
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPhone.setText("");
        txtSSN.setText("");
        txtEmail.setText("");
        jDateChooserDob.setDate(null);
        txtAddress.setText("");

    }

    private void populateFields() {
        txtPolicyNumber.setText(policyNumber);
        List<Insurance> policies = insuranceCompanyEnterprise.getInsurancePolicyDirectory().getPolicies();

        for (Insurance policy : policies) {
            cmbInsuranceName.addItem(policy);
        }

        Insurance selectedPolicy = (Insurance) cmbInsuranceName.getSelectedItem();

        if (selectedPolicy != null) {
            txtInsuranceCoverage.setText(String.valueOf(selectedPolicy.getCoverage()));
        } else {
            JOptionPane.showMessageDialog(null, "No Existing policy!");
            return;
        }

    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();

        dtm.setRowCount(0);
        List<InsuranceCustomer> customers = insuranceCompanyEnterprise.getInsuranceCustomerDirectory().getInsuranceCustomers();
        for (InsuranceCustomer customer : customers) {
            Object[] row = new Object[4];
            row[0] = customer.getCustFirstName() + " " + customer.getCustLastName();
            row[1] = customer;
            row[2] = customer.getInsurance().getPolicyName();
            row[3] = customer.getInsurance().getCoverage();

            dtm.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dtm);
        tblCustomer.setRowSorter(sorter);
    }

    private boolean checkEmailDuplication(String patientEmail) {
        boolean isCustomerPresent = false;
        String ssn = txtSSN.getText().trim();

        for (InsuranceCustomer ic : insuranceCompanyEnterprise.getInsuranceCustomerDirectory().getInsuranceCustomers()) {
            if (ssn == ic.getCustSSN()) {
                isCustomerPresent = true;
            }
        }

        return isCustomerPresent;
    }
}
