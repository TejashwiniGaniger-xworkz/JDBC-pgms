package com.xworkz.restaurantex.dao;

import java.util.Collection;

import com.xworkz.restaurantex.dto.RestaurantDTO;
import com.xworkz.restaurantex.dto.RestaurantType;

public interface RestaurantDAO {

	int save(RestaurantDTO dto);

	RestaurantDTO findByName(String name);

	Collection<RestaurantDTO> findByType(RestaurantType type);

	default boolean updateTypeByName(RestaurantType newtype, String name) {

		return false;
	}

	default boolean deleteByTypeAndName(RestaurantType newtype, String name) {
		return false;
	}
}
