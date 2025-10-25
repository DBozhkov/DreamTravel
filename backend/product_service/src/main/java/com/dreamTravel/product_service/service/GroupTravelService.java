package com.dreamTravel.product_service.service;

import com.dreamTravel.product_service.entity.TravelOffer;
import java.util.List;

public interface GroupTravelService {
    TravelOffer createTravelOffer(TravelOffer travelOffer);
    TravelOffer getTravelOfferById(Long id);
    List<TravelOffer> getAllTravelOffers();
    TravelOffer updateTravelOffer(Long id, TravelOffer travelOffer);
    void deleteTravelOffer(Long id);
}
