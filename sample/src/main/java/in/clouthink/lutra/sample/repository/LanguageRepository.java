package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Language;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends PagingAndSortingRepository<Language, Integer> {


}
