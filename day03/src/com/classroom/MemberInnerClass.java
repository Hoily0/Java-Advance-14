package com.classroom;

public class MemberInnerClass {
    public static void main(String[] args) {

        MemberOuter.MemberInner memberInner = new MemberOuter().new MemberInner();
        memberInner.run();

        StaticOuter.StaticInner staticInner = new StaticOuter.StaticInner();
        staticInner.run();

        LocalOuter localOuter = new LocalOuter();
        localOuter.in();


    }

}

class MemberOuter {

    class MemberInner {
        public void run() {
            System.out.println("成员内部类");
        }
    }
}

class StaticOuter {
    static class StaticInner {
        public void run() {
            System.out.println("静态内部类");
        }
    }
}

class LocalOuter {

    public void in() {
        class LocalInner {
            public void run() {
                System.out.println("成员内部类");
                class Depth3 {
                    public void run() {
                        System.out.println("深度为3");
                        class Depth4 {
                            public void run() {
                                System.out.println("深度为4");
                                class Depth5 {
                                    public void run() {
                                        System.out.println("深度为5");
                                        class Depth6 {
                                            public void run() {
                                                System.out.println("深度为6");
                                                class Depth7 {
                                                    public void run() {
                                                        System.out.println("深度为7");
                                                        class Depth8 {
                                                            public void run() {
                                                                System.out.println("深度为8");
                                                                class Depth9 {
                                                                    public void run() {
                                                                        System.out.println("深度为9");
                                                                        class Depth10 {
                                                                            public void run() {
                                                                                System.out.println("深度为10");
                                                                            }
                                                                        }
                                                                        Depth10 depth10 = new Depth10();
                                                                        depth10.run();
                                                                    }
                                                                }
                                                                Depth9 depth9 = new Depth9();
                                                                depth9.run();
                                                            }
                                                        }
                                                        Depth8 depth8 = new Depth8();
                                                        depth8.run();
                                                    }
                                                }
                                                Depth7 depth7 = new Depth7();
                                                depth7.run();
                                            }
                                        }
                                        Depth6 depth6 = new Depth6();
                                        depth6.run();
                                    }
                                }
                                Depth5 depth5 = new Depth5();
                                depth5.run();
                            }
                        }
                        Depth4 depth4 = new Depth4();
                        depth4.run();
                    }
                }
                Depth3 depth3 = new Depth3();
                depth3.run();
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.run();
    }

}
