package work;

public class Test {
    public static void main(String[] args) {
        Destiny destiny = Destiny.HUNTER;
        System.out.println("destiny = " + destiny);
        Destiny.HUNTER.flyTime = 100;

        switch (destiny) {
            case TITAN:
                System.out.println("这是苔炭");
            case HUNTER:
                System.out.println("这是航忒");
            case WARLOCK:
                System.out.println("这是熟食");
        }
        System.out.println(Destiny.HUNTER.flyTime);
        System.out.println(Destiny.TITAN.flyTime);

        Destiny.WARLOCK.show();
    }


}
