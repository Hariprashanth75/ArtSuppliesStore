package com.ArtSuppliesStore.ArtSuppliesStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ArtSuppliesStore.ArtSuppliesStore.entity.MyArtList;

@Repository
public interface MyArtRepository extends JpaRepository<MyArtList, Integer> {
	
	

}
