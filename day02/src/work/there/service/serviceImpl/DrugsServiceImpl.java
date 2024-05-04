package work.there.service.serviceImpl;

import work.there.entity.DrugsDog;
import work.there.service.DrugsService;

public class DrugsServiceImpl extends DrugsDog implements DrugsService {
    @Override
    public void antiNarcotics() {
        System.out.println("用鼻子侦测毒品");
    }
}
