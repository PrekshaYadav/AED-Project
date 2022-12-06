/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsuranceArchitectRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumit
 */
public class InsuranceArchitectOrganization extends Organization {

    public InsuranceArchitectOrganization() {
        super(Organization.Type.InsuranceArchitect.getValue());
    }

    /**
     * Returns list of all supported role belonging to Insurance Architect
     * Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceArchitectRole());
        return roles;
    }

}
