package com.asigment;

import java.util.HashMap;
import java.util.Map;

public class PromotionEngine {
	
	
	public static void main(String[] args) {
		CalculatePrice calculatePrice=new CalculatePrice();
		Map<String, Integer> scenario_A = new HashMap<>();
		scenario_A.put("A", 1);
		scenario_A.put("B", 1);
		scenario_A.put("C", 1);
		int val_A=calculatePrice.checkOutProcesses(scenario_A);
		System.out.println(val_A);
		Map<String, Integer> scenario_B = new HashMap<>();
		scenario_B.put("A", 5);
		scenario_B.put("B", 5);
		scenario_B.put("C", 1);
		int val_B=calculatePrice.checkOutProcesses(scenario_B);
		System.out.println(val_B);
		Map<String, Integer> scenario_C = new HashMap<>();
		scenario_C.put("A", 3);
		scenario_C.put("B", 5);
		scenario_C.put("C", 1);
		scenario_C.put("D", 1);
		int val_C=calculatePrice.checkOutProcesses(scenario_C);
		System.out.println(val_C);
	}
}
