package com.xworkz.webseriesex.testers;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.webseriesex.WebSeriesDTO;
import com.xworkz.webseriesex.dao.WebSeriesDAO;
import com.xworkz.webseriesex.dao.WebSeriesDAOImpl;

public class WebSeriesSaveAllCollectionTester {

	public static void main(String[] args) {
		Collection<WebSeriesDTO> dto = new ArrayList<WebSeriesDTO>();
		WebSeriesDAO dao = new WebSeriesDAOImpl();
		System.out.println(dao.saveAll(dto));

	}

}