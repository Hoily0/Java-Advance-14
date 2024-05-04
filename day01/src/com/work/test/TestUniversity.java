package com.work.test;

import com.work.entity.Stutent;
import com.work.entity.University;

public class TestUniversity {


    public static void main(String[] args) {

        University university = new University("金周路大学", 80);
        Stutent stutent = new Stutent("张三", 90);
        Stutent stutent2 = new Stutent("张三", 60);
        university.enterRule(stutent);
        university.enterRule(stutent2);

    }
}
