package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.model.Payment;
import in.clouthink.lutra.sample.repository.PaymentRepository;
import in.clouthink.lutra.sample.support.PaymentRestSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class PaymentRestSupportImpl implements PaymentRestSupport {

    @Autowired
    private PaymentRepository paymentRepository;

    public Page<Payment> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return paymentRepository.findAll(pageable);
    }

}
