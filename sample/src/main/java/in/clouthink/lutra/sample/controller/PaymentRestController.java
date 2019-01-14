package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.support.PaymentRestSupport;
import in.clouthink.lutra.sample.support.view.PaymentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRestController {

    @Autowired
    private PaymentRestSupport   paymentRestSupport;

    @GetMapping("payments")
    public Page<PaymentView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return paymentRestSupport.listAll(pageable);
    }

}
