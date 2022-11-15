import java.util.*;

class Even implements Runnable {
    public int x;
    public Even(int x) {
        this.x = x;
    }
    public void run() {
        System.out.println(x + " is even: " + x * x);
    }
}

class Odd implements Runnable {
    public int x;
    public Odd(int x) {
        this.x = x;
    }
    public void run() {
        System.out.println(x + " is odd: " + x * x * x);
    }
}

class Dinesh extends Thread {
    public void run() {
        int num = 0;
        Random r = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                num = r.nextInt(100);
                System.out.println(num);

                if (num % 2 == 0) {
                    Thread t = new Thread(new Even(num));
                    t.start();
                } else {
                    Thread t = new Thread(new Odd(num));
                    t.start();
                }

                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Dinesh foo = new Dinesh();
        foo.run();
    }

}

