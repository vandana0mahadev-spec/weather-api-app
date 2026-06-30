package com.example.demo.dto;

import java.util.List;

public class OpenWeatherResponse {
	private String name;
	private OpenWeatherMain main;
	private List<OpenWeatherWeather> weather;
	private OpenWeatherWind wind;
	private OpenWeatherSys sys;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OpenWeatherMain getMain() {
		return main;
	}

	public void setMain(OpenWeatherMain main) {
		this.main = main;
	}

	public List<OpenWeatherWeather> getWeather() {
		return weather;
	}

	public void setWeather(List<OpenWeatherWeather> weather) {
		this.weather = weather;
	}

	public OpenWeatherWind getWind() {
		return wind;
	}

	public void setWind(OpenWeatherWind wind) {
		this.wind = wind;
	}

	public OpenWeatherSys getSys() {
		return sys;
	}

	public void setSys(OpenWeatherSys sys) {
		this.sys = sys;
	}
}