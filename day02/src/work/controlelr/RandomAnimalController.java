package work.controlelr;

import work.entity.Animal;
import work.entity.Bird;
import work.entity.Cat;

import java.util.Random;

public class RandomAnimalController {
    public static void main(String[] args) {

//        Random random = new Random();
//        int i = random.nextInt(2) + 1;
//        getAnimal(new Animal(),i);

        Cat cat = new Cat();
        Bird bird = new Bird();

        typeJudgment(cat);
        typeJudgment(bird);


    }


    public static void typeJudgment(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eat();
        } else if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.getAge();

        }


    }


//    public static void getAnimal(Animal animal, int i){
//
//        switch (i){
//            case 1:
//                 new Cat();
//                System.out.println("猫创造");
//                break;
//            case 2:
//                 new Bird();
//                System.out.println("鸟创造");
//        }
//
//    }

}
