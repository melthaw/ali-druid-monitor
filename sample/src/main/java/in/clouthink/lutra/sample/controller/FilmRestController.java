package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.support.FilmRestSupport;
import in.clouthink.lutra.sample.support.view.FilmView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmRestController {

    @Autowired
    private FilmRestSupport filmRestSupport;

    @GetMapping("films")
    public Page<FilmView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return filmRestSupport.listAll(pageable);
    }

}
