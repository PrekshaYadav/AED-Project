/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Organization organization;
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        initComponents();
        
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Add User.gif"));
        icon.getImage().flush();
        jLabel5.setIcon(icon);
        
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizations()) {

            if (!(organization instanceof PatientOrganization)) {
                organizationJComboBox.addItem(organization);
            }
        }
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        organizationJTable.setRowSorter(sorter);
    }

    public void populateOrganizationEmpComboBox() {
        organizationEmpJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizations()) {

            if (!(organization instanceof PatientOrganization)) {
                organizationEmpJComboBox.addItem(organization);
            }
        }
    }

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee.getEmpId();
            row[1] = employee;
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        organizationJTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnRequestFunds = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        btnRequestFunds1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(207, 207, 207));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MANAGE EMPLOYEE");

        btnRequestFunds.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRequestFunds.setText("Create Employee");
        btnRequestFunds.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnRequestFundsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnRequestFundsFocusLost(evt);
            }
        });
        btnRequestFunds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRequestFundsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRequestFundsMouseExited(evt);
            }
        });
        btnRequestFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestFundsActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("You can manage employees below.");

        organizationJTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("View Employees:");

        organizationJComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Organization:");

        organizationEmpJComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Enter Name:");

        nameJTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnRequestFunds1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRequestFunds1.setText("Delete Employee");
        btnRequestFunds1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnRequestFunds1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnRequestFunds1FocusLost(evt);
            }
        });
        btnRequestFunds1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRequestFunds1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRequestFunds1MouseExited(evt);
            }
        });
        btnRequestFunds1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestFunds1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(74, 74, 74)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(organizationEmpJComboBox, 0, 173, Short.MAX_VALUE)
                                .addComponent(nameJTextField))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnRequestFunds1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRequestFunds)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {organizationEmpJComboBox, organizationJComboBox});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(nameJTextField))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequestFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequestFunds1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel8, organizationEmpJComboBox, organizationJComboBox});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 420, 550));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Add User.gif"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 500, 500));

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
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void btnRequestFundsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRequestFundsFocusGained
        // TODO add your handling code here:
//        btnRequestFunds.setForeground(new Color(255,255,255));
//        btnRequestFunds.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnRequestFundsFocusGained

    private void btnRequestFundsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRequestFundsFocusLost
        // TODO add your handling code here:
//        btnRequestFunds.setForeground(new Color(188,188,188));
//        btnRequestFunds.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnRequestFundsFocusLost

    private void btnRequestFundsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRequestFundsMouseEntered
        // TODO add your handling code here:
//        btnRequestFunds.setForeground(new Color(255,255,255));
//        btnRequestFunds.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_btnRequestFundsMouseEntered

    private void btnRequestFundsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRequestFundsMouseExited
        // TODO add your handling code here:
//        btnRequestFunds.setForeground(new Color(188,188,188));
//        btnRequestFunds.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_btnRequestFundsMouseExited

    private void btnRequestFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestFundsActionPerformed

        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        if (name == null || name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name cannot be empty","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
        nameJTextField.setText("");
    }//GEN-LAST:event_btnRequestFundsActionPerformed

    private void backJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseEntered
        // TODO add your handling code here:
//        backJButton.setForeground(new Color(0,0,0));
//        backJButton.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_backJButtonMouseEntered

    private void backJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backJButtonMouseExited
        // TODO add your handling code here:
//        backJButton.setForeground(new Color(188,188,188));
//        backJButton.setBackground(new Color(13,17,23));
    }//GEN-LAST:event_backJButtonMouseExited

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        jLabel5.setIcon(null);
        jLabel5.revalidate();
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDeleteEmployeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteEmployeeFocusGained

    private void btnDeleteEmployeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteEmployeeFocusLost

    private void btnDeleteEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteEmployeeMouseEntered

    private void btnDeleteEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteEmployeeMouseExited

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        // TODO add your handling code here:
        int selected_row = organizationJTable.getSelectedRow();
        if(selected_row < 0)
        {
            JOptionPane.showMessageDialog( this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        Employee emp_Selected = (Employee)model.getValueAt(selected_row, 1);
        UserAccountDirectory usd = organization.getUserAccountDirectory();
        int flag = 0;
        UserAccount selected_ua = new UserAccount();
        for(UserAccount ua : usd.getUserAccountList())
        {
            if (ua.getEmployee().equals(emp_Selected))
            {
                selected_ua = ua;
                flag = 1;
                break;
                
            }
            
        }
        if(flag == 1)
        {
            usd.getUserAccountList().remove(selected_ua);
            organization.getEmployeeDirectory().getEmployeeList().remove(emp_Selected);
            System.out.println("Useraccount and employee deleted");
        }
        populateTable(organization);
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void btnRequestFunds1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRequestFunds1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestFunds1FocusGained

    private void btnRequestFunds1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnRequestFunds1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestFunds1FocusLost

    private void btnRequestFunds1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRequestFunds1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestFunds1MouseEntered

    private void btnRequestFunds1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRequestFunds1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestFunds1MouseExited

    private void btnRequestFunds1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestFunds1ActionPerformed
        // TODO add your handling code here:
        int selected_row = organizationJTable.getSelectedRow();
        if(selected_row < 0)
        {
            JOptionPane.showMessageDialog( this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        Employee emp_Selected = (Employee)model.getValueAt(selected_row, 1);
        UserAccountDirectory usd = organization.getUserAccountDirectory();
        int flag = 0;
        UserAccount selected_ua = new UserAccount();
        for(UserAccount ua : usd.getUserAccountList())
        {
            if (ua.getEmployee().equals(emp_Selected))
            {
                selected_ua = ua;
                flag = 1;
                break;
                
            }
            
        }
        if(flag == 1)
        {
            usd.getUserAccountList().remove(selected_ua);
            organization.getEmployeeDirectory().getEmployeeList().remove(emp_Selected);
            System.out.println("Useraccount and employee deleted");
        }
        populateTable(organization);
        
    }//GEN-LAST:event_btnRequestFunds1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnRequestFunds;
    private javax.swing.JButton btnRequestFunds1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
