package com.example.apibirds.repository;

import com.example.apibirds.models.Bird;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirdRepository extends JpaRepository<Bird, Long> {

    Bird findById(long id);
    Bird deleteById(long id);

}
