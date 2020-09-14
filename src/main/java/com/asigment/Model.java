package com.asigment;

import java.util.Map;

public class Model {
	private Map<String, Integer> scenario;
	private int result;
	public Map<String, Integer> getScenario() {
		return scenario;
	}
	public void setScenario(Map<String, Integer> scenario) {
		this.scenario = scenario;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Model(Map<String, Integer> scenario, int result) {
		super();
		this.scenario = scenario;
		this.result = result;
	}
	
}
