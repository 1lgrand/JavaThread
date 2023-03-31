class conta{
    public static void main(String args[]){
        P T1=new P('A');
        P T2=new P('B');
        T1.start(); T2.start();
    }//fine main
}//fine classe

class P extends Thread{
    char ch;
    int i=1,j=100;//inizializzazione delle variabili
    public P(char c){ ch=c; }// costruttore
    public void run(){
        if(ch=='A')
            while(true) {
                System.out.println(i);
                i++;
                try{this.sleep(500);}catch(InterruptedException e){}
                if(i>10) this.interrupt();//terminazione
            }//fine while
        else while(true) {
            System.out.println(" "+j);
            j--;
            try{this.sleep(500);}catch(InterruptedException e){}
            if(j<50)
                interrupt();//terminazione
        }
    }//fine run
}//fine classe P

