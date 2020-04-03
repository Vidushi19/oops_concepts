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
import userInterface.AdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author Mrinal
 */
public class Admin extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, Network network,EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
//        return new JPanel();
    }
    @Override
    public String toString(){
        return "Admin";
    }
}
