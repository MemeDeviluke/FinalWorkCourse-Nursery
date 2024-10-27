package model;

import java.util.Date;
import java.util.List;

public class Donkey extends PackAnimal{

    private int DonkeyID;
    private String PackAnimalType;

    public Donkey(int DonkeyID, String animalName, Date b_Day, List<String> commands, String AnimalType, String PackAnimalType) {
        super(animalName, b_Day, commands, AnimalType);
        this.DonkeyID = DonkeyID;
        this.PackAnimalType = PackAnimalType;
    }

    public int getDonkeyID() {
        return DonkeyID;
    }

    public void setDonkeyID(int donkeyID) {
        DonkeyID = donkeyID;
    }

    public String getPackAnimalType() {
        return PackAnimalType;
    }

    public void setPackAnimalType(String packAnimalType) {
        PackAnimalType = packAnimalType;
    }

    @Override
    public String toString() {
        return "Donkey{" +
                "DonkeyID=" + DonkeyID +
                ", PackAnimalType='" + PackAnimalType + " " +
                super.toString() +
                '}';
    }
}
