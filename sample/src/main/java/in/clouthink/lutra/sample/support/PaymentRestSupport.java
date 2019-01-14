package in.clouthink.lutra.sample.support;

import in.clouthink.lutra.sample.support.view.PaymentView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

public interface PaymentRestSupport {

     Page<PaymentView> listAll(@PageableDefault(value = 20) Pageable pageable) ;

}
