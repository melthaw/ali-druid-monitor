package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Integer> {


}
