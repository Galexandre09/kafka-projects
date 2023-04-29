package com.gabriel.paymentservice.services.impl;

import com.gabriel.paymentservice.model.Payment;
import com.gabriel.paymentservice.services.PaymentService;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;
@Log4j
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
      log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}",payment);
    }
}
