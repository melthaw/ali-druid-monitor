package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.repository.FilmRepository;
import in.clouthink.lutra.sample.support.FilmRestSupport;
import in.clouthink.lutra.sample.support.view.FilmView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class FilmRestSupportImpl implements FilmRestSupport {

    @Autowired
    private FilmRepository filmRepository;

    public Page<FilmView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return filmRepository.findAll(pageable).map(FilmView::from);
    }

}
