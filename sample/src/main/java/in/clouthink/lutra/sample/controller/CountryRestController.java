package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Country;
import in.clouthink.lutra.sample.support.CountryRestSupport;
import in.clouthink.lutra.sample.support.view.CountryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryRestController {

    @Autowired
    private CountryRestSupport countryRestSupport;

    @GetMapping("countries")
    public Page<CountryView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return countryRestSupport.listAll(pageable);
    }

}
