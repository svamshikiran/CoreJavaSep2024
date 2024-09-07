package examples.oops;

public class AdvancedCalculator extends Calculator{
    double angle;
    public double sinValue(){
        return Math.sin(angle);
    }

    public AdvancedCalculator(double first, double second, double ang){
        super(first, second); // This will call the super class constructor
        System.out.println("ADVANCED CALCULATOR - PARAMETERIZED CONSTRUCTOR");
        this.angle = ang;
    }

    // Overriding - occurs in Super class and Sub class
    // method signature are same
    @Override  //Annotation
    public double divide(){
        if(secondNumber == 0){
            System.out.println("DIVISION BY ZERO IS NOT APPLICABLE, HENCE RETURNING 0");
            return 0;
        }
        return firstNumber/secondNumber;
    }
    public double percentage(){
        return 0;
    }
}
