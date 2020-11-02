/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import checkinput.CheckUserINput;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import object.Doctor;

/**
 *
 * @author Admin
 */
public class Information {
    CheckUserINput check  = new CheckUserINput();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public  int enterID(ArrayList<Doctor> list){
        if(list.size() == 0){
            return 1;
        } else {
            return (list.size() + 1);
        }
    }
    public String enterName(){
        String str;
        while (true) {            
            try {
                System.out.print("Enter doctor name:");
                str = br.readLine();
                if(!check.checkNameLenght(str, 50)){
                    throw new Exception();
                }
                return str;
            } catch (Exception e) {
                System.out.println("Name is a string which is not longer than 50 characters.");
            }
        }
    }
    public Date enterDob(){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dob;
        while (true) {            
            try {
                System.out.print("Enter doctor dob:");
                String date = br.readLine();
                if(!check.validateJavaDate(date)){
                    throw new Exception();
                }
                dob = df.parse(date);
                return dob;
            } catch (Exception e) {
                System.out.println("Date of birth is a string which conforms “dd/MM/yyyy” format.");
            }
        }
    }
    public String enterSpecialization() {
        String spec;
        while (true) {
            try {
                System.out.print("Input doctor specialization: ");
                spec = br.readLine();

                if (!check.checkSpecialization(spec)) {
                    throw new Exception();
                }
                return spec;
            } catch (Exception e) {
                System.out.println("Specialization is a string which is not longer than 255 characters.");
            }
        }
    }
    public int enterInt(int min, int max) {
        int num;
        while (true) {
            try {

                num = Integer.parseInt(br.readLine());
                if (num < min || num > max) {
                    throw new NumberFormatException();
                }
                return num;
            } catch (Exception e) {
                System.out.println("Wrong input!!!!");
            }
        }
    }
    public int getAvailability() {

        System.out.println("Choose the Availability: ");
        System.out.println("0.In vacation");
        System.out.println("1.Available");
        System.out.println("2.Busy in emergency");
        System.out.println("3.Diagnosing");
        System.out.print("Choose availability: ");
        return enterInt(0, 3);
    }
    
    public String enterEmail() {
        String email;
        while (true) {
            try {
                System.out.print("Enter doctor email: ");
                email = br.readLine();
                if (!check.isEmail(email)) {
                    throw new Exception();
                }
                return email;
            } catch (Exception e) {
                System.out.println("Wrong email !!!!");
            }
        }
    }
    public String enterPhoneNumber() {
        String phone;
        while (true) {
            try {
                System.out.print("Enter doctor phone number: ");
                phone = br.readLine();
                if (!check.isPhoneNumber(phone)) {
                    throw new Exception();
                }
                return phone;
            } catch (Exception e) {
                System.out.println("Mobile is a string of number conforming (000)-000-0000 format.");
            }
        }
    }
}
