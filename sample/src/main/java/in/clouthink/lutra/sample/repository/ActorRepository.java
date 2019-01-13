package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Actor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends PagingAndSortingRepository<Actor, Integer> {


}
