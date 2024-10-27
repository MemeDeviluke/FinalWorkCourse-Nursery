package model;

import java.util.Date;
import java.util.List;

public class Pet extends Animal{

    private String AnimalType;

    public Pet(String animalName, Date b_Day, List<String> commands, String AnimalType) {
        super(animalName, b_Day, commands);
        this.AnimalType = AnimalType;
    }

    public String getAnimalType() {
        return AnimalType;
    }

    public void setAnimalType(String animalType) {
        AnimalType = animalType;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "AnimalType='" + AnimalType + " " +
                super.toString()  +
                '}';
    }
}
