package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Payment;
import in.clouthink.lutra.sample.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRestController {

    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("actors")
    public Page<Payment> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return paymentRepository.findAll(pageable);
    }

}