package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Integer> {


}
