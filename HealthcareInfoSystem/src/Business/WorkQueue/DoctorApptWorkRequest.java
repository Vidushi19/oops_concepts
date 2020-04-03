/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;

/**
 *
 * @author prabhpreetsingh
 */
public class DoctorApptWorkRequest extends WorkRequest{
    
    private String appointmentRequest;
//    private Patient patient;

    public String getAppointmentRequest() {
        return appointmentRequest;
    }

    public void setAppointmentRequest(String appointmentRequest) {
        this.appointmentRequest = appointmentRequest;
    }
    

}
