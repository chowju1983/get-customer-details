package com.practice.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.customer.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
