import controler.Controler;
import model.Animal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Controler controler = new Controler();
        int count = 0;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\n");
            System.out.println("1. Add new animal");
            System.out.println("2. Show all animals");
            System.out.println("3. Teach new command");
            System.out.println("4. Show all commands");
            System.out.println("5. Show all counts of animals");
            System.out.println("6. Exit");
            System.out.println("Choose something: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Select the button of the animal you want to add: \n 1.Cat 2.Dog 3.Hamster 4.Horse 5.Camel 6.Donkey");
                    int secondChoice = scanner.nextInt();
                    List<String> comms = new ArrayList<>();
                    scanner.nextLine();
                    switch (secondChoice){
                        case 1:
                            System.out.println("Choose a name of animal: ");
                            String catName = scanner.nextLine();
                            System.out.println("Write a B-Day of animal (yyyy-MM-dd): ");
                            String b_DayCat = scanner.nextLine();
                            Date date1 = formatter.parse(b_DayCat);
                            try {
                                controler.createCat(catName, date1, comms);
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                            count++;
                            break;
                        case 2:
                            System.out.println("Choose a name of animal: ");
                            String dogName = scanner.nextLine();
                            System.out.println("Write a B-Day of animal (yyyy-MM-dd): ");
                            String b_DayDog = scanner.nextLine();
                            Date date2 = formatter.parse(b_DayDog);
                            try {
                                controler.createDog(dogName, date2, comms);
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                            count++;
                            break;
                        case 3:
                            System.out.println("Choose a name of animal: ");
                            String hamsterName = scanner.nextLine();
                            System.out.println("Write a B-Day of animal (yyyy-MM-dd): ");
                            String b_DayHamster = scanner.nextLine();
                            Date date3 = formatter.parse(b_DayHamster);
                            try {
                                controler.createHamster(hamsterName, date3, comms);
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                            count++;
                            break;
                        case 4:
                            System.out.println("Choose a name of animal: ");
                            String horseName = scanner.nextLine();
                            System.out.println("Write a B-Day of animal (yyyy-MM-dd): ");
                            String b_DayHorse = scanner.nextLine();
                            Date date4 = formatter.parse(b_DayHorse);
                            try {
                                controler.createHorse(horseName, date4, comms);
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                            count++;
                            break;
                        case 5:
                            System.out.println("Choose a name of animal: ");
                            String camelName = scanner.nextLine();
                            System.out.println("Write a B-Day of animal (yyyy-MM-dd): ");
                            String b_DayCamel = scanner.nextLine();
                            Date date5 = formatter.parse(b_DayCamel);
                            try {
                                controler.createCamel(camelName, date5, comms);
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                            count++;
                            break;
                        case 6:
                            System.out.println("Choose a name of animal: ");
                            String donkeyName = scanner.nextLine();
                            System.out.println("Write a B-Day of animal (yyyy-MM-dd): ");
                            String b_DayDonkey = scanner.nextLine();
                            Date date6 = formatter.parse(b_DayDonkey);
                            try {
                                controler.createDonkey(donkeyName, date6, comms);
                            } catch (Exception e){
                                e.printStackTrace();
                            }
                            count++;
                            break;
                        default:
                            System.out.println("Wrong choice");

                    }
                    break;
                case 2:
                    controler.getAllAnim();
                    break;
                case 3:
                    System.out.println("Write a ID of animal, u want to teach new comm: ");
                    int animID = scanner.nextInt();
                    scanner.nextLine();
                    Animal Teacanimal = controler.getAnAnimal(controler.getAnimals(), animID);
                    System.out.println("Write the command you want to train the animal with: ");
                    String comm = scanner.nextLine();
                    controler.newCommTeaching(Teacanimal, comm);
                    break;
                case 4:
                    System.out.println("Write the ID of the animal you want to view the command sets from: ");
                    int animaID = scanner.nextInt();
                    scanner.nextLine();
                    Animal animal1 = controler.getAnAnimal(controler.getAnimals(), animaID);
                    controler.getAllComms(animal1);
                    break;
                case 5:
                    System.out.println("Count of animals -> " + count);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}