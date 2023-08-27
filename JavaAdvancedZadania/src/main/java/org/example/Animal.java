package org.example;

public class Animal {
    private int id;
    private String name;
    private int age;
    private String race;
 ShelterWorker shelterWorker ;


    public void setShelterWorker(ShelterWorker shelterWorker) {
        this.shelterWorker = shelterWorker;
    }

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", race='" + race + '\'' +
    //            ", shelterWorker=" + shelterWorker +
                '}';
    }


}
