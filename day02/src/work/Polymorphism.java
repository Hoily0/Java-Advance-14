package work;

import work.entity.Animal;
import work.entity.Bird;

import java.util.Arrays;

public class Polymorphism {

    public static void main(String[] args) {
        Son son = new Son();
        String str = son.str;
        System.out.println("子子 = " + str);
        Father son1 = new Father();
        String str1 = son1.str;
        System.out.println("str1 = " + str1);
        System.out.println(son.str);


    }

}

class Father {
    String str = "父类";

    public void poly() {
        System.out.println("父类方法");
    }
}

class Son extends Father {
    String str = "儿子";

    @Override
    public void poly() {
        System.out.println("子类方法");
    }
}

