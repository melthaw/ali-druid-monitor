package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Category;
import in.clouthink.lutra.sample.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryRestController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("categories")
    public Page<Category> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

}
