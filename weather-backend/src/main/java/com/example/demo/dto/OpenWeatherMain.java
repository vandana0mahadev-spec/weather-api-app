package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenWeatherMain {
	private Double temp;

	@JsonProperty("feels_like")
	private Double feelsLike;

	private Integer humidity;

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getFeelsLike() {
		return feelsLike;
	}

	public void setFeelsLike(Double feelsLike) {
		this.feelsLike = feelsLike;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
}