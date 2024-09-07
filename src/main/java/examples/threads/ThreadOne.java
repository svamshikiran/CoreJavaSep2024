package examples.threads;

public class ThreadOne extends Thread{
    @Override
    public void run() {
        for(int i = 0; i< 10; i++) {
            System.out.println("THREAD ONE - " + i);
            try {
                Thread.sleep(3000);
            }catch(InterruptedException iex){
                System.out.println("EXCEPTION RAISED");
            }
        }
    }
}
