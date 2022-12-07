/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.GovernmentTreasurerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.GovernmentTreasurerRole.GovernmentTreasurerWorkAreaJPanel;

/**
 *
 * @author Sumit
 */
public class GovernmentTreasurer extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business,DB4OUtil dB4OUtil) {
        return new GovernmentTreasurerWorkAreaJPanel(userProcessContainer, userAccount, (GovernmentTreasurerOrganization) organization, enterprise,dB4OUtil,business);
    }

}
