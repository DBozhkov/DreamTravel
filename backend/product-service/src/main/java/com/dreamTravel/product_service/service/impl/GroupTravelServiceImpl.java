package com.dreamTravel.product_service.service.impl;

import com.dreamTravel.product_service.entity.TravelOffer;
import com.dreamTravel.product_service.repository.TravelOfferRepository;
import com.dreamTravel.product_service.service.GroupTravelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GroupTravelServiceImpl implements GroupTravelService {
    private TravelOfferRepository travelOfferRepository;

    @Override
    public TravelOffer createTravelOffer(TravelOffer travelOffer) {
        return travelOfferRepository.save(travelOffer);
    }

    @Override
    public TravelOffer getTravelOfferById(Long id) {
        Optional<TravelOffer> optionalTravelOffer = travelOfferRepository.findById(id);
        return optionalTravelOffer.orElse(null);
    }

    @Override
    public List<TravelOffer> getAllTravelOffers() {
        return travelOfferRepository.findAll();
    }

    @Override
    public TravelOffer updateTravelOffer(Long id, TravelOffer travelOffer) {
        if (travelOfferRepository.existsById(id)) {
            travelOffer.setId(id);
            return travelOfferRepository.save(travelOffer);
        }
        return null;
    }

    @Override
    public void deleteTravelOffer(Long id) {
        travelOfferRepository.deleteById(id);
    }
}
