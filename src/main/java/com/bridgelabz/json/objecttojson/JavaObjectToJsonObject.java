package com.bridgelabz.json.objecttojson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Employee{
    public int id;
    public String name;
    public String email;

    Employee(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

public class JavaObjectToJsonObject {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee emp1 = new Employee(101,"Manan","manan@gmail.com");

        String jsonString = objectMapper.writeValueAsString(emp1);
        System.out.println(jsonString);
    }
}
