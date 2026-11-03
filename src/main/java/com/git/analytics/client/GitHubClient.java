package com.git.analytics.client;

import com.git.analytics.dto.GitHubUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import com.git.analytics.dto.GitHubRepoResponse;
import java.util.List;
import java.util.Arrays;

@Component
public class GitHubClient {

    RestClient restClient = RestClient.builder()
            .baseUrl("https://api.github.com")
            .build();;

    public GitHubUserResponse getUser(String username){
        return restClient.get()
                .uri("/users/{username}", username)
                .retrieve()
                .body(GitHubUserResponse.class);
    }

    public List<GitHubRepoResponse> getRepositories(String username){
        GitHubRepoResponse[] repositories = restClient.get()
                .uri("/users/{username}/repos?type=owner&per_page=100&page=1", username)
                .retrieve()
                .body(GitHubUserResponse.class[]);
        if (repositories == null) {
            return List.of();
        }

        return Arrays.asList(repositories);
    }

}
