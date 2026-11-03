package com.git.analytics.service;

import com.git.analytics.client.GitHubClient;
import com.git.analytics.dto.GitHubUserResponse;
import org.springframework.stereotype.Service;

@Service
public class AnalyticsService {

    private final GitHubClient gitHubClient;

    public AnalyticsService(GitHubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }

    public GitHubUserResponse getUser(String username){
        return gitHubClient.getUser(username);
    }

}