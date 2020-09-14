package com.asigment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class ActivePromotions {
	class NFixedSKUPair {
		int a;
		int b;

		public NFixedSKUPair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	Map<String, NFixedSKUPair> getActivePromotions() {
		Map<String, NFixedSKUPair> activePromotionsMap = new HashMap<>();
		activePromotionsMap.put("A", new NFixedSKUPair(3, 130));
		activePromotionsMap.put("B", new NFixedSKUPair(2, 45));
		char cd[] = "CD".toCharArray();
		Arrays.sort(cd);
		activePromotionsMap.put(new String(cd), new NFixedSKUPair(1, 30));

		return activePromotionsMap;
	}
}
