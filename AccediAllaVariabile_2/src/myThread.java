

public class myThread extends Thread{

    static int x = 0;
    private Integer lock = 0;
    private String name;

    myThread(String name){
        this.name = name;
    }

    @Override
    public synchronized void run(){

        synchronized (lock){
            x++;
            System.out.println("Thread ["+name+"] -> Valore variabile: ["+x+"]");
        }


    }

}
