package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.model.Country;
import in.clouthink.lutra.sample.repository.CountryRepository;
import in.clouthink.lutra.sample.support.CountryRestSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class CountryRestSupportImpl implements CountryRestSupport {

    @Autowired
    private CountryRepository countryRepository;

    public Page<Country> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return countryRepository.findAll(pageable);
    }

}
