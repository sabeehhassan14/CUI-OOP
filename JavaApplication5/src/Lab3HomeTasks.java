
import java.util.Scanner;

class circle { 
    double radius;
    void setDefaultData () {
        radius = 1;
        System.out.println("Radius is " + radius);
    }
    void setData(double r) { 
        radius = r; 
    } 
     
    void circumference() { 
         double circumference = 2 * Math.PI * radius ; 
         System.out.println("circumference of circle is = " + circumference); 
    } 
}

class Account {
    double balance;
    void setDefaultData () {
        balance = 100;
    }
    void setData(double blnc) { 
        balance = blnc;
        System.out.println("Balance is " + balance);
    } 
    void withdraw (double amount) {
        balance = balance - amount;
        System.out.println("New balance after withdrawal is: " + balance);
    }
    void deposit (double amount) {
        balance = balance + amount;
        System.out.println("New balance after withdrawal is: " + balance);
    }
}

class Distance {
    double dFeet;
    double dInches;
    void setDefaultData () {
        dFeet = 1;
        dInches = 1;
        System.out.println("Distance is " + dFeet + " feet, " + dInches + " inches.");
    }
    void setData(double TempFeet, double TempInches) { 
        dFeet = TempFeet;
        dInches = TempInches;
        displayDistance();
    }   
    
    void displayDistance () {
        System.out.println("New distance is " + dFeet + " feet, " + dInches + " inches.");
    }
    
}

public class Lab3HomeTasks { 
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        
        circle mCircle1 = new circle();
        mCircle1.setDefaultData();
        System.out.println("Enter radius for circle");
        mCircle1.setData(userIn.nextDouble());
        mCircle1.circumference();
        
        
        Account mAccount1 = new Account();
        mAccount1.setDefaultData();
        System.out.println("Enter account balance");
        mAccount1.setData(userIn.nextDouble());
        System.out.println("Enter 1 to withdraw and 2 to deposit");
        int query = userIn.nextInt();
        switch (query) {
            case 1:
                System.out.println("Enter amount to withdraw");
                mAccount1.withdraw(userIn.nextDouble());
            case 2:
                System.out.println("Enter amount to deposit");
                mAccount1.deposit(userIn.nextDouble());
        }
        
        Distance mDist1 = new Distance();
        mDist1.setDefaultData();
        System.out.println("Input distance in feet, press enter, then input distance in inches");
        mDist1.setData(userIn.nextDouble(),userIn.nextDouble());
    } 
}


