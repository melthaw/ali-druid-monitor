package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.support.StoreRestSupport;
import in.clouthink.lutra.sample.support.view.StoreView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreRestController {

    @Autowired
    private StoreRestSupport storeRestSupport;

    @GetMapping("stores")
    public Page<StoreView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return storeRestSupport.listAll(pageable);
    }

}
