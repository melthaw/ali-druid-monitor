package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.repository.CityRepository;
import in.clouthink.lutra.sample.support.CityRestSupport;
import in.clouthink.lutra.sample.support.view.CityView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class CityRestSupportImpl implements CityRestSupport {

    @Autowired
    private CityRepository cityRepository;

    public Page<CityView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return cityRepository.findAll(pageable).map(CityView::from);
    }

}
