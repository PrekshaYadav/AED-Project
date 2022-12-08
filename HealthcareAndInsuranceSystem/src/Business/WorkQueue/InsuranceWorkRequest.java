/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author Sumit
 */
public class InsuranceWorkRequest extends WorkRequest {

    private String policyNumber;
    private String custSSN;
    private String policyName;
    private String incCompany;
    private double claimAmount;
    private String bokerName;
    private String financeManagerName;
    private double billAmount;
    private InsuranceCustomer insuranceCustomer;
    private String healthCenter;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(String custSSN) {
        this.custSSN = custSSN;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyType) {
        this.policyName = policyType;
    }

    public String getIncCompany() {
        return incCompany;
    }

    public void setIncCompany(String incCompany) {
        this.incCompany = incCompany;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    @Override
    public String toString() {
        return policyNumber;
    }

    public String getBokerName() {
        return bokerName;
    }

    public void setBokerName(String bokerName) {
        this.bokerName = bokerName;
    }

    public String getFinanceManagerName() {
        return financeManagerName;
    }

    public void setFinanceManagerName(String financeManagerName) {
        this.financeManagerName = financeManagerName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public InsuranceCustomer getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getHealthCenter() {
        return healthCenter;
    }

    public void setHealthCenter(String healthCenter) {
        this.healthCenter = healthCenter;
    }

}
