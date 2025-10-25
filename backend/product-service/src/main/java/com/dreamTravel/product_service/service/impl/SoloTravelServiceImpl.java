package com.dreamTravel.product_service.service.impl;

import com.dreamTravel.product_service.service.SoloTravelService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SoloTravelServiceImpl implements SoloTravelService {

    private final WebClient webClient;

    public SoloTravelServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com").build();
    }
}
