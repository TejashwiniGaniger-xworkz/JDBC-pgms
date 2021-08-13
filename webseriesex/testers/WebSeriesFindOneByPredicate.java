package com.xworkz.webseriesex.testers;

import java.util.Optional;

import com.xworkz.webseriesex.WebSeriesDTO;
import com.xworkz.webseriesex.dao.WebSeriesDAO;
import com.xworkz.webseriesex.dao.WebSeriesDAOImpl;

public class WebSeriesFindOneByPredicate {

	public static void main(String[] args) {
		WebSeriesDAO dao = new WebSeriesDAOImpl();
		Optional<WebSeriesDTO> opt = dao.findone((a)->a.getW_name().equals("Friends"));
		if(opt.isPresent()) {
			WebSeriesDTO dto = opt.get();
			System.out.println(dto);


	}

}
}