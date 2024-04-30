package work.controlelr;


import work.service.PaymentService;
import work.service.serviceImpl.PaymentServiceImpl;

import java.util.Scanner;

public class PaymentController {
    public static void main(String[] args) {
        System.out.println("请选择支付方式： 1.支付平台支付  2.银行卡网银支付  3.引用卡快捷支付");
        System.out.println("请选择您的支付方式");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        PaymentService paymentService = new PaymentServiceImpl();

        System.out.println("输入金额");

        if (choice == 1) {


        } else if (choice == 2) {


        } else {


        }


    }

    public static void pay(PaymentService paymentService) {
//        paymentService
    }
}
