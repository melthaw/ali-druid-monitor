package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.support.CityRestSupport;
import in.clouthink.lutra.sample.support.view.CityView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityRestController {

    @Autowired
    private CityRestSupport cityRestSupport;

    @GetMapping("cities")
    public Page<CityView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return cityRestSupport.listAll(pageable);
    }

}
