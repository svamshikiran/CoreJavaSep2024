package examples.exception;

public class ExceptionDemo {
    public static void main(String[] args) throws MyOwnException {
        int first = 25, second =0;
        int result = first + second;
        System.out.println("ADD RESULT: "+result);
        try {
            result = first / second;
            System.out.println("DIVISION RESULT: " + result);
        }catch(Exception ex){
            System.out.println("EXCEPTION RAISED: "+ex.getLocalizedMessage());
            throw new MyOwnException("DIVIDE BY ZERO IS NOT APPLICABLE, HENCE AN EXCEPTION IS THROWN");
        }
        result = first * second;
        System.out.println("MULTIPLICATION RESULT: "+result);
    }
}
