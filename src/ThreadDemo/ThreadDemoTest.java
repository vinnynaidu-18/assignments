package ThreadDemo;

public class ThreadDemoTest {
    public static void main(String[]args){
        Thread thread1=Thread.currentThread();
        Thread.currentThread().setName("Test");

        String threadName=Thread.currentThread() .getName();
        System.out.println(thread1.getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread countThread=new NumberCountThread();
        countThread.setName("CountThread-1");
        countThread.setPriority(1);
        countThread.start();

        Thread countThread2=new NumberCountThread();
        countThread2.setName("CountThread-2");
        countThread.setPriority(5);
        countThread2.start();


        Thread countThread3=new NumberCountThread();
        countThread3.setName("CountThread-3");
        countThread.setPriority(10);
        countThread3.start();
    }
}
