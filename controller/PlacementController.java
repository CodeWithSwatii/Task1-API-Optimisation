package com.example.containerplacement.controller;

import com.example.containerplacement.model.PlacementRequest;
import com.example.containerplacement.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/pickSpot")
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    @PostMapping
    public Map<String, Object> pickSpot(@RequestBody PlacementRequest request) {
        return placementService.pickBestSpot(request.getContainer(), request.getYardMap());
    }
}
