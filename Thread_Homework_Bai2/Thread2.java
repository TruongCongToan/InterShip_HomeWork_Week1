package Thread_Homework_Bai2;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Thread2 extends Thread{
    Data data;

    public Thread2(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(data.status == false){
            synchronized(data){
                data.notifyAll();
                while(data.activityStatus != 2 && data.status == false){
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(data.status == true) break;
                int n = data.getNumber();
                System.out.print("Thread 2: " + n + " = ");
                for (int i = 1; i <= n; i++) {
                    if(i == 1){
                        System.out.print("1");
                        continue;
                    }
                    if(n % i == 0) System.out.print(", " + i);
                }
                System.out.println("");
                data.activityStatus = 1;
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    } 
}
