package com.itheima.code;

public class CodeDemo2 {
    static {
        System.out.println("CodeDemo2...static...");
    }

    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

class Fu {
    static {
        System.out.println("Fu..static...");
    }

    {
        System.out.println("Fu...构造代码块");
    }

    public Fu() {
        System.out.println("父类的空参构造方法");
    }

    public Fu(int num) {
        System.out.println("父类的带参构造方法");
    }
}

class Zi extends Fu {
    static {
        System.out.println("Zi...static...");
    }

    {
        System.out.println("Zi...构造代码块");
    }

    public Zi() {
        System.out.println("Zi...空参构造方法");
    }

    public Zi(int num) {
        System.out.println("Zi...带参构造方法");
    }
}
