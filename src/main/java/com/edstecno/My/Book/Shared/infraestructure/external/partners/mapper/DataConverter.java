package com.edstecno.My.Book.Shared.infraestructure.external.partners.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class DataConverter implements IDataConverter {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T getLibraryData(String json, Class<T> classe) {
        try {
            return objectMapper.readValue(json,classe);
        } catch (JsonProcessingException e) {
            throw  new RuntimeException(e);
        }
    }
}
