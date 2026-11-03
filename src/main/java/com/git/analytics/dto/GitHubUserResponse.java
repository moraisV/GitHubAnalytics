package com.git.analytics.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GitHubUserResponse(

        //JsonProperty: mapeia um objeto JSON a uma variavel de sua escolha. Quando o JSON Key tem o mesmo nome que sua variavel, nao precisa da annotation! Apenas quando eles diferem.
        //Para verificar o UserResponse que vou receber, pode acessar o endpoint do Git: https://api.github.com/users/<meuUser>
        String login,
        String name,
        String bio,
        int followers,
        @JsonProperty("avatar_url") String avatarUrl,
        @JsonProperty("public_repos") int publicRepos
) {}