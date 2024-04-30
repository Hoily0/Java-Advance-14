package work.controlelr;

import work.entity.NewPhone;
import work.entity.OldPhone;
import work.service.IplayService;
import work.service.serviceImpl.IplayServiceImpl;

public class PhoneController {
    public static void main(String[] args) {
        OldPhone oldPhone = new OldPhone();

        NewPhone newPhone = new NewPhone();

        oldPhone.call();
        oldPhone.sendMessage();

        newPhone.call();
        newPhone.sendMessage();
        IplayService iplayService = new IplayServiceImpl();
        iplayService.playGames();


    }
}
