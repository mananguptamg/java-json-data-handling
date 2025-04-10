package com.bridgelabz.json.jsonobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonObject {
    public static void main(String[] args) {
        JSONArray subjects = new JSONArray();
        subjects.put("mathematics");
        subjects.put("english");
        subjects.put("hindi");

        JSONObject studentObject = new JSONObject();

        studentObject.put("name", "Manan");
        studentObject.put("age","22");
        studentObject.put("marks","94.0");
        studentObject.put("subjects",subjects);

        System.out.println(studentObject.toString(4));
    }
}
