package org.example.weatherapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String baseUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    @Cacheable(value = "getWeather", key = "#city")
    public String getWeather(String city) {
        String url = String.format("%s/%s?unitGroup=metric&key=%s&contentType=json", baseUrl, city, apiKey);
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            return response.getBody();
        }catch (Exception e) {
            throw new RuntimeException("Error while fetching weather data " + e.getMessage());
        }
    }
}
