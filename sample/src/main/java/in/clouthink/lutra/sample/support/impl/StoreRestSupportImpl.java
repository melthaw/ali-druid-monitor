package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.model.Store;
import in.clouthink.lutra.sample.repository.StoreRepository;
import in.clouthink.lutra.sample.support.StoreRestSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class StoreRestSupportImpl implements StoreRestSupport {

    @Autowired
    private StoreRepository storeRepository;

    public Page<Store> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return storeRepository.findAll(pageable);
    }

}
