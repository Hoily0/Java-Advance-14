package work.controlelr;

import work.entity.Coder;
import work.entity.Manager;

public class ManagerController {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.work();

        Coder coder = new Coder();
        coder.work();
    }
}
