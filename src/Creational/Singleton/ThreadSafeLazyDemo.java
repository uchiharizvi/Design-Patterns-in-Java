package Creational.Singleton;

public class ThreadSafeLazyDemo {
    private static ThreadSafeLazyDemo object;

    private ThreadSafeLazyDemo() {
    }

    // Only one thread can execute this at a time
    public static synchronized ThreadSafeLazyDemo getInstance() {
        if (object == null) object = new ThreadSafeLazyDemo();
        return object;
    }
}
