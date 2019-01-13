package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {


}
