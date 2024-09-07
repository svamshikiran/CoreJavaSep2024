package examples.java8;

@FunctionalInterface // Annotations - gives the information to the Java Container
public interface AddInterface {
    public void add(int a, int b);

    default void defaultMethod(){
        System.out.println("DEFAULT METHOD");
    }

    static void staticMethod(){
        System.out.println("STATIC METHOD");
    }
}
