package com.devsuperior.uri2602.repositories;

import com.devsuperior.uri2602.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
