package com.xworkz.restaurantex.dto;

import java.util.Collection;

import com.xworkz.restaurantex.dao.RestaurantDAO;
import com.xworkz.restaurantex.dao.RestaurantDAOImpl;

public class RestaurantTester {

	public static void main(String[] args) {
		RestaurantDTO dto = new RestaurantDTO("Navya Bar and Restaurant", "Basaveshwar Nagar", "Parota", false,
				RestaurantType.DINNER);
		RestaurantDAO dao = new RestaurantDAOImpl();
		System.out.println(dto);
		dao.save(dto);

		RestaurantDTO dto1 = new RestaurantDTO("Jetlag", "Bangalore", "Dosa", true, RestaurantType.CAFE, 1);
		RestaurantDAO dao1 = new RestaurantDAOImpl();
		dao1.save(dto1);
		System.out.println(dto1);

		Collection<RestaurantDTO> collection = dao.findByType(RestaurantType.DINNER);
		collection.forEach(ref -> System.out.println(ref));

		System.out.println(dao.updateTypeByName(RestaurantType.CAFE, "Andhra Gunpowder"));

		System.out.println(dao.deleteByTypeAndName(RestaurantType.CAFE, "JetLag"));

	}

}
