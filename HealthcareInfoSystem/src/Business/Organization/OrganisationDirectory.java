/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import java.util.ArrayList;

/**
 *
 * @author Vidushi
 */

public class OrganisationDirectory {
     private ArrayList<Organisation> organisationList;

    public OrganisationDirectory() {
        organisationList = new ArrayList();
    }

    public ArrayList<Organisation> getOrganizationList() {
        return organisationList;
    }
    
    public Organisation createOrganization(Organisation.Type type){
        Organisation organization = null;
        if (type.getValue().equals(Organisation.Type.PatientOrganization.getValue())){
            organization = new PatientOrganisation();
            organisationList.add(organization);
        }
        if (type.getValue().equals(Organisation.Type.DoctorOrganization.getValue())){
            organization = new DoctorOrganisation();
            organisationList.add(organization);
        }
        if (type.getValue().equals(Organisation.Type.LabOrganization.getValue())){
            organization = new LabOrganisation();
            organisationList.add(organization);
        }
        return organization;
    }
}
