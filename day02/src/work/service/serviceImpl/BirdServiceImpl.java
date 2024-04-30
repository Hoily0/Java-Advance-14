package work.service.serviceImpl;

import work.entity.Bird;
import work.service.BirdService;
import work.service.FlyService;

public class BirdServiceImpl extends Bird implements BirdService, FlyService {


    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        System.out.println("鸟使用翅膀飞翔");
    }
}
