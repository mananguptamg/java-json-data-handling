package com.bridgelabz.json.validatingjson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import java.io.File;
import java.io.IOException;

public class ValidatingJSON {
    public static void main(String[] args) throws IOException, ProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode schemaNode = objectMapper.readTree(new File("src/main/java/com/bridgelabz/json/validatingjson/Schema.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema schema = factory.getJsonSchema(schemaNode);

        JsonNode jsonData = objectMapper.readTree(new File("src/main/java/com/bridgelabz/json/validatingjson/User.json"));

        if(schema.validate(jsonData).isSuccess()){
            System.out.println("JSON data is valid");
        }
        else {
            System.out.println("Invalid JSON");
        }
    }
}
