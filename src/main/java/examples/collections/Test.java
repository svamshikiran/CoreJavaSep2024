package examples.collections;

import examples.interfaces.BankInterface;
import examples.oops.Calculator;

public class Test {
    public static void main(String[] args) {
        Calculator calobj = new Calculator();
        BankInterface.printStatement();
    }
}
