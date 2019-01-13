package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Film;
import in.clouthink.lutra.sample.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmRestController {

    @Autowired
    private FilmRepository filmRepository;

    @GetMapping("films")
    public Page<Film> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return filmRepository.findAll(pageable);
    }

}
