package org.tower.dao.fileio;

import java.util.ArrayList;
import java.util.List;

import org.tower.dao.domain.Buyer;

public class CacheBuyers {
	private static List<Buyer> buyers;
	
	public static List<Buyer> getBuyers() {
		if (buyers != null)
			return buyers;
		
		buyers = new ArrayList<Buyer>();
		// parse config and populate tax list
		return buyers;
	}
	
	public static void addBuyer() {
		
	}
	
	public static void editBuyer() {
		
	}
}
