package com.packet.cardatabase.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {
	// Fetch cars by brand
	List<Car> findByBrand(@Param("brand") String brand);
	// Fetch cars by color
	List<Car> findByColor(@Param("color") String color);
}

/*
 * GET http://localhost:8081/api/cars/search
 * GET http://localhost:8080/api/cars/search/findByBrand?brand=Ford
 */
