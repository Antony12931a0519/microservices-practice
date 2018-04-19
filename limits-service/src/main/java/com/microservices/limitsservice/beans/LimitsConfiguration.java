package com.microservices.limitsservice.beans;

public class LimitsConfiguration {
	
	private int maxmium;
	private int minimum;
	
	
	public LimitsConfiguration(int maxmium, int minimum) {
		super();
		this.maxmium = maxmium;
		this.minimum = minimum;
	}
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaxmium() {
		return maxmium;
	}
	public void setMaxmium(int maxmium) {
		this.maxmium = maxmium;
	}
	
	

}
