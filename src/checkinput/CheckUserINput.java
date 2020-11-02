/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkinput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class CheckUserINput {

    //check if field input is empty
    public boolean isFieldEmpty(String str) {
        return str.isEmpty();
    }

    //check if field input is digit 
    public boolean isDigit(String str) {
        return str.matches("^[\\-0-9]+$");
    }
    
    public boolean isEmail(String str) {
        return str.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }
    
    public boolean isPhoneNumber(String str) {
        return str.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}");
    }
    
    //check if the number is positive
    public boolean isPositiveNum(int num) {
        return num > 0;
    }

    //check if the number is in range
    public boolean checkNameLenght(String str, int max) {
        return str.length() < max;
    }

    public boolean validateJavaDate(String str) {
        SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
        sdfrmt.setLenient(false);
        try {
            Date javaDate = sdfrmt.parse(str);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
    public boolean checkSpecialization(String str){
        return !(str.length() < 0 || str.length() > 255);
    }
    
    public boolean isCodeExist(int arr[], int i) {
        for (int n : arr) {
            if (n == i) {
                return true;
            }
        }
        return false;
    }
}
