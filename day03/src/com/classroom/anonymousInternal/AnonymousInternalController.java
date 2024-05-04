package com.classroom.anonymousInternal;

public class AnonymousInternalController {

    public static void main(String[] args) {

        AnonymousInternalService anonymousInternalService = new AnonymousInternalService() {
            @Override
            public void getArrayById() {
                System.out.println("匿名内部类");
            }

        };
        anonymousInternalService.getArrayById();


        AnonymousInternalService anonymousInternalService1 = new AnonymousInternalServiceImpl();

        anonymousInternalService1.getArrayById();


    }
}
