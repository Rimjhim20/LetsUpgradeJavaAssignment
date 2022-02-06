//James Gosling - Father of ja🧛 
//Cab Fare System Project.

// Java follows OOP methodology
// OOP - Object Oriented Program

// C- Program to print a text
// Prog.c -> gcc Prog.c -> a.out
// ./a.out
// #include <stdio.h>
// void main()
// {
//     printf("Hello Coders");
// }

//Prog.java -> javac Prog.java -> Test.class
// Test.class: class file or byte code
// java Test <= to execute the java program
/*
class Test {
    public static void main(String[] args) {
        System.out.print("Hello Coders");
    }

    public void show() {
    }
}
*/

// OOP
// Samsung M70 - features are out
//To take selfie you need actual phone

// Set of features of phone -> Class
// Actual Phone -> Object
// objects enable us to use features of a class

//OOP methodology
// call() : functionality(known as method)
// Camera MP: 48mp - known as data members

// class Test {
//     int x; //data member
//     // Method member
//     void show() {
//         System.out.print("Data: " + x);
//     }
// }

// //Driver Class
// class TestDrive {
//     public static void main(String[] args) {
//         Test ob = new Test(); //Create object of Test
//         ob.x = 20;
//         ob.show();
//     }
// }

// Package consist of sub-packages and class files
// packages - lang, util, sql, io, awt etc
// lang is the default package

// String, System - present in lang package, can be used directly

// Scanner - present in util package, cannot be used directly - as util is not default package

// nextInt() - method of Scanner class - takes integer input
// nextLine() - takes entire line as input
// nextFloat() - takes a floating point number as input

// Test ob = new Test();
// Scanner sc = new Scanner(); - to do this you have to import Scanner class from util package

// ob.x = sc.nextInt()

// import java.util.Scanner;
// class Test {
//     int x;
// }

// public class TestDrive {
//     public static void main(String args[]) {
//         Test ob = new Test();
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number:" );
//         ob.x = sc.nextInt(); //Input
        
//         System.out.print("Data: " + ob.x);
//     }
// }

// Constructor

// Class Test
// Test ob = new Test(); // create object of class

// It takes help of constructor to create object

// new Test() -> creates object by implcitly/automatically invoking/calling the constructor

// Constructor - creates the object
// It is a method whose name is same as class name and has no return type
// Tasks of constructor:
// 1) create object
// 2) Initialize the object - assigning with some initial value

/*
class Test {
    int x; //non-static variable
    static int y; //static variable
    
    //default constructor
    Test() {
        
    }
    
    // parametrized constructor
    Test(int a) {
        
    }
}
*/

// new Test() -> calls the default constructor Test()
// new Test(15) -> calls the parametrized constructor

// Test ob -> reference variable

// Test ob = new Test()
// Test ob1 = ob

// ob & ob1 are reference variables, here they refer to the same object

// Scanner sc = new Scanner(System.in) -> will invoke param constructor

// If a member is static -> you can accesss it by class name
// "in" is a static member of System class, hence can be accessed by writing "System.in"
// Static member of a class can be accessed by the class name

//Example:
// class Test {
//     int x;
//     static int y;
// }

// public class TestDrive {
//     public static void main(String args[]) {
//         Test ob = new Test();
//         ob.x = 10;
//         Test.y = 20;
        
//         System.out.print("Data: " + ob.x + Test.y);
//     }
// }

// Static variables are known as Class Variables
// Non -Static variables are called as Object/instance variable

// class Test {
//     int x;
//     static int y;
// }

// public class TestDrive {
//     public static void main(String args[]) {
//         Test ob1 = new Test();
//         Test ob2 = new Test();
//         ob1.x = 10;
//         ob2.x = 20;
        
//         ob1.y = 30; // Test.y = 30
//         ob2.y = 40; // Test.y = 40
        
//         System.out.print("Data: " + ob1.x + ob2.x + ob1.y + ob2.y);
//     }
// }

// Cab Fare System

import java.util.Scanner;
class Cab {
    int fare;

    Cab() {
        fare = 40;
    }
    
    Cab(int amt) {
        fare = amt;
    }
    
    void showFare() {
        System.out.print("Fare Amount: " + fare);
    }
}

class RideCab {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int d; // distance travelled by user
        int pickup_d;

        System.out.print("Enter the distance of cab from the user(in km): ");
        pickup_d = sc.nextInt();

        System.out.print("Enter the travel distance(in km): ");
        d = sc.nextInt();

        if(pickup_d <= 5)
        {
            Cab id = new Cab();

            id.fare += 12 * d;
            id.showFare();
        
        }
        else {
            Cab id = new Cab(40 + (pickup_d - 5) * 10);

            id.fare += 12 * d;
            id.showFare();
        }

    }
}