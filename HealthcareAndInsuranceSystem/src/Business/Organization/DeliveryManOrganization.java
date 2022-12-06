/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Delivery.DeliveryManDirectory;
import Business.Role.DeliveryManRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumit
 */
public class DeliveryManOrganization extends Organization{
    
    private DeliveryManDirectory deliveryManDirectory;

    public DeliveryManOrganization() {
        super(Organization.Type.DeliveryMan.getValue());
    }
    
    /**
     * Returns list of all supported role belonging to DeliveryMan Organization.
     *
     * @return List of roles
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryManRole());
        return roles;
    }
    
}
