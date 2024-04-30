package work.controller;

import work.entity.Animal;

public class AnimalController {


    public static void main(String[] args) {

        Animal animalOne = new Animal();
        Animal animalTwo = new Animal();

        System.out.println("animalTwo.equals(animalOne) = " + animalTwo.equals(animalOne));
    }
}
