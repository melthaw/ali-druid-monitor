package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Rental;
import in.clouthink.lutra.sample.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalRestController {

    @Autowired
    private RentalRepository rentalRepository;

    @GetMapping("rentals")
    public Page<Rental> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return rentalRepository.findAll(pageable);
    }

}
