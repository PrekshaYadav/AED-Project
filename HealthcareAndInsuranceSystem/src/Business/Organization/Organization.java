/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


public abstract class Organization {

    public String organizationName;
    public WorkQueue workQueue;
    public EmployeeDirectory employeeDirectory;
    public UserAccountDirectory userAccountDirectory;
    public int organizationID;
    public static int counter = 0;

    public enum Type {

        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        TestingLab("Testing Lab Organization"),
        Patient("Patient Organization"),
        Accountant("Accountant Organization"),
        InsuranceBroker("Insurance Broker Organization"),
        InsuranceArchitect("Insurance Architect Organization"),
        InsuranceFinanceTeamOrganization("Insurance Finance Team Organization"),
        GovernmentTreasurer("Treasurer Organization"),
        GovernmentSecretary("Secretary Organization"),
        Pharmacist("Phamacist Organization"),
        DeliveryMan("Delivery Organization"),
        HealthcareAuditor("Healthcare Auditor Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.organizationName = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.organizationName = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return organizationName;
    }

}
