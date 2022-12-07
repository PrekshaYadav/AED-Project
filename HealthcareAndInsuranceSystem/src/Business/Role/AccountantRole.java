/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AccountantOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HealthcareAccountantRole.AccountantWorkAreaJPanel;

/**
 *
 * @author Sumit
 */
public class AccountantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem,DB4OUtil dB4OUtil) {
        return new AccountantWorkAreaJPanel(userProcessContainer, account, (AccountantOrganization) organization, enterprise, ecosystem,dB4OUtil);
    }

}
