package in.clouthink.lutra.sample.support;

import in.clouthink.lutra.sample.support.view.FilmView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

public interface FilmRestSupport {

    Page<FilmView> listAll(@PageableDefault(value = 20) Pageable pageable);

}
