package in.clouthink.lutra.sample.support.impl;

import in.clouthink.lutra.sample.model.Staff;
import in.clouthink.lutra.sample.repository.StaffRepository;
import in.clouthink.lutra.sample.support.StaffRestSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Component;

@Component
public class StaffRestSupportImpl implements StaffRestSupport {

    @Autowired
    private StaffRepository staffRepository;

    public Page<Staff> listAll(@PageableDefault(value = 20) Pageable pageable) {
        return staffRepository.findAll(pageable);
    }

}
