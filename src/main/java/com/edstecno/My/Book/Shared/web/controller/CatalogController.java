package com.edstecno.My.Book.Shared.web.controller;

import com.edstecno.My.Book.Shared.infraestructure.external.partners.model.openlibrary.BookDataDTO;
import com.edstecno.My.Book.Shared.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books")
public class CatalogController {

    @Autowired
    CatalogService catalogService;

    @GetMapping
    public ResponseEntity<BookDataDTO> findAll (@RequestParam String title) {
        return ResponseEntity.ok(catalogService.getBookDataDTO(title));
    }

}
