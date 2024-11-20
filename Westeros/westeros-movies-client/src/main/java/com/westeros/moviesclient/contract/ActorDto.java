package com.westeros.moviesclient.contract;

import java.time.LocalDate;

public record ActorDto(long id,
                       String name,
                       String character,
                       String profilePath,
                       String biography,
                       LocalDate birthday,
                       LocalDate deathday,
                       double popularity) {}
