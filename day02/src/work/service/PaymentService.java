package work.service;

import work.entity.Amount;

public interface PaymentService {

    void platFrom(Amount amount);

    void bankCard(Amount amount);

    void creditCard(Amount amount);
}

