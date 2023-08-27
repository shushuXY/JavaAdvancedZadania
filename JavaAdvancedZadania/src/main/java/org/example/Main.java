package org.example;

public class Main {


    public static void main(String[] args) {

        ShelterWorker shelterWorker1 = new ShelterWorker("Rychu", "Peja", 420);


        Animal dog = new Animal(5, "Reksio", 12);
        Animal cat = new Animal(6, "Puszek", 8);
        Animal hamster = new Animal(7, "Rysiek", 2);

        shelterWorker1.addAnimal(dog);
        shelterWorker1.addAnimal(cat);
        shelterWorker1.addAnimal(hamster);

       // dog.setShelterWorker(shelterWorker1);

       // System.out.println(shelterWorker1.animalsList);
             System.out.println(dog.shelterWorker);

    }


}
