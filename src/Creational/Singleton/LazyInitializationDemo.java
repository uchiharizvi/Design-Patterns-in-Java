package Creational.Singleton;

public class LazyInitializationDemo {
    private static LazyInitializationDemo object;

    private LazyInitializationDemo() {
    }

    public static LazyInitializationDemo getInstance() {
        if (object == null) object = new LazyInitializationDemo();
        return object;
    }
}
