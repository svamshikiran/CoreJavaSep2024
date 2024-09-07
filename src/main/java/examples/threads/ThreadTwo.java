package examples.threads;

public class ThreadTwo extends Thread{
    @Override
    public void run(){
        for(int i = 0; i< 20; i+=2) {
            System.out.println("THREAD TWO - " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException iex) {
                System.out.println("EXCEPTION RAISED");
            }
        }
    }
}
