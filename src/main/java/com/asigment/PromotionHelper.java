package com.asigment;

import java.util.Arrays;
import java.util.Map;

import com.asigment.ActivePromotions.NFixedSKUPair;
public class PromotionHelper {
	String getSortedString(String s) {
		char c[] = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	Model model=new Model(null,0);
	Model scenarioremoveKeyFromInputMap(Map<String, Integer> scenario, String str,Map<String, NFixedSKUPair> activePrommotions,int result){
		boolean stillRemain=true;
		int i=0;
		while(i<str.length()) {
			if(scenario.get(str.charAt(i)+"")==1) {
				stillRemain=false;
			scenario.remove(str.charAt(i)+"");
			i++;
			}else {
				scenario.put(str.charAt(i)+"", scenario.get(str.charAt(i)+"")-1);
				i++;
			}
			
		}
		i=0;
		result+=activePrommotions.get(str).b;
		model.setResult(result);
		model.setScenario(scenario);
		if(stillRemain) {
			model=scenarioremoveKeyFromInputMap(scenario,str,activePrommotions,result);
			
		}
		return model;
	}
	boolean isActivePromotionsAvailableInInputMap(String str,Map<String, Integer> scenario) {
		boolean isAvail=true;
		int i=0;
		while(str.length()>i) {
			if(!scenario.containsKey(str.charAt(i)+"")) {
				isAvail=false;
				break;
			}
			
			i++;
		}
		return isAvail;
	}


}
