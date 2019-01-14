package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.repository.LanguageRepository;
import in.clouthink.lutra.sample.support.LanguageRestSupport;
import in.clouthink.lutra.sample.support.view.LanguageView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class LanguageRestSupportImpl implements LanguageRestSupport {

    @Autowired
    private LanguageRepository languageRepository;

    public Page<LanguageView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return languageRepository.findAll(pageable).map(LanguageView::from);
    }

}
