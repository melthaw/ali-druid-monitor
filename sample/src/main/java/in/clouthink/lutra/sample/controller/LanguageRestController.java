package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Language;
import in.clouthink.lutra.sample.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageRestController {

    @Autowired
    private LanguageRepository languageRepository;

    @GetMapping("actors")
    public Page<Language> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return languageRepository.findAll(pageable);
    }

}
