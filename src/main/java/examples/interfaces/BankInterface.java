package examples.interfaces;

public interface BankInterface {

    public static final double BASE_RATE_OF_INTEREST = 14.2;

    public String createAccount();

    public double getAccountBalance(String accountNumber);

    default void loanAccount(){
        System.out.println("DEFAULT IMPLEMENTATION");
    }

    static void printStatement(){
        System.out.println("PRINTING STATEMENT");
    }

}
