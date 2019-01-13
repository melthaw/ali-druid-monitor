package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Actor;
import in.clouthink.lutra.sample.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorRestController {

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping("actors")
    public Page<Actor> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return actorRepository.findAll(pageable);
    }

}
