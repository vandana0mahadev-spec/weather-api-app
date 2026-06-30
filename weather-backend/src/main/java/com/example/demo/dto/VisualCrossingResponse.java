package com.example.demo.dto;

public class VisualCrossingResponse {

	private String resolvedAddress;
	private String address;
	private VisualCrossingCurrentConditions currentConditions;

	public String getResolvedAddress() {
		return resolvedAddress;
	}

	public void setResolvedAddress(String resolvedAddress) {
		this.resolvedAddress = resolvedAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public VisualCrossingCurrentConditions getCurrentConditions() {
		return currentConditions;
	}

	public void setCurrentConditions(VisualCrossingCurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}
}