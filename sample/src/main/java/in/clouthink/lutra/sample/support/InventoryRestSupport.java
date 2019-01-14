package in.clouthink.lutra.sample.support;

import in.clouthink.lutra.sample.support.view.InventoryView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

public interface InventoryRestSupport {

    Page<InventoryView> listAll(@PageableDefault(value = 20) Pageable pageable);

}
