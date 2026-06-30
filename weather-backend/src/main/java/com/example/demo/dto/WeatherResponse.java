package com.example.demo.dto;

public class WeatherResponse {
	private String city;
	private Double temperature;
	private String description;
	private Integer humidity;
	private Double windSpeed;
	private Double feelsLike;
	private String country;
	private boolean cached;

	public WeatherResponse() {
	}

	public WeatherResponse(String city, Double temperature, String description, Integer humidity,
			Double windSpeed, Double feelsLike, String country, boolean cached) {
		this.city = city;
		this.temperature = temperature;
		this.description = description;
		this.humidity = humidity;
		this.windSpeed = windSpeed;
		this.feelsLike = feelsLike;
		this.country = country;
		this.cached = cached;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Double getFeelsLike() {
		return feelsLike;
	}

	public void setFeelsLike(Double feelsLike) {
		this.feelsLike = feelsLike;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isCached() {
		return cached;
	}

	public void setCached(boolean cached) {
		this.cached = cached;
	}
}