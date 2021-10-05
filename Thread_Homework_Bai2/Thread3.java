package Thread_Homework_Bai2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread3 extends Thread{
    Data data;

    public Thread3(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        while(data.status == false){
            synchronized(data){
                data.notifyAll();
                while(data.activityStatus != 3 && data.status == false){
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(data.status == true) break;
                int n = data.getNumber();
                System.out.println("Thread 3: " + n*n);
                data.activityStatus = 1;
            }
        }
        synchronized(data){
            data.notifyAll();
        }
    }
}
