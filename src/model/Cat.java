package model;

import java.util.Date;
import java.util.List;

public class Cat extends Pet{

    private int CatID;
    private String PetType;

    public Cat(int CatID, String animalName, Date b_Day, List<String> commands, String AnimalType, String PetType) {
        super(animalName, b_Day, commands, AnimalType);
        this.CatID = CatID;
        this.PetType = PetType;
    }

    public int getCatID() {
        return CatID;
    }

    public void setCatID(int catID) {
        CatID = catID;
    }

    public String getPetType() {
        return PetType;
    }

    public void setPetType(String petType) {
        PetType = petType;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "CatID=" + CatID +
                ", PetType='" + PetType + " " +
                super.toString() +
                '}';
    }
}
