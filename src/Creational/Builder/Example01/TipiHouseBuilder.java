package Creational.Builder.Example01;

public class TipiHouseBuilder implements HouseBuilder {
    private House house;

    public TipiHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wood & Ice");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wood, caribou and seal skins");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Fire Wood");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
