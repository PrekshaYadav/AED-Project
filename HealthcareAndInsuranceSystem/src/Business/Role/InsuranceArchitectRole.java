/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceArchitectOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InsuranceArchitectRole.InsuranceArchitectWorkAreaJPanel;

/**
 *
 * @author Sumit
 */
public class InsuranceArchitectRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new InsuranceArchitectWorkAreaJPanel(userProcessContainer, account, (InsuranceArchitectOrganization) organization, enterprise,dB4OUtil,business);
    }

}
