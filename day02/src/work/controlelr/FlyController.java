package work.controlelr;

import work.service.AirPlaneService;
import work.service.serviceImpl.AirPlaneServiceImpl;
import work.service.serviceImpl.BirdServiceImpl;

public class FlyController {

    public static void main(String[] args) {


        BirdServiceImpl service = new BirdServiceImpl();
        service.fly();

        AirPlaneService airPlaneService = new AirPlaneServiceImpl();
//        AirPlaneService airPlaneService = new AirPlaneService();
        airPlaneService.fly();


    }
}
