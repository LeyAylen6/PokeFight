package com.example.demo.repository;

import com.example.demo.models.domains.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type,Integer> {

    Optional<Type> findByName(String name);
}
