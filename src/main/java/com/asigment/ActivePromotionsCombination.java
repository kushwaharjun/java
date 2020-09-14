package com.asigment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ActivePromotionsCombination {
	Map<String, String> getActivePromotionsCombination() {
		Map<String, String> activePromotionsCombinationMap = new HashMap<>();
		char cd[] = "CD".toCharArray();
		Arrays.sort(cd);
		activePromotionsCombinationMap.put("C", new String(cd));
		activePromotionsCombinationMap.put("D", new String(cd));
		return activePromotionsCombinationMap;
	}

}
