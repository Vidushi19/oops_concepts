/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Patient.PatientDirectory;
import Business.Role.Patient;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vidushi
 */
public class PatientOrganisation extends Organisation{
    private PatientDirectory patientDirectory;
    public PatientOrganisation(){
        super(Organisation.Type.PatientOrganization.getValue());
        patientDirectory = new PatientDirectory();
        }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Patient());
        return roles;
    }
}
