package work.service.serviceImpl;

import work.entity.AirPlane;
import work.service.AirPlaneService;

public class AirPlaneServiceImpl extends AirPlane implements AirPlaneService {

    @Override
    public void fly() {
        System.out.println("飞机使用魔法飞翔");
    }
}
