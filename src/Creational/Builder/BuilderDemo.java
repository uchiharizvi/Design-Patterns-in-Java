package Creational.Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        Builder builder = new Builder(iglooBuilder);
        builder.constructHouse();
        House house = builder.getHouse();
        System.out.println("Builder constructed: "+ house);
    }
}
