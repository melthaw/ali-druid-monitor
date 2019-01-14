package in.clouthink.lutra.sample.controller;

import in.clouthink.lutra.sample.support.StaffRestSupport;
import in.clouthink.lutra.sample.support.view.StaffView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffRestController {

    @Autowired
    private StaffRestSupport staffRestSupport;

    @GetMapping("staffs")
    public Page<StaffView> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return staffRestSupport.listAll(pageable);
    }

}
