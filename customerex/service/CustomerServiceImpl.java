package com.xworkz.customerex.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.customerex.CustomerDTO;
import com.xworkz.customerex.dao.CustomerDAO;
import com.xworkz.customerex.dao.CustomerDAOImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao = new CustomerDAOImpl();

	@Override
	public String validAndSave(CustomerDTO dto) {
		CustomerDAO dao = new CustomerDAOImpl();
       
		boolean nameValidate = false;
		boolean educationValidate = false;
		boolean tovalidate = false;

		String name = dto.getName();
		if (dto != null) {
			System.out.println("DTO is not null,Start Validation");
			if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
				System.out.println("Name is Valid");
				nameValidate = true;

			} else {
				System.out.println("Name is not valid");
				nameValidate = false;
			}
			String education = dto.getEducation().toString();
			if (education != null && !education.isEmpty()) {
				System.out.println("Education is valid");
				educationValidate = true;
			} else {
				System.out.println("Education is Not valid");
				nameValidate = false;
			}
			String toAdress = dto.getTo();
			if (toAdress != null && !toAdress.isEmpty() && toAdress.length() > 5 && toAdress.length() <= 50) {
				System.out.println("Adress is valid");
				tovalidate = true;
			} else {
				System.out.println("Adress is NotValid");
				tovalidate = false;
			}
			dao.save(dto);
			
			
			return "Sucess";
		}

		return "Failure";
	}

	@Override
	public void ValidateAndSaveAll(Collection<CustomerDTO> collection) {
			dao.saveAll(collection);
	}


	@Override
	public Optional<CustomerDTO> findOne(Predicate<CustomerDTO> predicate) {
		return dao.findOne(predicate);
	}

	@Override
	public Collection<CustomerDTO> findAll() {
		return dao.findAll();
	}

	@Override
	public Collection<CustomerDTO> findAll(Predicate<CustomerDTO> predicate) {
		return dao.findAll(predicate);
	}

	@Override
	public int total() {
		return dao.total();
	}

	@Override
	public Collection<CustomerDTO> findAllSortByNameDesc() {
		return dao.findAllSortByNameDesc();
	}

}