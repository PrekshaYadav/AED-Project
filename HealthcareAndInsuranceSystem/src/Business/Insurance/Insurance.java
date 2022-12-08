/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

/**
 *
 * @author priyankachaudhari
 */
public class Insurance {

    private String policyName;
    private String incCompany;
    private double coverage;
    private String policyTC;
    private double monthlyPremium;

    public Insurance(String policyName, String InsuranceCompany, double coverage) {
        this.policyName = policyName;
        this.incCompany = InsuranceCompany;
        this.coverage = coverage;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyType) {
        this.policyName = policyType;
    }

    public double getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(double monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }

    public String getIncCompany() {
        return incCompany;
    }

    public void setIncCompany(String incCompany) {
        this.incCompany = incCompany;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    public String getPolicyTC() {
        return policyTC;
    }

    public void setPolicyTC(String policyTC) {
        this.policyTC = policyTC;
    }

    @Override
    public String toString() {
        return policyName;
    }

}
