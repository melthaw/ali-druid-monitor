package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Inventory;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends PagingAndSortingRepository<Inventory, Integer> {


}
