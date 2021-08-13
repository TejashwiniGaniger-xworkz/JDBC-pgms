package com.xworkz.webseriesex.testers;

import java.util.Collection;

import com.xworkz.webseriesex.WebSeriesDTO;
import com.xworkz.webseriesex.dao.WebSeriesDAO;
import com.xworkz.webseriesex.dao.WebSeriesDAOImpl;

public class WebSeriesFindAllByPredicate {

	public static void main(String[] args) {

		WebSeriesDAO dao = new WebSeriesDAOImpl();
		Collection<WebSeriesDTO> collection = dao.findall();
		System.out.println(collection);

	}

}