package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Address;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address, Integer> {


}
