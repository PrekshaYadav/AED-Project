/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentTreasurer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumit
 */
public class GovernmentTreasurerOrganization extends Organization {

    public GovernmentTreasurerOrganization() {
        super(Organization.Type.GovernmentTreasurer.getValue());
    }

    /**
     * Returns list of all supported role belonging to GovernmentTreasurer Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentTreasurer());
        return roles;
    }

}
