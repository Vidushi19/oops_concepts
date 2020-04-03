/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
/**
 *
 * @author Mrinal
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        Agent("Agent"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Patient("Patient"),
        Pharmacist("Pharmacist");
        
        
        private String value;
        private RoleType(String value){
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
            Organisation organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
