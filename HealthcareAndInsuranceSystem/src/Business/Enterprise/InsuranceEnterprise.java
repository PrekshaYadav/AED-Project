/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Insurance.InsuranceDirectory;
import Business.InsuranceCustomer.InsuranceCustomerDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;


public class InsuranceEnterprise extends Enterprise {

    private InsuranceCustomerDirectory insuranceCustomerDirectory;

    private InsuranceDirectory insurancePolicyDirectory;

    public InsuranceEnterprise(String name) {
        super(name, EnterpriseType.InsuranceCompany);
        insuranceCustomerDirectory = new InsuranceCustomerDirectory();
        insurancePolicyDirectory = new InsuranceDirectory();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    /**
     * Returns list of all organizations belonging to Insurance Enterprise.
     *
     * @return List of organization types
     */
    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.InsuranceBroker);
        orgTypes.add(Organization.Type.InsuranceArchitect);
        orgTypes.add(Organization.Type.InsuranceFinanceTeamOrganization);

        return orgTypes;
    }

    public InsuranceCustomerDirectory getInsuranceCustomerDirectory() {
        return insuranceCustomerDirectory;
    }

    public void setInsuranceCustomerDirectory(InsuranceCustomerDirectory insuranceCustomerDirectory) {
        this.insuranceCustomerDirectory = insuranceCustomerDirectory;
    }

    public InsuranceDirectory getInsurancePolicyDirectory() {
        return insurancePolicyDirectory;
    }

    public void setInsurancePolicyDirectory(InsuranceDirectory insurancePolicyDirectory) {
        this.insurancePolicyDirectory = insurancePolicyDirectory;
    }

}
