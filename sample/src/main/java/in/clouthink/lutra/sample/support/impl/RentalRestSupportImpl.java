package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.repository.RentalRepository;
import in.clouthink.lutra.sample.support.RentalRestSupport;
import in.clouthink.lutra.sample.support.view.RentalView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class RentalRestSupportImpl implements RentalRestSupport {

    @Autowired
    private RentalRepository rentalRepository;

    public Page<RentalView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return rentalRepository.findAll(pageable).map(RentalView::from);
    }

}
