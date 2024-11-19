package com.westeros.moviesclient;

import org.springframework.beans.factory.annotation.Value;

public class MoviesClientUriBuilderProvider implements IMoviesClientUriBuilderProvider {
    private final String apiKey;
    private final String host;
    private final int apiVersion;

    /**
     * adnotacja @Value służy do odczytywania wartości z pliku application.properties
     * docs. https://www.baeldung.com/spring-value-annotation
     * @param apiKey
     * @param host
     * @param apiVersion
     */
    public MoviesClientUriBuilderProvider(
            String apiKey,
            String host,
            @Value("${themoviedb.api.version}") int apiVersion) {

        this.apiKey = apiKey;
        this.host = host;
        this.apiVersion = apiVersion;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getHost() {
        return host;
    }

    @Override
    public int getApiVersion() {
        return apiVersion;
    }
}
