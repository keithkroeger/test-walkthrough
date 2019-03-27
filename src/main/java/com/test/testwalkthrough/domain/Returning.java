package com.test.testwalkthrough.domain;

import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.json.JSONObject;

import java.util.List;

public class Returning {

    private String name;

    private String jsonString;

    public Returning(String name, String jsonString){
        this.name = name;
        this.jsonString = jsonString;
    }

    public String getName() {
        return name;
    }

    public String getJsonString() {
        return jsonString;
    }

    public List<Object> getJsonList() {
        JSONObject parsed = new JSONObject(jsonString);
        return parsed.getJSONArray("list").toList();
    }

}
