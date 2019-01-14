package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Inventory;
import in.clouthink.lutra.sample.support.InventoryRestSupport;
import in.clouthink.lutra.sample.support.view.InventoryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryRestController {

    @Autowired
    private InventoryRestSupport inventoryRestSupport;

    @GetMapping("inventories")
    public Page<InventoryView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return inventoryRestSupport.listAll(pageable);
    }

}
