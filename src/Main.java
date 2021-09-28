/*class myThread extends Thread{

    public void run() {
        //yapılacak işler
    }
}*/

public class Main {

    static int i, j;

    public static void main(String[] args) {
        //Thread kullanımı

        Thread t1 = new Thread() {
            public void run() {
                for (i = 0; i < 70; i++) {
                    System.out.print("T1- ");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (j = 0; j < 70; j++) {
                    System.out.print("T2- ");
                }
            }
        };

        t1.start();
        t2.start();
    }
}

