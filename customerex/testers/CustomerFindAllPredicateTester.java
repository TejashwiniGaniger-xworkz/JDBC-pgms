package com.xworkz.customerex.testers;

import java.util.Collection;

import com.xworkz.customerex.CustomerDTO;
import com.xworkz.customerex.dao.CustomerDAO;
import com.xworkz.customerex.dao.CustomerDAOImpl;

public class CustomerFindAllPredicateTester {

	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAOImpl();
		Collection<CustomerDTO> col = dao.findAll(n -> n.getName().equals("Sahana"));
		col.forEach(k -> System.out.println(k));

	}

}