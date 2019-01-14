package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.support.AddressRestSupport;
import in.clouthink.lutra.sample.support.view.AddressView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressRestController {

    @Autowired
    private AddressRestSupport addressRestSupport;

    @GetMapping("addresses")
    public Page<AddressView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return addressRestSupport.listAll(pageable);
    }

}
