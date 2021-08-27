package com.example.bookstore.service;

import com.example.bookstore.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Author> getAuthors(){

        List<Author> authors = new ArrayList<>();

        Author author1 = new Author(1,"https://i.picsum.photos/id/1025/4951/3301.jpg?hmac=_aGh5AtoOChip_iaMo8ZvvytfEojcgqbCH7dzaz-H8Y","test", "test description");

        authors.add(author1);

        return authors;
    }

    public List<Author> searchedAuthors(String authorName){

        List<Author> authors = new ArrayList<>();

        Author author2 = new Author(2,"https://i.picsum.photos/id/1025/4951/3301.jpg?hmac=_aGh5AtoOChip_iaMo8ZvvytfEojcgqbCH7dzaz-H8Y",authorName, "searched description");

        authors.add(author2);

        return authors;
    }
}
