package com.onetomany.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany.example.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
