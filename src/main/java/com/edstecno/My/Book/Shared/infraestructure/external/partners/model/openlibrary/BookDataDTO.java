package com.edstecno.My.Book.Shared.infraestructure.external.partners.model.openlibrary;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BookDataDTO(@JsonAlias("num_found") Integer qtd,
                          @JsonAlias("docs") List<BookDTO> books) {
}
