package com.asigment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class CalculatePrice {
	int result=0;
	int checkOutProcesses(Map<String, Integer> scenario) {
		List<Map.Entry<String, Integer>> entryList=new ArrayList<Entry<String, Integer>>(scenario.entrySet());
		while(scenario.size()>0) {
			scenario=calculatePrice(scenario,entryList);
		}
		int temp=result;
		result=0;
		return temp;
	}

	Map<String, Integer>  calculatePrice(Map<String, Integer> scenario,List<Map.Entry<String, Integer>> entryList) {
		Map.Entry<String, Integer> entry=entryList.get(0);
		Map<String, Integer> unitSKUMap = new UnitSKUFixedpriceData().getUnitSKUFixedpriceData();
		Map<String, ActivePromotions.NFixedSKUPair> activePromotions=new ActivePromotions().getActivePromotions();
		Map<String, String> activePromotionsCombinationMap ;
		int i=entry.getValue();
			
				if (activePromotions.containsKey(entry.getKey())) {
					while (i > 0) {
						if (activePromotions.get(entry.getKey()).a <= i) {
							result += activePromotions.get(entry.getKey()).b;
							i = i - activePromotions.get(entry.getKey()).a;
							if (i == 0) {
								scenario.remove(entry.getKey());
								entryList.remove(0);
							}
						} else {
							result += i * unitSKUMap.get(entry.getKey());
							i = 0;
							scenario.remove(entry.getKey());
							entryList.remove(0);

						}
					}

				} else {
					activePromotionsCombinationMap =new  ActivePromotionsCombination().getActivePromotionsCombination();
					PromotionHelper promotionHelper=new PromotionHelper();
					if (activePromotionsCombinationMap.containsKey(entry.getKey())) {
						String key = activePromotionsCombinationMap.get(entry.getKey());
						  boolean isActivePromotionsAvailableInInputMap=promotionHelper.isActivePromotionsAvailableInInputMap(key,scenario);
						  if(isActivePromotionsAvailableInInputMap) {
							  
							  Model model=promotionHelper.scenarioremoveKeyFromInputMap(scenario,key,activePromotions,result);
							  scenario=model.getScenario();
							  result=model.getResult();
							  entryList=new ArrayList<Entry<String, Integer>>(scenario.entrySet());
						  }else {
							  result += i * unitSKUMap.get(entry.getKey());
								i = 0;
								scenario.remove(entry.getKey());
								entryList.remove(0);
						  }

					} else {
						result += i * unitSKUMap.get(entry.getKey());
						i = 0;
						scenario.remove(entry.getKey());
						entryList.remove(0);
					}

				}
				
		
		return scenario;
	}

}
