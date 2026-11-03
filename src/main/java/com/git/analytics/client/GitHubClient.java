package com.git.analytics.client;

import com.git.analytics.dto.GitHubUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

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

}


// @GetMapping("/{username}")
