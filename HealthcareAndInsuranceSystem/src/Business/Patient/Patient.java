/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author priyankachaudhari
 */
public class Patient {

    private String patientId;
    private String patientLastName;
    private String patientFirstName;
    private String patientSSN;
    private String patientAge;
    private String contactNumber;
    private String patientAddress;
    private String patientGender;
    private boolean isTreatmentFinished;
    private String appointmentDate;
    private String patientEmail;
    private InsuranceCustomer insuranceCustomer;

    public String getPatientLastName() {
        return patientLastName;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public void setPatientSSN(String patientSSN) {
        this.patientSSN = patientSSN;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public InsuranceCustomer getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientSSN() {
        return patientSSN;
    }

    @Override
    public String toString() {
        return String.valueOf(patientId);
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public boolean isIsTreatmentFinished() {
        return isTreatmentFinished;
    }

    public void setIsTreatmentFinished(boolean isTreatmentFinished) {
        this.isTreatmentFinished = isTreatmentFinished;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

}
