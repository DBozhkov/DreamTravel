package com.dreamTravel.product_service.controller;

import com.dreamTravel.product_service.entity.TravelOffer;
import com.dreamTravel.product_service.service.GroupTravelService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/group-travel")
@AllArgsConstructor
public class GroupTravelController {
    private GroupTravelService groupTravelService;

    @PostMapping
    public ResponseEntity<TravelOffer> createTravelOffer(@RequestBody TravelOffer travelOffer) {
        TravelOffer savedTravelOffer = groupTravelService.createTravelOffer(travelOffer);
        return new ResponseEntity<>(savedTravelOffer, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TravelOffer> getTravelOfferById(@PathVariable("id") Long id) {
        TravelOffer travelOffer = groupTravelService.getTravelOfferById(id);
        return ResponseEntity.ok(travelOffer);
    }

    @GetMapping
    public ResponseEntity<List<TravelOffer>> getAllTravelOffers() {
        List<TravelOffer> travelOffers = groupTravelService.getAllTravelOffers();
        return ResponseEntity.ok(travelOffers);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TravelOffer> updateTravelOffer(@PathVariable("id") Long id, @RequestBody TravelOffer travelOffer) {
        TravelOffer updatedTravelOffer = groupTravelService.updateTravelOffer(id, travelOffer);
        return ResponseEntity.ok(updatedTravelOffer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTravelOffer(@PathVariable("id") Long id) {
        groupTravelService.deleteTravelOffer(id);
        return ResponseEntity.ok("Travel offer deleted successfully");
    }
}
