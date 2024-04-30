package work.there.service.serviceImpl;

import work.there.entity.Animal;
import work.there.service.AnimalService;

public class AnimalServiceImpl extends Animal implements AnimalService {

    @Override
    public void bellow() {
        System.out.println("汪汪叫");

    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
}
