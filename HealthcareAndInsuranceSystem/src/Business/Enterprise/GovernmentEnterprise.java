/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;


public class GovernmentEnterprise extends Enterprise {

    public GovernmentEnterprise(String name) {
        super(name, EnterpriseType.Government);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    /**
     * Returns list of all organizations belonging to Government Enterprise.
     * @return List of organization types
     */
    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.HealthcareAuditor);
        orgTypes.add(Organization.Type.GovernmentSecretary);
        orgTypes.add(Organization.Type.GovernmentTreasurer);

        return orgTypes;
    }

}
