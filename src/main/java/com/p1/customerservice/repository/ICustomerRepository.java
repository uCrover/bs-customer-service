package com.p1.customerservice.repository;

import com.p1.customerservice.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ICustomerRepository extends ReactiveMongoRepository<Customer,String> {

    Mono<Customer> findByNroDocument (String nroDocument);

}
