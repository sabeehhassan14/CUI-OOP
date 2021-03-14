package lab3marks;

import java.util.Scanner;

public class Runner { 
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int query;
        
        Marks Group1 = new Marks();
        System.out.println("Would you like to change marks for any student? Enter 0 for no");
        query = userIn.nextInt();
        while(true) {
            if (query == 0) {break;}
            System.out.println("Input student number (1,2,3), press enter, then input marks");
            Group1.setData(userIn.nextInt(),userIn.nextDouble());
            System.out.println("Would you like to change marks for any other student? Enter 0 for no");
            query = userIn.nextInt();
        }
        Group1.calcSum();
    }
}


