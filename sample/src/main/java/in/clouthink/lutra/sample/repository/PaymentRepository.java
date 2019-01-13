package in.clouthink.lutra.sample.repository;

import in.clouthink.lutra.sample.model.Payment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends PagingAndSortingRepository<Payment, Integer> {


}
