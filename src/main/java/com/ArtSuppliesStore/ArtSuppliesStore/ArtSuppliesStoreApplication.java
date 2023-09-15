package com.ArtSuppliesStore.ArtSuppliesStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ArtSuppliesStore.ArtSuppliesStore.controller"})
@ComponentScan({"com.ArtSuppliesStore.ArtSuppliesStore.entity"})
@ComponentScan({"com.ArtSuppliesStore.ArtSuppliesStore.repository"})
@ComponentScan({"com.ArtSuppliesStore.ArtSuppliesStore.service"})
public class ArtSuppliesStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtSuppliesStoreApplication.class, args);
	}

}
