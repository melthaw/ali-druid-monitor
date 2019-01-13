package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Store;
import in.clouthink.lutra.sample.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreRestController {

    @Autowired
    private StoreRepository storeRepository;

    @GetMapping("stores")
    public Page<Store> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return storeRepository.findAll(pageable);
    }

}
