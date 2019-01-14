package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.repository.InventoryRepository;
import in.clouthink.lutra.sample.support.InventoryRestSupport;
import in.clouthink.lutra.sample.support.view.InventoryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class InventoryRestSupportImpl implements InventoryRestSupport {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Page<InventoryView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return inventoryRepository.findAll(pageable).map(InventoryView::from);
    }

}
