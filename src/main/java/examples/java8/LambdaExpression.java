package examples.java8;

public class LambdaExpression {
    public static void main(String[] args) {

        AddInterface addInterface = (a,b) -> {
            System.out.println("ADD RESULT: "+(a+b));
        };

        AddInterface addInterfaceTwo = (a,b) -> {
            System.out.println("FIRST INPUT: "+a);
            System.out.println("SECOND INPUT: "+b);
            System.out.println("ADD RESULT: "+(a+b));
        };

        addInterface.add(5,6);
        addInterfaceTwo.add(4,7);

    }
}
