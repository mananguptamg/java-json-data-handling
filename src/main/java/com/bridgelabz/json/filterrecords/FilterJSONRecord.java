package com.bridgelabz.json.filterrecords;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FilterJSONRecord {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("src/main/java/com/bridgelabz/json/filterrecords/Employees.json");

        JSONArray jsonArray = new JSONArray(new JSONTokener(inputStream));
        JSONArray filteredRecords = new JSONArray();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            try {
                if (obj.getInt("age") > 25) {
                    filteredRecords.put(obj);
                }
            } catch (Exception e) {
            }
        }
        System.out.println("Filtered Records with age > 25 are");
        System.out.println(filteredRecords.toString(4));
    }
}
