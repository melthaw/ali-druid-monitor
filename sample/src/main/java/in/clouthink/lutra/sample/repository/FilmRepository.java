package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Film;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends PagingAndSortingRepository<Film, Integer> {


}
