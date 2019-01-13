package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Rental;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalRepository extends PagingAndSortingRepository<Rental, Integer> {


}
