package com.itheima.demo13_method_rewriting_considerations;

public class Zi extends Fu{

    /**
     * 子类重新父类的方法
     */
    @Override //重写小技巧：使用Override注解标识，该注解可以检查我们方法重写的格式是否正确，代码可读性也会更好。
    public void print1() {
        System.out.println("子类重写父类的方法print1");
    }

    //类重写父类方法时，访问权限必须大于或者等于父类该方法的权限（ public > protected > 缺省）。
    @Override
    public void print2() {
        System.out.println("子类重写父类的方法print2");
    }

    //重写的方法返回值类型，必须与被重写方法的返回值类型一样，或者更小。(学完多态再理解)
    @Override
    public String print3() {
        System.out.println("子类重写父类的方法print3");
        return null;
    }

    //私有方法，静态方法可以书写相同的方法,但是不属于重写。
    //@Override
    public static void print4(){
        System.out.println("打印子类方法print4");
    }
}
