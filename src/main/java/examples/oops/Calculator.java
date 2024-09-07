package examples.oops;

public class Calculator {
    //Instance Or Class Variables
    double firstNumber;
    double secondNumber;
    //Constructor Overloading

    static final double VALUE_OF_PI = 3.14; //Memory allocation will happen only once
    //Memory allocation will happen at the time of class loading
    public Calculator() {
        System.out.println("CALCULATOR - INSIDE CONSTRUCTOR");
        this.firstNumber = 25;
        this.secondNumber = 18;
    }

    public Calculator(double first, double second) {
        System.out.println("CALCULATOR - INSIDE PARAMETERISED CONSTRUCTOR");
        this.firstNumber = first;
        this.secondNumber = second;
    }

    //methods - behavior of the class
    // Overloading - occurs in the same class
    // method signature are different
    public double add(){
        return firstNumber + secondNumber; // Mathematical addition
    }
    public double add(double thirdNumber){
        return firstNumber + secondNumber + thirdNumber;
    }
    public double multiply(){
        return firstNumber * secondNumber;
    }
    public double subtract(){
        return firstNumber - secondNumber;
    }
    public double divide(){
        return firstNumber / secondNumber;
    }
    //public abstract double percentage();
}

//ACCESS SPECIFIERs - public
// private
// protected
