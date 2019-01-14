package in.clouthink.lutra.sample.support;

import in.clouthink.lutra.sample.model.Staff;
import in.clouthink.lutra.sample.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public interface StaffRestSupport {

    Page<Staff> listAll(@PageableDefault(value = 20) Pageable pageable);

}
