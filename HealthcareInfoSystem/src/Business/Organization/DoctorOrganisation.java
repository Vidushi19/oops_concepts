/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Doctor;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author prabhpreetsingh
 */

public class DoctorOrganisation extends Organisation{
    public DoctorOrganisation(){
        super(Organisation.Type.DoctorOrganization.getValue());
        }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
}