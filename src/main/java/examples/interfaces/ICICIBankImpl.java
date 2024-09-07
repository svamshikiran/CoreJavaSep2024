package examples.interfaces;

public class ICICIBankImpl implements BankInterface, AddressInterface{

    @Override
    public void addAddress(String address) {

    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public String createAccount() {
        return null;
    }

    @Override
    public double getAccountBalance(String accountNumber) {
        return 0;
    }

    @Override
    public void loanAccount() {

    }
}
