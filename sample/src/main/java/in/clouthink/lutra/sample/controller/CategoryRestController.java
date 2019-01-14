package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.support.CategoryRestSupport;
import in.clouthink.lutra.sample.support.view.CategoryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryRestController {

    @Autowired
    private CategoryRestSupport categoryRestSupport;

    @GetMapping("categories")
    public Page<CategoryView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return categoryRestSupport.listAll(pageable);
    }

}
