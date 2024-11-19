package com.westeros.moviesclient;

import com.westeros.moviesclient.contract.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

public class MoviesClient implements IMoviesClient {

    RestTemplate restClient;

    IMoviesClientUriBuilderProvider provider;
    public MoviesClient(IMoviesClientUriBuilderProvider provider) {
        restClient = new RestTemplate();
        this.provider=provider;
    }

    @Override
    public PagedResultDto getByDateRange(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public PagedResultDto getByDateRange(LocalDate from, LocalDate to, int page) {
        return null;
    }

    @Override
    public MovieDto getMovie(int id) {
        String url = provider.builder()
                .pathSegment("movie")
                .pathSegment(""+id)
                .build()
                .toUriString();
        var response = restClient.getForEntity(url, MovieDto.class).getBody();
        return response;
    }

    @Override
    public CreditsDto getCredits(int id) {
        return null;
    }

    @Override
    public ActorDto getActorDetails(int id) {
        return null;
    }
}
