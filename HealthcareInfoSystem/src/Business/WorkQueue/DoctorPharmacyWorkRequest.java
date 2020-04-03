/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;

/**
 *
 * @author Mrinal
 */
public class DoctorPharmacyWorkRequest extends WorkRequest{
    
     private String medicineRequest;
     private Patient patient;
     private String medicine;
     

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String getMedicineRequest() {
        return medicineRequest;
    }

    public void setMedicineRequest(String medicineRequest) {
        this.medicineRequest = medicineRequest;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
    
   
}
