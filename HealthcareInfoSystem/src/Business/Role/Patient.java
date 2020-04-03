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
import Business.Organization.PatientOrganisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.PatientRole.PatientWorkAreaPanel;
/**
 *
 * @author Mrinal
 */
public class Patient extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new PatientWorkAreaPanel(userProcessContainer, business, organization, enterprise, account, network); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return "Patient";
    }
}
