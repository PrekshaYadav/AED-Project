/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;


public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    /**
     * Accepts enterprise name and type and returns new Enterprise object.
     *
     * @param name
     * @param type
     * @return Enterprise object
     */
    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.HealthCenter) {
            enterprise = new HealthCenterEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Government) {
            enterprise = new GovernmentEnterprise(name);
            enterpriseList.add(enterprise);

        } else if (type == Enterprise.EnterpriseType.InsuranceCompany) {
            enterprise = new InsuranceEnterprise(name);
            enterpriseList.add(enterprise);

        } else if (type == Enterprise.EnterpriseType.Pharmacy) {
            enterprise = new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
