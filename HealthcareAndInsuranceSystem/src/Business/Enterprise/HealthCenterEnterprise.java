/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;


public class HealthCenterEnterprise extends Enterprise {

    private PatientDirectory patientDirectory;

    public HealthCenterEnterprise(String name) {
        super(name, EnterpriseType.HealthCenter);
        patientDirectory = new PatientDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /**
     * Returns list of all organizations belonging to HealthCenter Enterprise.
     * @return List of organization types
     */
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Doctor);
        orgTypes.add(Organization.Type.TestingLab);
        orgTypes.add(Organization.Type.Accountant);

        return orgTypes;

    }

    @Override
    public String toString() {
        return this.getName();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

}
