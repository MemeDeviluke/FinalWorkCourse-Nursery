package model;

import java.util.Date;
import java.util.List;

public abstract class Animal {

    private String AnimalName;
    private Date B_Day;
    private List<String> commands;

    public Animal(String animalName, Date b_Day, List<String> commands) {
        AnimalName = animalName;
        B_Day = b_Day;
        this.commands = commands;
    }

    public String getAnimalName() {
        return AnimalName;
    }

    public void setAnimalName(String animalName) {
        AnimalName = animalName;
    }

    public Date getB_Day() {
        return B_Day;
    }

    public void setB_Day(Date b_Day) {
        B_Day = b_Day;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "AnimalName='" + AnimalName + '\'' +
                ", B_Day=" + B_Day +
                ", commands=" + commands +
                '}';
    }
}
