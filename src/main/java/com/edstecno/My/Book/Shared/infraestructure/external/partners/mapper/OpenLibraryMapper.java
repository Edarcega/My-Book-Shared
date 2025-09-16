package com.edstecno.My.Book.Shared.infraestructure.external.partners.mapper;

import com.edstecno.My.Book.Shared.infraestructure.external.partners.impl.OpenLibraryClient;
import com.edstecno.My.Book.Shared.infraestructure.external.partners.model.openlibrary.BookDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OpenLibraryMapper {

    @Autowired
    OpenLibraryClient openLibraryClient;

    @Autowired
    DataConverter dataConverter;


    public BookDataDTO getBookDataDto (String title) {
        String json = openLibraryClient.getByTitle(title);
        BookDataDTO bookDataDTO = dataConverter.getLibraryData(json, BookDataDTO.class);
        return bookDataDTO;
    }

}
