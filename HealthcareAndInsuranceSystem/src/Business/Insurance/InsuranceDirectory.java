/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;



import java.util.ArrayList;
import java.util.List;

public class InsuranceDirectory {

    private ArrayList<Insurance> policies = new ArrayList<>();

    public ArrayList<Insurance> getPolicies() {
        return policies;
    }

    public void setPolicies(ArrayList<Insurance> policies) {
        this.policies = policies;
    }
    
}
