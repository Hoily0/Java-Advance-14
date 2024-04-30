package work.entity;

public class NewPhone extends Phone {
    @Override
    public void call() {
        System.out.println("新手机视频通话");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发送语音和图片");
    }

}
