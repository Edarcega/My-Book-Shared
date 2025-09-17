package com.edstecno.My.Book.Shared.service;

import com.edstecno.My.Book.Shared.infraestructure.external.partners.mapper.OpenLibraryMapper;
import com.edstecno.My.Book.Shared.infraestructure.external.partners.model.openlibrary.BookDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    @Autowired
    OpenLibraryMapper openLibraryMapper;

    public BookDataDTO getBookDataDTO (String title) {
        return openLibraryMapper.getBookDataDto(title);
    }

}
