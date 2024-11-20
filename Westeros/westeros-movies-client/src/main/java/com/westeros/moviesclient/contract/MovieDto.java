package com.westeros.moviesclient.contract;


import java.time.LocalDate;
import java.util.List;

public record MovieDto(
         boolean adult,
         String backdropPath,
         int budget,
         List<GenreSummaryDto> genres,
         String homepage,
         String originalLanguage,
         String originalTitle,
         String overview,
         double popularity,
         String posterPath,
         List<CompanySummaryDto> productionCompanies,
         List<CountrySummaryDto> productionCountries,
         LocalDate releaseDate,
         int runtime,
         List<LanguageSummaryDto> spokenLanguages,
         int voteCount,
         double voteAverage
        
) {
    public record GenreSummaryDto(int id, String name){}
    public record CountrySummaryDto(String name, String isoCode){}
    public record LanguageSummaryDto(String name, String englishName, String isoCode){}
    public record CompanySummaryDto(int id, String logoPath,String name, String originCountry){}
}
