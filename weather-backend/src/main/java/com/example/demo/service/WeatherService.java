package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.VisualCrossingCurrentConditions;
import com.example.demo.dto.VisualCrossingResponse;
import com.example.demo.dto.WeatherResponse;
import com.example.demo.exception.WeatherServiceException;

@Service
public class WeatherService {

	private final RestTemplate restTemplate;

	@Value("${weather.api.key}")
	private String apiKey;

	@Value("${weather.api.url}")
	private String apiUrl;

	public WeatherService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public WeatherResponse getWeather(String city) {
		if (city == null || city.trim().isEmpty()) {
			throw new WeatherServiceException("City is required.");
		}

		String requestUrl = apiUrl
				+ "/" + city.trim()
				+ "?include=current&unitGroup=metric&key=" + apiKey
				+ "&contentType=json";
		System.out.println("Request URL: " + requestUrl);

		try {
			VisualCrossingResponse apiResponse =
					restTemplate.getForObject(requestUrl, VisualCrossingResponse.class);

			if (apiResponse == null) {
				throw new WeatherServiceException("API response is null");
			}

			if (apiResponse.getCurrentConditions() == null) {
				throw new WeatherServiceException("currentConditions is null");
			}

			VisualCrossingCurrentConditions current = apiResponse.getCurrentConditions();

			WeatherResponse response = new WeatherResponse();
			response.setCity(apiResponse.getResolvedAddress());
			response.setTemperature(current.getTemp());
			response.setDescription(current.getConditions());
			response.setHumidity(current.getHumidity() != null ? current.getHumidity().intValue() : null);
			response.setFeelsLike(current.getFeelslike());
			response.setWindSpeed(current.getWindspeed());
			response.setCountry(null);
			response.setCached(false);

			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw new WeatherServiceException("Failed to fetch weather for city: " + city, e);
		}
	}
}