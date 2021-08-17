package com.xworkz.customerex.testers;

import com.xworkz.customerex.CustomerDTO;
import com.xworkz.customerex.Education;
import com.xworkz.customerex.dao.CustomerDAO;
import com.xworkz.customerex.dao.CustomerDAOImpl;
import com.xworkz.customerex.service.CustomerService;
import com.xworkz.customerex.service.CustomerServiceImpl;

public class CustomerInsertTester {

	public static void main(String[] args) {
		CustomerDTO cust = new CustomerDTO("Teju","Bagalkot","Bangalore","BasaveshwarNagar",false,12345667,Education.BE);
		CustomerDTO cust1 = new CustomerDTO("Sahana","Tumkur","Bangalore","RajajiNagar",false,12345668,Education.BE);
		CustomerDTO cust2 = new CustomerDTO("Anusha","Chennai","Bengal","Yelahanka",false,123456679,Education.MTECH);
		CustomerDTO cust3 = new CustomerDTO("Rakshita","Bangalore","Bagalkot","RTNagar",false,1234566785,Education.MBA);
		
		CustomerDAO dao = new CustomerDAOImpl();
		CustomerService service = new CustomerServiceImpl();
		String save = service.validAndSave(cust3);
		System.out.println(save);
		String save1 = service.validAndSave(cust2);
		System.out.println(save1);
		String save2 = service.validAndSave(cust1);
		System.out.println(save2);
		String save3 = service.validAndSave(cust);
		System.out.println(save3);
		 dao.save(cust3);
		 dao.save(cust2);
		 dao.save(cust1);
		 dao.save(cust);
		 
		
	}

}
