package work.entity;

public class OldPhone extends Phone {
    @Override
    public void call() {
        System.out.println("普通的打电话功能");
    }

    @Override
    public void sendMessage() {
        System.out.println("普通的发短信功能");
    }
}
