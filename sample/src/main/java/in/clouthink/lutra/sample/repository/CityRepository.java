package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.City;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends PagingAndSortingRepository<City, Integer> {


}
