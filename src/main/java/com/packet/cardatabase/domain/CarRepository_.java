package com.packet.cardatabase.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

/*
 *   PagingAndSortingRepository , which extendsCrudRepository
 */
public interface CarRepository_ extends PagingAndSortingRepository<Car, Long> {
	// For fetching entities using pagination and sorting
	// A good option if you are dealing with larger amounts of data
}
