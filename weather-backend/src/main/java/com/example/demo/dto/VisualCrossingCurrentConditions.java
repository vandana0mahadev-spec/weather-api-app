package com.example.demo.dto;

public class VisualCrossingCurrentConditions {

	private Double temp;
	private Double feelslike;
	private Double humidity;
	private Double windspeed;
	private String conditions;

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getFeelslike() {
		return feelslike;
	}

	public void setFeelslike(Double feelslike) {
		this.feelslike = feelslike;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public Double getWindspeed() {
		return windspeed;
	}

	public void setWindspeed(Double windspeed) {
		this.windspeed = windspeed;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
}