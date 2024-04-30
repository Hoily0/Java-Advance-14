package com.work.test;

import com.work.entity.Studend;
import com.work.entity.StudentLeader;
import com.work.entity.Worker;

public class TestPerson {


    public static void main(String[] args) {
        Studend studend = new Studend();
        studend.work();

        Worker worker = new Worker();
        worker.work();

        StudentLeader studentLeader = new StudentLeader();
        studentLeader.meeting();

    }
}
