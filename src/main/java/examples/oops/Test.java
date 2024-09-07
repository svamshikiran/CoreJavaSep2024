package examples.oops;

import examples.interfaces.BankInterface;
import examples.java8.Student;

// JVM/JRE call Test.main() to execute the program
public class Test {
    public static void main(String[] args) {

        System.out.println("BASE RATE OF INTEREST: "+ BankInterface.BASE_RATE_OF_INTEREST);
        //RHS - Object Creation - Memory allocation in JVM
        //LHS - Object Name
        //LHS - Reference Class
        Calculator calcObj = new Calculator();

        double result = calcObj.add();

        System.out.println("ADD RESULT: "+result); // Combining the two values

        result = calcObj.add(24);

        System.out.println("ADD RESULT - THREE NUMBERS: "+result);

        result = calcObj.multiply();

        System.out.println("MULTIPLICATION RESULT: "+result);

        result = calcObj.divide();

        System.out.println("DIVISION RESULT: "+result);

        result = calcObj.subtract();

        System.out.println("SUBTRACT RESULT: "+result);

        Calculator calcObjTWO = new Calculator(56, 9);

        result = calcObjTWO.add();

        System.out.println("CALCULATOR OBJ TWO - ADD RESULT: "+result);

        System.out.println("***********ADVANCED CALCULATOR*************");

        AdvancedCalculator advancedCalculator = new AdvancedCalculator(54, 8, 30);

        result = advancedCalculator.add();

        System.out.println("ADD RESULT: "+result);

        result = advancedCalculator.multiply();

        System.out.println("MULTIPLICATION RESULT: "+result);

        result = advancedCalculator.divide();

        System.out.println("DIVISION RESULT: "+result);

        result = advancedCalculator.subtract();

        System.out.println("SUBTRACT RESULT: "+result);

        result = advancedCalculator.sinValue();

        System.out.println("SINE VALUE RESULT: "+result);


        System.out.println("VALUE OF PI IN CALC: "+Calculator.VALUE_OF_PI);
    }
}

// Principles of OOP -
    // Inheritance -
    // Data Abstraction
    // Data Encapsulation
    // Polymorphism - Overloading and Overriding
