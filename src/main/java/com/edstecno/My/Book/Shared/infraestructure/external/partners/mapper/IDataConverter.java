package com.edstecno.My.Book.Shared.infraestructure.external.partners.mapper;

public interface IDataConverter {

    <T> T getLibraryData(String json, Class<T> classe);

}
