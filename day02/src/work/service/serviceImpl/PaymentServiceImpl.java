package work.service.serviceImpl;

import work.entity.Amount;
import work.service.PaymentService;

public class PaymentServiceImpl extends Amount implements PaymentService {
    Amount amount;

    @Override
    public void platFrom(Amount amount) {
        System.out.println("通过支付平台支付了：" + amount.getAmount());
    }

    @Override
    public void bankCard(Amount amount) {
        System.out.println("通过银行卡网银支付了：" + amount.getAmount());
    }

    @Override
    public void creditCard(Amount amount) {
        System.out.println("通过信用卡快捷支付了：" + amount.getAmount());
    }
}
