package MultiThreading;

public class TestRunnable {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("1");
        Thread thread1 = new Thread(myThread1);

        MyThread myThread2 = new MyThread("2");
        Thread thread2 = new Thread(myThread2);

        try {
            thread1.start();
            thread1.join();
            thread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static class MyThread implements Runnable{

        private String name;

        public MyThread(String name) {
            this.name = name;
        }


        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello from myThread " + this.name + " " + i);
            }
        }
    }

}
