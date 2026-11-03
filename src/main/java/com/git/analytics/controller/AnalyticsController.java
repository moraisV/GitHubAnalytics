package com.git.analytics.controller;

import com.git.analytics.dto.GitHubUserResponse;
import com.git.analytics.service.AnalyticsService;
import com.git.analytics.dto.AnalyticsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    private final AnalyticsService analyticsService;

    public AnalyticsController(AnalyticsService analyticsService) {
        this.analyticsService = analyticsService;
    }

    @GetMapping("/{username}")
    public ResponseEntity<AnalyticsResponse> getAnalytics(
            @PathVariable String username) {

        AnalyticsResponse analytics = analyticsService.getAnalytics(username);

        return ResponseEntity.ok(analytics);
    }
}