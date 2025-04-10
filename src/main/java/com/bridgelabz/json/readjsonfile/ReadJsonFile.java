package com.bridgelabz.json.readjsonfile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJsonFile {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper.readTree(new File("src/main/java/com/bridgelabz/json/readjsonfile/employee.json"));

        System.out.println("name: "+jsonNode.get("name").asText());
        System.out.println("email: "+jsonNode.get("email").asText());
    }
}
