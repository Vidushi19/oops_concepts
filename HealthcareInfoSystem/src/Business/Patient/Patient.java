/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.Date;

/**
 *
 * @author Vidushi
 */
public class Patient {
    private String name;
    private String id;
//    private String disease;
    private Date dateOfBirth;
    private String address;
    private String contactNo;
    private String email;
    private String gender;
    private static int count = 100;
    
    public Patient(){
        count++;
        id = "P"+count;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

//    public String getDisease() {
//        return disease;
//    }
//
//    public void setDisease(String disease) {
//        this.disease = disease;
//    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }
    @Override
    public String toString() {
        return name;
    }
}
