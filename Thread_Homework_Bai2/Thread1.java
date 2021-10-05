package Thread_Homework_Bai2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread1 extends Thread{
	Data data;

    public Thread1(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        FileInputStream fis = null;
        InputStreamReader reader = null;
        BufferedReader bReader = null;
        try {
            fis = new FileInputStream("number.txt");
            reader = new InputStreamReader(fis);
            bReader = new BufferedReader(reader);
            String line;
            int check = 0;
            while((line = bReader.readLine()) != null){
                if(check == 0){
                    check++;
                    continue;
                }
                synchronized(data){
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    int n = Integer.parseInt(line);
                    if( n % 2 == 0) data.activityStatus = 2;
                    else data.activityStatus = 3;
                    System.out.println("Thread 1: " + n);
                    data.setNumber(n);
                    data.notifyAll();
                    try {
                        data.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            data.status= true;
            synchronized(data){
                data.notifyAll();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
