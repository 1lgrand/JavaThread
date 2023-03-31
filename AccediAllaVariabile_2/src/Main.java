/* Questo programma crea una variabile X, crea 5 thread e li esegue N volte, ogni thread deve accedere alla variabile
 * incrementarla di 1 e fermarsi.
 *
 * */

import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int i,j;

        System.out.println("Quante volte vuoi far ciclare l'array ");
        int nVolte = in.nextInt();

        myThread[] threadArray = new myThread[5];


        for (i=0;i<5*nVolte;i++){
            threadArray[i] = new myThread(String.valueOf(i));
        }

        for (i=0;i<nVolte;i++){
            for (j=0;j<5;j++){
                threadArray[j].start();
            }
        }


    }
}