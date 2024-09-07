package examples.threads;

public class MainThread {
    public static void main(String[] args) {
        ThreadOne th1 = new ThreadOne();
        ThreadTwo th2 = new ThreadTwo();
        th1.start();
        th2.start();
        for(int i=100; i<110; i++){
            System.out.println("MAIN THREAD: "+i);
            try {
                Thread.sleep(10000);
            }catch(InterruptedException iex){
                System.out.println("EXCEPTION RAISED");
            }
        }
    }
}
