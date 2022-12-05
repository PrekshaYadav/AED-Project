/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Sumit
 */
public class LoginJPanel extends javax.swing.JPanel {

    private JPanel container;
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil;

    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel(EcoSystem ecosystem, DB4OUtil dB4OUtil,JPanel container) {
        initComponents();
        
        this.ecosystem = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.container=container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loginJButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 17, 23));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(188, 188, 188));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<> with ♡ by Team Batman");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 695, 290, 40));

        jPanel1.setBackground(new java.awt.Color(22, 27, 34));
        jPanel1.setForeground(new java.awt.Color(188, 188, 188));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(188, 188, 188));
        jLabel2.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(188, 188, 188));
        jLabel3.setText("Username");

        userNameJTextField.setBackground(new java.awt.Color(22, 27, 34));
        userNameJTextField.setForeground(new java.awt.Color(188, 188, 188));
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(188, 188, 188));
        jLabel4.setText("Password");

        loginJButton.setBackground(new java.awt.Color(22, 27, 34));
        loginJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(188, 188, 188));
        loginJButton.setText("Login");
        loginJButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginJButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginJButtonFocusLost(evt);
            }
        });
        loginJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseHover(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginJButtonMouseExited(evt);
            }
        });
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(22, 27, 34));
        passwordField.setForeground(new java.awt.Color(188, 188, 188));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(22, 27, 34));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(188, 188, 188));
        jLabel5.setText("You will be redirected to your ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 223, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(188, 188, 188));
        jLabel6.setText("Enter credentials to login.");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 223, 26));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(188, 188, 188));
        jLabel7.setText("respective work area after login.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 223, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(userNameJTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordField)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(loginJButton)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordField, userNameJTextField});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 102, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/loginphoto.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 380, 760));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/loginphoto.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, 0, 880, 760));

        jLabel10.setFont(new java.awt.Font("Segoe Script", 1, 10)); // NOI18N
        jLabel10.setText("madgi");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 130, 50, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        String userName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        UserAccount userAccount = ecosystem.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network net=null;

        if (userAccount == null) {
            for (Network network : ecosystem.getNetworks()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                net=network;
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Invalid credentials");

            return;
        } else {
            userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, ecosystem, dB4OUtil));
            layout.next(container);
        }

        loginJButton.setEnabled(false);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);

    }//GEN-LAST:event_loginJButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void mouseHover(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseHover
        // TODO add your handling code here:
        
        loginJButton.setForeground(new Color(255,255,255));
        loginJButton.setBackground(new Color(35,134,54));
        
    }//GEN-LAST:event_mouseHover

    private void loginJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginJButtonMouseExited
        // TODO add your handling code here:
        
        loginJButton.setForeground(new Color(188,188,188));
        loginJButton.setBackground(new Color(22,27,34));
        
    }//GEN-LAST:event_loginJButtonMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        
        jLabel1.setFont(new Font(jLabel1.getFont().getName(),Font.PLAIN,19));
        
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        
        jLabel1.setFont(new Font(jLabel1.getFont().getName(),Font.PLAIN,18));
        
    }//GEN-LAST:event_jLabel1MouseExited

    private void loginJButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginJButtonFocusGained
        // TODO add your handling code here:
        loginJButton.setForeground(new Color(255,255,255));
        loginJButton.setBackground(new Color(35,134,54));
    }//GEN-LAST:event_loginJButtonFocusGained

    private void loginJButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginJButtonFocusLost
        // TODO add your handling code here:
        loginJButton.setForeground(new Color(188,188,188));
        loginJButton.setBackground(new Color(22,27,34));
    }//GEN-LAST:event_loginJButtonFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
