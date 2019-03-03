package sandbox;

public class Threads {

    public static void main(String[] args) {

        Thread thread1=new Thread( new Greeter("Thread 1"));
        Thread thread2=new Thread( new Greeter("Thread 2"));

        thread1.start();
        thread2.start();



    }

}

class Greeter implements Runnable {
    String name;

    public Greeter(String name) {
        this.name = name;
    }


    public void run() {

        System.out.println("Hello from " + name);

    }
}







