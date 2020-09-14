package com.asigment;

import java.util.HashMap;
import java.util.Map;

public class UnitSKUFixedpriceData {
	Map<String, Integer> getUnitSKUFixedpriceData() {
		Map<String, Integer> unitSKUMap = new HashMap<>();
		unitSKUMap.put("A", 50);
		unitSKUMap.put("B", 30);
		unitSKUMap.put("C", 20);
		unitSKUMap.put("D", 15);
		return unitSKUMap;
	}
}
