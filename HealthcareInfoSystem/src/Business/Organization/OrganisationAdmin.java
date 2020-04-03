/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Admin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vidushi
 */
public class OrganisationAdmin extends Organisation{
    public OrganisationAdmin() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Admin());
        return roles;
    }
}
