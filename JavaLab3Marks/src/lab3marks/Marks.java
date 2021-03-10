package lab3marks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Marks {
    double marks1, marks2, marks3;
    
    Marks () {
        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
    }
    
    Marks (int x, int y, int z) {
        marks1 = x;
        marks2 = y;
        marks3 = z;
    }
    
    void setDefaultData () {
        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
        System.out.println("All 3 students currently have 0 marks.");
    }
    
    void setData (int query, double tempMarks) {
        switch(query) {
            case 1:
                marks1 = tempMarks;
            case 2:
                marks2 = tempMarks;
            case 3:
                marks3 = tempMarks;
        }   
    }
    void calcSum () {
        double sum = marks1 + marks2 + marks3;
    }
    
}