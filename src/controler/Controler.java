package controler;

import model.*;
import view.*;
import service.DataService;

import java.util.Date;
import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final CatView catView = new CatView();
    private final DogView dogView = new DogView();
    private final HamsterView hamsterView = new HamsterView();
    private final HorseView horseView = new HorseView();
    private final CamelView camelView = new CamelView();
    private final DonkeyView donkeyView = new DonkeyView();

    public void createCat(String AnimalName, Date b_Day, List<String> commands){
        service.create(AnimalName, b_Day, commands, Type.CAT);
    }

    public void createDog(String AnimalName, Date b_Day, List<String> commands){
        service.create(AnimalName, b_Day, commands, Type.DOG);
    }

    public void createHamster(String AnimalName, Date b_Day, List<String> commands){
        service.create(AnimalName, b_Day, commands, Type.HAMSTER);
    }

    public void createHorse(String AnimalName, Date b_Day, List<String> commands){
        service.create(AnimalName, b_Day, commands, Type.HORSE);
    }

    public void createCamel(String AnimalName, Date b_Day, List<String> commands){
        service.create(AnimalName, b_Day, commands, Type.CAMEL);
    }

    public void createDonkey(String AnimalName, Date b_Day, List<String> commands){
        service.create(AnimalName, b_Day, commands, Type.DONKEY);
    }

    public List<Animal> getAnimals(){
        return service.getAllAnimals();
    }

    public void getAllAnim(){
         List<Animal> animals = service.getAllAnimals();
         int count = 0;
         for (Animal animal: animals){
             if(animal instanceof Cat){
                 catView.printOnConsole((Cat) animal);
             }
             if(animal instanceof Dog){
                 dogView.printOnConsole((Dog) animal);
             }
             if(animal instanceof Hamster){
                 hamsterView.printOnConsole((Hamster) animal);
             }
             if(animal instanceof Horse){
                 horseView.printOnConsole((Horse) animal);
             }
             if(animal instanceof Camel){
                 camelView.printOnConsole((Camel) animal);
             }
             if(animal instanceof Donkey){
                 donkeyView.printOnConsole((Donkey) animal);
             }
             count++;
         }
    }

    public Animal getAnAnimal(List<Animal> animalList, int ID){
        animalList = service.getAllAnimals();
        for (Animal animal: animalList){
            if(animal instanceof Cat && ((Cat) animal).getCatID() == ID){
                return animal;
            }
            if(animal instanceof Dog && ((Dog) animal).getDogID() == ID){
                return animal;
            }
            if(animal instanceof Hamster && ((Hamster) animal).getHamsterID() == ID){
                return animal;
            }
            if(animal instanceof Horse && ((Horse) animal).getHorseID() == ID){
                return animal;
            }
            if(animal instanceof Camel && ((Camel) animal).getCamelID() == ID){
                return animal;
            }
            if(animal instanceof Donkey && ((Donkey) animal).getDonkeyID() == ID){
                return animal;
            }
        }
        return null;
    }

    public void getAllComms(Animal animal){
        List<String> comms = animal.getCommands();
        for (String command: comms){
            System.out.println(command);
        }
    }

    public void newCommTeaching(Animal animal, String comm){
        List<String> comms = animal.getCommands();
        List<String> newComms = service.teachNewCommand(comms, comm);
        animal.setCommands(newComms);
    }

}
