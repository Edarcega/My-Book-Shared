package com.edstecno.My.Book.Shared.infraestructure.external.partners.impl;


import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class OpenLibraryClient {
    // https://openlibrary.org/search.json?title=Dom+Quixote
    private final String URL = "https://openlibrary.org/search.json?";
    private HttpClient httpClient = HttpClient.newHttpClient();
    HttpResponse<String> response = null;

    private HttpRequest RequestBuilder (String contentURL) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(contentURL)).build();
        return request;
    }

    // Vai ser um BookDataDTO no final assim: public BookDataDTO getByTitle
    public String getByTitle (String title) {
        //String contentURL = URL+"title="+title;
        String contentURL = "https://openlibrary.org/search.json?title=Dom+Quixote";
        System.out.println(" --  Como Ficou a URL --");
        System.out.println(contentURL);
        HttpRequest request = RequestBuilder(contentURL);
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        return json;
    }

}
