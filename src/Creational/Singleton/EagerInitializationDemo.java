package Creational.Singleton;

public class EagerInitializationDemo {
    private static EagerInitializationDemo object = new EagerInitializationDemo();

    private EagerInitializationDemo() {
    }

    public static EagerInitializationDemo getInstance(){
        return object;
    }
}
