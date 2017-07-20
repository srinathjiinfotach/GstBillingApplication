package org.tower.dao.domain;

import java.util.List;

public class Invoice {
	public String uid;
	public String date;
	public String transportationMode;
	public String vehicleNumber;
	public String dateTimeSupply;
	public String placeSupply;
	
	public Buyer buyer;
	public List<Article> articles;
	public List<Tax> taxes;
}
