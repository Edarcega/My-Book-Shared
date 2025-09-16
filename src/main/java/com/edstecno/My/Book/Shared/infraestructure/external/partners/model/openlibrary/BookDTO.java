package com.edstecno.My.Book.Shared.infraestructure.external.partners.model.openlibrary;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookDTO(@JsonAlias("title") String title,
                      @JsonAlias("first_publish_year") String firstPublish) {
}
