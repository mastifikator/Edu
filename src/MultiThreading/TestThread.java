package MultiThreading;

public class TestThread {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
    }

    public static class MyThread extends Thread{

        public void run()
        {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello from myThread " + this.getId() + " " + i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
    }
}
