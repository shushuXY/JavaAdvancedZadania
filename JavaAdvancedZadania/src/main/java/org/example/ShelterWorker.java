package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShelterWorker {
    private String name;
    private String surname;
    private int id;

    List<Animal> animalsList = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animalsList.add(animal);
        animal.setShelterWorker(this);
    }

    public ShelterWorker(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "ShelterWorker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", animalsList=" + animalsList +
                '}';
    }
}
