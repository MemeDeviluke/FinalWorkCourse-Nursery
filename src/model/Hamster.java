package model;

import java.util.Date;
import java.util.List;

public class Hamster extends Pet{

    private int HamsterID;
    private String PetType;

    public Hamster(int HamsterID, String animalName, Date b_Day, List<String> commands, String AnimalType, String PetType) {
        super(animalName, b_Day, commands, AnimalType);
        this.HamsterID = HamsterID;
        this.PetType = PetType;
    }

    public int getHamsterID() {
        return HamsterID;
    }

    public void setHamsterID(int hamsterID) {
        HamsterID = hamsterID;
    }

    public String getPetType() {
        return PetType;
    }

    public void setPetType(String petType) {
        PetType = petType;
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "HamsterID=" + HamsterID +
                ", PetType='" + PetType + " " +
                super.toString() +
                '}';
    }
}
