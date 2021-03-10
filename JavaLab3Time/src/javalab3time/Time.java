/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab3time;

/**
 *
 * @author HP
 */
public class Time {
    int hrs, mins, secs;
    
    Time () {
        hrs = 1;
        mins = 1;
        secs = 1;
        displayTime();
    }
    
    Time (int x, int y, int z) {
        hrs = x;
        mins = y;
        secs = z;
        System.out.println("Current time is: ");
        displayTime();
    }
    
    void setDefaultData() {
        hrs = 1;
        mins = 1;
        secs = 1;
    }
    
    void setData (int query, int tempTime) {
        switch(query) {
            case 1:
                hrs = tempTime;
            case 2:
                mins = tempTime;
            case 3:
                secs = tempTime;
        }   
    }
    
    void displayTime () {
        System.out.println("Time is now " + hrs + " hours, " + mins + " minutes, " + secs + " seconds.");
    }
}