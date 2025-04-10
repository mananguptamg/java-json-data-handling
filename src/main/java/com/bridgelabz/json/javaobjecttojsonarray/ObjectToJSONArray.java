package com.bridgelabz.json.javaobjecttojsonarray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ObjectToJSONArray {
    public static void main(String[] args) throws JsonProcessingException {
        Movie movie1 = new Movie("3 idiots",180,2011);
        Movie movie2 = new Movie("Salaar",210,2022);
        Movie movie3 = new Movie("Brahmastar",160,2020);

        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonArray = objectMapper.writeValueAsString(movieList);

        System.out.println(jsonArray);
    }
}
