package com.git.analytics.client;

import com.git.analytics.dto.GitHubUserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = {
        "spring.autoconfigure.exclude=org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration"
})
class GitHubClientTest {

    @Autowired
    private GitHubClient gitHubClient;

    @Test
    void shouldFetchGitHubUser() {
        GitHubUserResponse user = gitHubClient.getUser("octocat");

        assertNotNull(user);
        assertEquals("octocat", user.login());
    }
}