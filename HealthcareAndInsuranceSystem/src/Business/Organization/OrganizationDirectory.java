/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;
import static Business.Organization.Organization.Type.InsuranceFinanceTeamOrganization;

/**
 *
 * @author Sumit
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return organizationList;
    }

    /**
     * Accepts the organization type as input and returns new Organization
     * object of the same type.
     *
     * @param type
     * @return
     */
    public Organization createOrganization(Type type) {
        Organization organization = null;

        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.TestingLab.getValue())) {
            organization = new TestingLabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Patient.getValue())) {
            organization = new PatientOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(Type.Accountant.getValue())) {
            organization = new AccountantOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(Type.HealthcareAuditor.getValue())) {
            organization = new HealthCareAuditorOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(Type.GovernmentSecretary.getValue())) {
            organization = new GovernmentSecretaryOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(Type.GovernmentTreasurer.getValue())) {
            organization = new GovernmentTreasurerOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(Type.InsuranceBroker.getValue())) {
            organization = new InsuranceBrokerOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(Type.InsuranceFinanceTeamOrganization.getValue())) {
            organization = new InsuranceFinanceTeamOrganization();
            organizationList.add(organization);

        } else if (type.getValue().equals(Type.InsuranceArchitect.getValue())) {
            organization = new InsuranceArchitectOrganization();
            organizationList.add(organization);

        }else if (type.getValue().equals(Type.Pharmacist.getValue())) {
            organization = new PharmacistOrganization();
            organizationList.add(organization);

        }else if (type.getValue().equals(Type.DeliveryMan.getValue())) {
            organization = new DeliveryManOrganization();
            organizationList.add(organization);

        }

        return organization;
    }
}
