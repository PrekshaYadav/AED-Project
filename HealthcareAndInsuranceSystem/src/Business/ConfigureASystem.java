/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;


public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem ecosystem = EcoSystem.getInstance();
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return ecosystem;
    }

}
