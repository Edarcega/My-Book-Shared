package com.edstecno.My.Book.Shared.config;

import com.edstecno.My.Book.Shared.infraestructure.external.partners.mapper.OpenLibraryMapper;
import com.edstecno.My.Book.Shared.infraestructure.external.partners.model.openlibrary.BookDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

//@Configuration
public class MyBookSharedTest implements CommandLineRunner {

    @Autowired
    OpenLibraryMapper openLibraryMapper;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o titulo do livro");
        String title = scanner.nextLine();

        BookDataDTO bookDataDTO = openLibraryMapper.getBookDataDto(title);

        System.out.println(bookDataDTO);



    }
}
