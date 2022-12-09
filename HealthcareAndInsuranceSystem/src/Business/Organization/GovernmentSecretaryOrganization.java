/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentSecretaries;
import Business.Role.Role;
import java.util.ArrayList;


public class GovernmentSecretaryOrganization extends Organization {

    public GovernmentSecretaryOrganization() {
        super(Organization.Type.GovernmentSecretary.getValue());
    }

    /**
     * Returns list of all supported role belonging to GovernmentSecretary Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentSecretaries());
        return roles;
    }

}
