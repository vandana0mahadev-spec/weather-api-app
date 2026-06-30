package com.example.demo.service;

import java.time.Duration;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dto.WeatherResponse;

import tools.jackson.databind.ObjectMapper;

@Service
public class RedisService {

	private final StringRedisTemplate stringRedisTemplate;
	private final ObjectMapper objectMapper;

	public RedisService(StringRedisTemplate stringRedisTemplate, ObjectMapper objectMapper) {
		this.stringRedisTemplate = stringRedisTemplate;
		this.objectMapper = objectMapper;
	}

	public WeatherResponse get(String key) {
		String value = stringRedisTemplate.opsForValue().get(key);

		if (value == null) {
			return null;
		}

		try {
			return objectMapper.readValue(value, WeatherResponse.class);
		} catch (Exception e) {
			return null;
		}
	}

	public void set(String key, WeatherResponse response, long ttlMinutes) {
		try {
			String json = objectMapper.writeValueAsString(response);
			stringRedisTemplate.opsForValue().set(key, json, Duration.ofMinutes(ttlMinutes));
		} catch (Exception e) {
			throw new RuntimeException("Failed to save weather data in Redis", e);
		}
	}
}