package Creational.AbstractFactory.Example01;

public class CarFactory {
    private CarFactory(){}
    public static Car buildCar(CarType type){
        Car car = null;
        Location location = Location.INDIA;
        switch (location){
            case USA:
                car = UsaCarFactory.buildCar(type);
                break;
            case INDIA:
                car = IndiaCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
                break;
        }
        return car;
    }
}
