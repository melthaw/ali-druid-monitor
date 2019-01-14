package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.repository.ActorRepository;
import in.clouthink.lutra.sample.support.ActorRestSupport;
import in.clouthink.lutra.sample.support.view.ActorView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class ActorRestSupportImpl implements ActorRestSupport {

    @Autowired
    private ActorRepository actorRepository;

    public Page<ActorView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return actorRepository.findAll(pageable).map(ActorView::from);
    }

}
