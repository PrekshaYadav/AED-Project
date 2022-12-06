/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsuranceFinanceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumit
 */
public class InsuranceFinanceTeamOrganization extends Organization {

    public InsuranceFinanceTeamOrganization() {
        super(Organization.Type.InsuranceFinanceTeamOrganization.getValue());
    }

    /**
     * Returns list of all supported role belonging to Insurance Finance Team
     * Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceFinanceManagerRole());
        return roles;
    }

}
