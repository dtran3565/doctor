/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Doctor implements Comparable<Doctor>{
    private int id, availability;
    private String name, spec, email, phone;
    private Date dob;
    
    public Doctor() {
    }

    public Doctor(int id, int availability, String name, String spec, String email, String phone, Date dob) {
        this.id = id;
        this.availability = availability;
        this.name = name;
        this.spec = spec;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Doctor{" + "id=" + id + ", availability=" + availability + ", name=" + name + ", dob=" + sdf.format(dob) + ", spec=" + spec + ", email=" + email + ", phone=" + phone + '}';
    }
    @Override
    public int compareTo(Doctor o) {
       return this.getDob().compareTo(o.getDob());
    }
}
