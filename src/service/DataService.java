package service;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataService {
    private List<Animal> animalList;
    private int lastID = 0;

    public DataService() {
        this.animalList = new ArrayList<>();
    }

    public void create(String AnimalName, Date b_day, List<String> Commands, Type type){
        int AnimalID = animalList.size() + 1;
        if(Type.CAT == type){
            Cat cat = new Cat(AnimalID, AnimalName, b_day, Commands, "Pet", "Cat");
            animalList.add(cat);
        }
        if(Type.DOG == type){
            Dog dog = new Dog(AnimalID, AnimalName, b_day, Commands, "Pet", "Dog");
            animalList.add(dog);
        }
        if(Type.HAMSTER == type){
            Hamster hamster = new Hamster(AnimalID, AnimalName, b_day, Commands, "Pet", "Hamster");
            animalList.add(hamster);
        }
        if(Type.HORSE == type){
            Horse horse = new Horse(AnimalID, AnimalName, b_day, Commands, "PackAnimal", "Horse");
            animalList.add(horse);
        }
        if(Type.CAMEL == type){
            Camel camel = new Camel(AnimalID, AnimalName, b_day, Commands, "PackAnimal", "Camel");
            animalList.add(camel);
        }
        if(Type.DONKEY == type){
            Donkey donkey = new Donkey(AnimalID, AnimalName, b_day, Commands, "PackAnimal", "Donkey");
            animalList.add(donkey);
        }
    }

    public List<Animal> getAllAnimals(){
        return animalList;
    }

    public List<String> teachNewCommand(List<String> comms, String comm){
        comms.add(comm);
        return comms;
    }


//    private int getFreeID(Type type){
//        boolean itsCat = Type.CAT == type;
//        boolean itsDog = Type.DOG == type;
//        boolean itsHamster = Type.HAMSTER == type;
//        boolean itsHorse = Type.HORSE == type;
//        boolean itsCamel = Type.CAMEL == type;
//        boolean itsDonkey = Type.DONKEY == type;
//        int lastID = 1;
//        for(Animal animal: animalList) {
//            if (animal instanceof Cat && itsCat){
//                lastID = ((Cat) animal).getCatID() + 1;
//            }
//            if (animal instanceof Dog && itsDog){
//                lastID = ((Dog) animal).getDogID() + 1;
//            }
//            if (animal instanceof Hamster && itsHamster){
//                lastID = ((Hamster) animal).getHamsterID() + 1;
//            }
//            if (animal instanceof Horse && itsHorse){
//                lastID = ((Horse) animal).getHorseID() + 1;
//            }
//            if (animal instanceof Camel && itsCamel){
//                lastID = ((Camel) animal).getCamelID() + 1;
//            }
//            if (animal instanceof Donkey && itsDonkey){
//                lastID = ((Donkey) animal).getDonkeyID() + 1;
//            }
//        }
//        return lastID;
//    }
}
