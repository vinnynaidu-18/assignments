package ThreadDemo;

public class NumberCountRunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("From NumberCountRunnableThread");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +
                    "  count" + i + "  Thread Priority " + Thread.currentThread().getPriority());
        }
    }
}