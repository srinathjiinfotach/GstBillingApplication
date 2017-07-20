package org.tower.dao.fileio;

import java.util.ArrayList;
import java.util.List;

import org.tower.dao.domain.Tax;

public class SetupTax {
	private static List<Tax> taxes;
	
	public static List<Tax> setupTax() {
		if (taxes != null)
			return taxes;
		
		taxes = new ArrayList<Tax>();
		// parse config and populate tax list
		return taxes;
	}
}
