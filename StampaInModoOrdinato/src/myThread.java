

public class myThread extends Thread{

    private String name;

    myThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("Il thread ["+ name + "] e' partito!");
    }

}
