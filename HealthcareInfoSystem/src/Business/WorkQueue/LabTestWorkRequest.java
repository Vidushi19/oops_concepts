/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author prabhpreetsingh
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String labTestRequest;
    private String patient;

    public String getLabTestRequest() {
        return labTestRequest;
    }

    public void setLabTestRequest(String labTestRequest) {
        this.labTestRequest = labTestRequest;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }
    
    
}
