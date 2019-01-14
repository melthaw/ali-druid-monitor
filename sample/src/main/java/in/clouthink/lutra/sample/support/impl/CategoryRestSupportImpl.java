package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.model.Category;
import in.clouthink.lutra.sample.repository.CategoryRepository;
import in.clouthink.lutra.sample.support.CategoryRestSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class CategoryRestSupportImpl implements CategoryRestSupport {

    @Autowired
    private CategoryRepository categoryRepository;

    public Page<Category> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

}
