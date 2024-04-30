package work.there.controller;

import work.there.service.AnimalService;
import work.there.service.DrugsService;
import work.there.service.serviceImpl.AnimalServiceImpl;
import work.there.service.serviceImpl.DrugsServiceImpl;

public class DrugsController {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalServiceImpl();
        DrugsService drugsService = new DrugsServiceImpl();

        animalService.eat();
        animalService.bellow();

        drugsService.antiNarcotics();
    }
}
