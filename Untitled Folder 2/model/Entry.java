package com.example.joanericacanada.daybook.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.UUID;

/**
 * Created by joanericacanada on 10/28/15.
 */
public class Entry {
    //TAGS
    private static final String JSON_ID = "id";
    private static final String JSON_TITLE = "title";
    private static final String JSON_BODY = "body";
    private static final String JSON_DATE = "date";

    //VARIABLES
    private String title, body;
    private Date date = new Date();
    private UUID id;
    //for photo

    public Entry(){
        id = UUID.randomUUID();
    }

    public Entry(JSONObject json) throws JSONException{
        id = UUID.fromString(json.getString(JSON_ID));
        title = json.getString(JSON_TITLE);
        body = json.getString(JSON_BODY);
        date = new Date(json.getLong(JSON_DATE));
    }

    public JSONObject saveToJson() throws JSONException{
        JSONObject jObject = new JSONObject();
        jObject.put(JSON_ID, id.toString());
        jObject.put(JSON_TITLE, title);
        jObject.put(JSON_BODY, body);
        jObject.put(JSON_DATE, date.getTime());

        return jObject;
    }

    public UUID getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
