package com.xworkz.webseriesex.testers;

import com.xworkz.webseriesex.dao.WebSeriesDAO;
import com.xworkz.webseriesex.dao.WebSeriesDAOImpl;

public class WebSeriesCounterTester {

	public static void main(String[] args) {
		WebSeriesDAO dao = new WebSeriesDAOImpl();
		System.out.println(dao.total());

	}

}