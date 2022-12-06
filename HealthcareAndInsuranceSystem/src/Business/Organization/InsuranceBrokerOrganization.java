/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsuranceBrokerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumit
 */
public class InsuranceBrokerOrganization extends Organization {

    public InsuranceBrokerOrganization() {
        super(Organization.Type.InsuranceBroker.getValue());
    }

    /**
     * Returns list of all supported role belonging to Insurance Broker
     * Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceBrokerRole());
        return roles;
    }

}
