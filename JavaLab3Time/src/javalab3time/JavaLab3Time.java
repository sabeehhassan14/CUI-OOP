/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab3time;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaLab3Time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int query;
        
        Time time1 = new Time();
        System.out.println("Would you like to change the time? Enter 0 for no");
        query = userIn.nextInt();
        while(query != 0) {
            int TempInt;
            
            for (int i = 0; i < 3; i++) {
                switch (i) {
                    case 0:
                        System.out.println("Enter time in hours: ");
                        while (true){
                            TempInt = userIn.nextInt();
                            if (TempInt >= 0 && TempInt <= 24){break;} else {System.out.println("Invalid value for hours.");}
                        }
                        time1.setData(1,TempInt);
                    case 1:
                        System.out.println("Enter time in minutes");
                        while (true){
                            TempInt = userIn.nextInt();
                            if (TempInt >= 0 && TempInt <= 59){break;} else {System.out.println("Invalid value for minutes.");}
                        }
                        time1.setData(1,TempInt);
                    case 2:
                        System.out.println("Enter time in seconds");
                        while (true){
                            TempInt = userIn.nextInt();
                            if (TempInt >= 0 && TempInt <= 59){break;} else {System.out.println("Invalid value for seconds.");}
                        }
                        time1.setData(1,TempInt);
                }
            }
            
            time1.displayTime();
        
            System.out.println("Would you like to change the time? Enter 0 for no");
            query = userIn.nextInt();
        }
    }
    
}
