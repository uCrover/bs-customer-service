package com.p1.customerservice.service;

import com.p1.customerservice.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceCustomer {
    public Flux<Customer> findAll();
    public Mono<Customer> findById(String id);
    public Mono<Customer> save(Customer psc);
    public Mono<Customer> update(Customer psc);
    public void delete(String id);
    public Mono<Customer> findByNumDoc(String numDoc);

}
