package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.model.Address;
import in.clouthink.lutra.sample.repository.AddressRepository;
import in.clouthink.lutra.sample.support.AddressRestSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class AddressRestSupportImpl implements AddressRestSupport {

    @Autowired
    private AddressRepository addressRepository;

    public Page<Address> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

}
