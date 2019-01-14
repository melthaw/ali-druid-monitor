package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.repository.CountryRepository;
import in.clouthink.lutra.sample.support.CountryRestSupport;
import in.clouthink.lutra.sample.support.view.CountryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class CountryRestSupportImpl implements CountryRestSupport {

    @Autowired
    private CountryRepository countryRepository;

    public Page<CountryView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return countryRepository.findAll(pageable).map(CountryView::from);
    }

}
