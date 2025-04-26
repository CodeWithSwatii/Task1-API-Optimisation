package com.example.containerplacement.service;

import com.example.containerplacement.model.Container;
import com.example.containerplacement.model.YardSlot;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlacementService {

    private static final int INVALID = 10_000;

    public Map<String, Object> pickBestSpot(Container container, List<YardSlot> yardMap) {
        int minScore = Integer.MAX_VALUE;
        YardSlot bestSlot = null;

        for (YardSlot slot : yardMap) {
            int score = calculateScore(container, slot);

            if (score < minScore) {
                minScore = score;
                bestSlot = slot;
            }
        }

        Map<String, Object> response = new HashMap<>();
        if (minScore >= INVALID) {
            response.put("error", "no suitable slot");
        } else {
            response.put("containerId", container.getId());
            response.put("targetX", bestSlot.getX());
            response.put("targetY", bestSlot.getY());
        }
        return response;
    }

    private int calculateScore(Container container, YardSlot slot) {
        int distance = Math.abs(container.getX() - slot.getX()) + Math.abs(container.getY() - slot.getY());

        int sizePenalty = fits(container.getSize(), slot.getSizeCap()) ? 0 : INVALID;
        int coldPenalty = (container.isNeedsCold() && !slot.isHasColdUnit()) ? INVALID : 0;
        int occupiedPenalty = slot.isOccupied() ? INVALID : 0;

        return distance + sizePenalty + coldPenalty + occupiedPenalty;
    }

    private boolean fits(String containerSize, String slotSizeCap) {
        if (containerSize.equalsIgnoreCase("small")) {
            return true; // small fits in small or big
        } else {
            return slotSizeCap.equalsIgnoreCase("big"); // big must fit only in big
        }
    }
}
