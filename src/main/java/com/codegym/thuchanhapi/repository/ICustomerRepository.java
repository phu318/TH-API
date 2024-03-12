package com.codegym.thuchanhapi.repository;

import com.codegym.thuchanhapi.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
