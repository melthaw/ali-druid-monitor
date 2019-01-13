package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.model.Inventory;
import in.clouthink.lutra.sample.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryRestController {

    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("inventories")
    public Page<Inventory> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return inventoryRepository.findAll(pageable);
    }

}
