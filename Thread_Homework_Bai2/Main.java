package Thread_Homework_Bai2;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Thread1 t1 = new Thread1(data);
        Thread2 t2 = new Thread2(data);
        Thread3 t3 = new Thread3(data);
        t1.start();
        t2.start();
        t3.start();
    }
}