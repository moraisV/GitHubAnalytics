package com.git.analytics.dto;

public record AnalyticsResponse(
        String username,
        String displayName,
        String avatarUrl,
        int followers,
        int repositoryCount
) {}