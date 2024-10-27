package model;

import java.util.Date;
import java.util.List;

public class Camel extends PackAnimal{

    private int CamelID;
    private String PackAnimalType;

    public Camel(int CamelID, String animalName, Date b_Day, List<String> commands, String AnimalType, String PackAnimalType) {
        super(animalName, b_Day, commands, AnimalType);
        this.CamelID = CamelID;
        this.PackAnimalType = PackAnimalType;
    }

    public int getCamelID() {
        return CamelID;
    }

    public void setCamelID(int camelID) {
        CamelID = camelID;
    }

    public String getPackAnimalType() {
        return PackAnimalType;
    }

    public void setPackAnimalType(String packAnimalType) {
        PackAnimalType = packAnimalType;
    }

    @Override
    public String toString() {
        return "Camel{" +
                "CamelID=" + CamelID +
                ", PackAnimalType='" + PackAnimalType + " " +
                super.toString() +
                '}';
    }
}
