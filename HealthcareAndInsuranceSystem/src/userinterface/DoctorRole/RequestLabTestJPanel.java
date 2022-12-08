
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.TestingLabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientTreatmentWorkRequest patientTreatmentWorkRequest;

    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, PatientTreatmentWorkRequest patientTreatmentWorkRequest) {
        initComponents();
        
        ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Blood test.gif"));
        icon.getImage().flush();
        jLabel3.setIcon(icon);
        
        jScrollPane1.setBorder(null);
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.patientTreatmentWorkRequest = patientTreatmentWorkRequest;
        valueLabel.setText(enterprise.getName());
        requestTestJButton.setEnabled(true);
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
        jLabel6 = new javax.swing.JLabel();
        txtPatientId1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        txtLabType = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLabMessage = new javax.swing.JTextField();
        requestTestJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(207, 207, 207));
        setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LAB TEST REQUEST");

        txtPatientId1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPatientId1.setText("Please enter lab type from the following list:");

        enterpriseLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        valueLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        valueLabel.setText("<value>");

        txtLabType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Lab Type");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Message");

        txtLabMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        requestTestJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        requestTestJButton.setText("Request Test");
        requestTestJButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        requestTestJButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                requestTestJButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                requestTestJButtonFocusLost(evt);
            }
        });
        requestTestJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestTestJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                requestTestJButtonMouseExited(evt);
            }
        });
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(207, 207, 207));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("• Chemistry\n• Surgical Pathology\n• Microbiology\n• Hematology");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtPatientId1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(txtLabType))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(txtLabMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(txtPatientId1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(txtLabType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(txtLabMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {enterpriseLabel, jLabel1, jLabel2, txtLabMessage, txtLabType, valueLabel});

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 71, -1, 580));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesLatest/Blood test.gif"))); // NOI18N
        jLabel3.setText("jLabel1");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 600, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String labType = txtLabType.getText().trim();
        String message = txtLabMessage.getText().trim();

        if (labType.equals("")) {
            JOptionPane.showMessageDialog(null, "Lap type is mandatory!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        patientTreatmentWorkRequest.setLabTestMessage(message);
        patientTreatmentWorkRequest.setSender(userAccount);
        patientTreatmentWorkRequest.setStatus("Sent To Lab");
        patientTreatmentWorkRequest.setReceiver(null);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
            if (organization instanceof TestingLabOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequests().add(patientTreatmentWorkRequest);
            userAccount.getWorkQueue().getWorkRequests().add(patientTreatmentWorkRequest);
            JOptionPane.showMessageDialog(null, "Lab request sent", "Success", JOptionPane.INFORMATION_MESSAGE);
            txtLabMessage.setText("");
            txtLabType.setText("");
            requestTestJButton.setEnabled(false);
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
            dwjp.populateRequestTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

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

        jLabel1.setIcon(null);
        jLabel1.revalidate();

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestTestJButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_requestTestJButtonFocusGained
        // TODO add your handling code here:
//        requestTestJButton.setForeground(new Color(0,0,0));
//        requestTestJButton.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_requestTestJButtonFocusGained

    private void requestTestJButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_requestTestJButtonFocusLost
        // TODO add your handling code here:
//        requestTestJButton.setForeground(new Color(188,188,188));
//        requestTestJButton.setBackground(new Color(22,27,34));
    }//GEN-LAST:event_requestTestJButtonFocusLost

    private void requestTestJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTestJButtonMouseEntered
        // TODO add your handling code here:
//        requestTestJButton.setForeground(new Color(0,0,0));
//        requestTestJButton.setBackground(new Color(144,202,249));
    }//GEN-LAST:event_requestTestJButtonMouseEntered

    private void requestTestJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestTestJButtonMouseExited
        // TODO add your handling code here:
//        requestTestJButton.setForeground(new Color(188,188,188));
//        requestTestJButton.setBackground(new Color(22,27,34));
    }//GEN-LAST:event_requestTestJButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField txtLabMessage;
    private javax.swing.JTextField txtLabType;
    private javax.swing.JLabel txtPatientId1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
