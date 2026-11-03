package com.git.analytics.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public record GitHubRepoResponse(
    String name,
    String description,
    String language,
    @JsonProperty("stargazers_count") int stars,
    @JsonProperty("forks_count") int forks,
    @JsonProperty("html_url") String url,
    boolean fork
){}