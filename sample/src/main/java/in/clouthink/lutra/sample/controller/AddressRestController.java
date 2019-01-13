package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Address;
import in.clouthink.lutra.sample.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressRestController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("actors")
    public Page<Address> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

}
