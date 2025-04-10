package com.bridgelabz.json.mergejsonobjects;

import org.json.JSONObject;

public class MergeTwoJsonObjects {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name","Manan");
        student.put("age","22");
        student.put("marks","93.5");

        JSONObject studentaddress =  new JSONObject();
        studentaddress.put("city","Yamunanagar");
        studentaddress.put("state","Haryana");

        for (String key : studentaddress.keySet()) {
            student.put(key, studentaddress.get(key));
        }

        System.out.println(student.toString(4));
    }
}