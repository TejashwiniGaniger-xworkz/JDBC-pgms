package com.xworkz.customerex.testers;

import com.xworkz.customerex.dao.CustomerDAO;
import com.xworkz.customerex.dao.CustomerDAOImpl;

public class CustomerfindAllSortByNameDesc {

	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAOImpl();
		System.out.println(dao.findAllSortByNameDesc());
	}

}