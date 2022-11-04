package Creational.Builder.Example01;

public class Builder {
    private HouseBuilder houseBuilder;

    public Builder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildInterior();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildBasement();

    }
}
