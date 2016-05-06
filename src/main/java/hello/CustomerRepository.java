package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
/**
 * Created by debbiewood on 06/05/2016.
 */
// Spring Data MongoDB creates it on the fly when you run the application.
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}