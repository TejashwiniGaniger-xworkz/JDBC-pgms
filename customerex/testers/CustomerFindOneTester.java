package com.xworkz.customerex.testers;

import java.util.Optional;

import com.xworkz.customerex.CustomerDTO;
import com.xworkz.customerex.dao.CustomerDAO;
import com.xworkz.customerex.dao.CustomerDAOImpl;

public class CustomerFindOneTester {

	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAOImpl();
		Optional<CustomerDTO> opt = dao.findOne((a) ->a.getName().equals("Teju"));
		if (opt.isPresent()) {
			CustomerDTO dto = opt.get();
			System.out.println(dto);
		}
	}
}