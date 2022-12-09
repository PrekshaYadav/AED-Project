/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Patient("Patient"),
        Accountant("Accountant"),
        InsuranceBroker("Insurance Broker"),
        InsuranceArchitect("Insurance Architect"),
        InsuranceFinanceManager("Insurance Finance Manager"),
        GovernmentHealthAuditor("Government Health Officer"),
        GovernmentTreasurer("Government Treasure"),
        GovernmentSecretaries("Government Secretaries"),
        Pharmacist("Pharmacist"),
        DeliveryMan("DeliveryMan");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem ecosystem,
            DB4OUtil dB4OUtil);

    @Override
    public String toString() {
        
        String role="";
        if(this.getClass().getName().contains("Admin"))
            role+="Admin";
        else if(this.getClass().getName().contains("Doctor"))
            role+="Doctor";
        else if(this.getClass().getName().contains("LabAssistant"))
            role+="LabAssistant";
        else if(this.getClass().getName().contains("Accountant"))
            role+="Accountant";
        else if(this.getClass().getName().contains("InsuranceBroker"))
            role+="InsuranceBroker";
        else if(this.getClass().getName().contains("InsuranceArchitect"))
            role+="InsuranceArchitect";
        else if(this.getClass().getName().contains("InsuranceFinanceManager"))
            role+="InsuranceFinanceManager";
        else if(this.getClass().getName().contains("GovernmentHealthAuditor"))
            role+="GovernmentHealthAuditor";
        else if(this.getClass().getName().contains("GovernmentTreasurer"))
            role+="GovernmentTreasurer";
        else if(this.getClass().getName().contains("GovernmentSecretaries"))
            role+="GovernmentSecretaries";
        else if(this.getClass().getName().contains("Pharmacist"))
            role+="Pharmacist";
        else if(this.getClass().getName().contains("DeliveryMan"))
            role+="DeliveryMan";
        
        return role;
    }

}
