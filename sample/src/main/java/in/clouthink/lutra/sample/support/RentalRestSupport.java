package in.clouthink.lutra.sample.support;

import in.clouthink.lutra.sample.support.view.RentalView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

public interface RentalRestSupport {

    Page<RentalView> listAll(@PageableDefault(value = 20) Pageable pageable);

}
