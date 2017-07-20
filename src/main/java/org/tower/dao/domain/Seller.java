package org.tower.dao.domain;

public class Seller extends Company {
	public String bankAccNo;
	public String bankIFSC;
	public String logoURI;
	public String email;
	public String website;
	public String tnc;
	public String contact;
	
	private static Seller seller;
	
	private Seller() {
	}
	
	public static Seller getSeller() {
		if (seller == null)
			// check if config file (hardcode) exists
			// NO - create template and ask to fill details
			// YES - parse and populate seller object
			seller = new Seller();
		
		return seller;
	}
}
