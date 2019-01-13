package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Store;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends PagingAndSortingRepository<Store, Integer> {


}
