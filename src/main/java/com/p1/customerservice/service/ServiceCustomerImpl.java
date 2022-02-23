package com.p1.customerservice.service;

import com.p1.customerservice.model.Customer;
import com.p1.customerservice.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class ServiceCustomerImpl implements ServiceCustomer {

    private final ICustomerRepository repository;

    @Override
    public Flux<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Customer> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Customer> save(Customer customer) {
        String tipoCliente=customer.getNroDocument();
        Integer digiOFND = tipoCliente.length();
        switch (digiOFND){
            case 8:
                tipoCliente ="P";
                break;
            case 11:
                tipoCliente ="E";
                break;
        }
        customer.setType(tipoCliente);


        return repository.save(customer);
    }

    @Override
    public Mono<Customer> update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();

    }

    @Override
    public Mono<Customer> findByNumDoc(String numDoc) {
        return this.repository.findByNroDocument(numDoc);
    }
}