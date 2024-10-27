package model;

import java.util.Date;
import java.util.List;

public class Horse extends PackAnimal{

    private int HorseID;
    private String PackAnimalType;

    public Horse(int HorseID, String animalName, Date b_Day, List<String> commands, String AnimalType, String PackAnimalType) {
        super(animalName, b_Day, commands, AnimalType);
        this.HorseID = HorseID;
        this.PackAnimalType = PackAnimalType;
    }

    public int getHorseID() {
        return HorseID;
    }

    public void setHorseID(int horseID) {
        HorseID = horseID;
    }

    public String getPackAnimalType() {
        return PackAnimalType;
    }

    public void setPackAnimalType(String packAnimalType) {
        PackAnimalType = packAnimalType;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "HorseID=" + HorseID +
                ", PackAnimalType='" + PackAnimalType + " " +
                super.toString() +
                '}';
    }
}
