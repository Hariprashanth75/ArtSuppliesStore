package com.ArtSuppliesStore.ArtSuppliesStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ArtSuppliesStore.ArtSuppliesStore.entity.Art;

@Repository
public interface ArtRepository extends JpaRepository<Art, Integer> {

}
