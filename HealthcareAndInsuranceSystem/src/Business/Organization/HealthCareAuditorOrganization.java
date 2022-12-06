/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovernmentHealthAuditorRole;
import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumit
 */
public class HealthCareAuditorOrganization extends Organization {

    public HealthCareAuditorOrganization() {
        super(Organization.Type.HealthcareAuditor.getValue());
    }

    /**
     * Returns list of all supported role belonging to Health Care Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentHealthAuditorRole());
        return roles;
    }

}
