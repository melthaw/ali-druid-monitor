package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.support.RentalRestSupport;
import in.clouthink.lutra.sample.support.view.RentalView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalRestController {

    @Autowired
    private RentalRestSupport rentalRestSupport;

    @GetMapping("rentals")
    public Page<RentalView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return rentalRestSupport.listAll(pageable);
    }

}
