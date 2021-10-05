package Thread_HomeWork_Bai1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ghifile {
    public static void main(String[] args) {
        Random random = new Random();
        int n;
        while(true){
            if((n = random.nextInt(101)) >= 10) break;
        }
        FileOutputStream fos = null;
        try {
        	//tao file number.txt
            fos = new FileOutputStream("number.txt");
            String a = "\n";
            byte[] b = Integer.toString(n).getBytes();
            fos.write(b);
            b = a.getBytes();
            fos.write(b);
            for (int i = 0; i < n; i++) {
                int c = random.nextInt(501);
                b = Integer.toString(c).getBytes();
                fos.write(b);
                b = a.getBytes();
                fos.write(b);
            }
            System.out.println("Successfully !");
        } catch (IOException ex) {
            //Logger.getLogger(Ghifile.class.getName()).log(Level.SEVERE, null, ex);
        	ex.printStackTrace();
        }
    }
}
