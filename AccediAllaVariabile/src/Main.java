/* Questo programma crea una variabile X, crea N thread e li esegue, ogni thread deve accedere alla variabile
* incrementarla di 1 e fermarsi.
*
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int i;

        System.out.println("Quanti thread vuoi creare? ");
        int nThread = in.nextInt();

        for (i=0;i<nThread;i++){
            Thread t = new myThread(String.valueOf(i)); //Converte i (Un numero) in stringa, per il nome
            t.start();
            //t.join();
        }
    }
}