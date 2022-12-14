/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import userinterface.HealthcareAccountantRole.EmailBillingInformationToPatient;

/**
 *
 *
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;

    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        model.setRowCount(0);
        for (Network network : ecosystem.getNetworks()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        networkJTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(207, 207, 207));
        setPreferredSize(new java.awt.Dimension(1200, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("MANAGE NETWORK");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 6, 380, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NETWORK");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 319, 50));

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 340, 130));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 280, 150, -1));
        jPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 150, -1));

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
        jPanel1.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 90, -1));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnDeleteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnDeleteFocusLost(evt);
            }
        });
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 90, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 420, 550));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Online world.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 500, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String name = nameJTextField.getText();
        ArrayList<Network> networkList = ecosystem.getNetworks();
        ArrayList<String> networkNames = new ArrayList<>();
        for (Network network : networkList) {
            networkNames.add(network.getNetworkName());
        }
        if (networkNames.contains(name)) {
            JOptionPane.showMessageDialog(null, "Network already exists", "Error", JOptionPane.ERROR_MESSAGE);
            nameJTextField.setText("");
            return;
        } else {
            if (name == null || name.equals("")) {
                JOptionPane.showMessageDialog(null, "Network Name cannot be Empty", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                Network network = ecosystem.createAndAddNetwork();
                network.setNetworkName(name);
                JOptionPane.showMessageDialog(null, "New Network is added", "Success", JOptionPane.INFORMATION_MESSAGE);
                nameJTextField.setText("");
                populateNetworkTable();
            }
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = networkJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a record first from the table to delete Network", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            Network network = (Network) networkJTable.getValueAt(selectedRow, 0);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                ecosystem.getNetworks().remove(network);
                populateNetworkTable();

                JOptionPane.showMessageDialog(null, "Network is deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_submitJButtonFocusGained
        // TODO add your handling code here:
//         submitJButton.setForeground(new Color(255, 255, 255));
//        submitJButton.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_submitJButtonFocusGained

    private void submitJButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_submitJButtonFocusLost
        // TODO add your handling code here:
//         submitJButton.setForeground(new Color(188, 188, 188));
//        submitJButton.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_submitJButtonFocusLost

    private void submitJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseEntered
        // TODO add your handling code here:
//         submitJButton.setForeground(new Color(255, 255, 255));
//        submitJButton.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_submitJButtonMouseEntered

    private void submitJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitJButtonMouseExited
        // TODO add your handling code here:
//         submitJButton.setForeground(new Color(188, 188, 188));
//        submitJButton.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_submitJButtonMouseExited

    private void btnDeleteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeleteFocusGained
        // TODO add your handling code here:
//        btnDelete.setForeground(new Color(255, 255, 255));
//        btnDelete.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnDeleteFocusGained

    private void btnDeleteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnDeleteFocusLost
        // TODO add your handling code here:
//        btnDelete.setForeground(new Color(188, 188, 188));
//        btnDelete.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnDeleteFocusLost

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        // TODO add your handling code here:
//        btnDelete.setForeground(new Color(255, 255, 255));
//        btnDelete.setBackground(new Color(144, 202, 249));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        // TODO add your handling code here:
//        btnDelete.setForeground(new Color(188, 188, 188));
//        btnDelete.setBackground(new Color(13, 17, 23));
    }//GEN-LAST:event_btnDeleteMouseExited

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
