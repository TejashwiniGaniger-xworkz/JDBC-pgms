package com.xworkz.customerex.testers;

import com.xworkz.customerex.dao.CustomerDAO;
import com.xworkz.customerex.dao.CustomerDAOImpl;
import com.xworkz.customerex.service.CustomerService;
import com.xworkz.customerex.service.CustomerServiceImpl;

public class CustomerFindAll {

	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAOImpl();
		CustomerService service = new CustomerServiceImpl();
		service.findAll();
		System.out.println(dao.findAll());

	}

}