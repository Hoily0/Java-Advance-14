package work;

import work.entity.Animal;
import work.entity.Cat;

public class Polo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Animal();

        showEat(cat);
        showEat(animal);

    }

    public static void showEat(Animal animal) {
        System.out.println("吃了");
    }
}
