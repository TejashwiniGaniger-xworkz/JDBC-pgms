package com.xworkz.scamexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ScamInsertTester {

	public static void main(String[] args) {
		String username = "root";
		String password = "Tejashwini@123";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection connection = null;
		try {
			Class.forName(fqnOfDriverImpl);
	        connection = DriverManager.getConnection(url, username,password);
	        Statement statement = connection.createStatement();
	      String scam = "insert into scam values(1,'Karvy','Stock Broking','2020-11-22',' Karvy',200,'Hydrebad','On November 22')";

	     String scam1 = "insert into scam values(2,'PNB','jeweller','1969-7-19','PNB',113,'Mumbai','The PNB fraudulent letter')";
	     			 String scam2 = "insert into scam values(3,'DHFL','Fake lending','2018-6-22','DHFL',140,'Banglore',' DHFL Directors 14,000 Under')";
	     			String scam3 = "insert into scam values(10,'Reruitmentscam','Reciting','2021-2-28','Purohit',2000,'Delhi','Input received ')";
	     			//String scam4 = "insert into scam values(4,'KeralaGoldSmuggling','GoldSmuggling','2020-6-22','Kerala govt',10000,'Kerala','Customer official at airport')";
	     			//String scam5 = "insert into scam values(5,'TRP scam','TRP','2020-11-10','national tv',10000,'Mumbai','Files Charge National Republic tv')";
	     		//	String scam6 = "insert into scam values(6,'Roshini land Scam','Land scam','2020-11-4','Roshini',25000,'JammuKashmir','Accuried  homless of J&K')";
	     			//String scam7 = "insert into scam values(7,'Amarapali Adya scam','Trading Scam','2019=8-2','Amrapali',200000,'India','It fraud investors')";
	     		//	String scam8 = "insert into scam values(8,'SandalWoodDrugScam','Drug scam','2019-9-5','KannadaCinemaIndustry',100,'Karnata','Kannada Film indystry segment')";
	     			//String scam11 = "Insert into scam values(11,'PNB scam','Abdcanded Scam','2016-8-12','VijayMalya',900,'Banglore','Anscond by taking loan')";

	     			//statement.execute(scam11);
	     		//	statement.execute(scam8);
	     			//statement.execute(scam7);
	     			//statement.execute(scam6);
	     			//statement.execute(scam5);
	     			//statement.execute(scam4);
	     			 statement.execute(scam);
	     			 statement.execute(scam1);
	     			 statement.execute(scam2);
	     			 statement.execute(scam3);
	     			System.out.println(connection);
	     		} catch (SQLException e) {
	     			e.printStackTrace();
	     		} catch (ClassNotFoundException e) {
	     			e.printStackTrace();
	     		}
	     	}

	     }