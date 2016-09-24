package com.borombo.demo.retrofitdemo.model;

import java.util.ArrayList;

/**
 * Created by Phantom on 24/09/2016.
 */

public class FOAASOperation {

    private String name;
    private String url;
    private ArrayList<FOAASField> fields;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<FOAASField> getFields() {
        return fields;
    }

    public void setFields(ArrayList<FOAASField> fields) {
        this.fields = fields;
    }

    public String getTextField(){
        String res = "Field : ";
        for (FOAASField field : fields) {
            res += field.getName() + " ";
        }
        return res;
    }
}
