/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import checkinput.CheckUserINput;
import java.util.ArrayList;
import java.util.Scanner;
import object.Doctor;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Doctor> list = new ArrayList<>();
        Function f = new Function();
        while (true) {            
            f.run(list);
        }
    }
}
