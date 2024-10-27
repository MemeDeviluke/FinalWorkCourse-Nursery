package model;

import java.util.Date;
import java.util.List;

public class Dog extends Pet{
    private int DogID;
    private String PetType;

    public Dog(int DogID, String animalName, Date b_Day, List<String> commands, String AnimalType, String PetType) {
        super(animalName, b_Day, commands, AnimalType);
        this.DogID = DogID;
        this.PetType = PetType;
    }

    public int getDogID() {
        return DogID;
    }

    public void setDogID(int dogID) {
        DogID = dogID;
    }

    public String getPetType() {
        return PetType;
    }

    public void setPetType(String petType) {
        PetType = petType;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "DogID=" + DogID +
                ", PetType='" + PetType + " " +
                super.toString() +
                '}';
    }
}
