package com.example.tourguidapp;

class Places {
    private final String place_name;
    private final int ResourceId;

    public Places(String name,int id){
        place_name=name;
        ResourceId=id;
    }

    public String getPlace_name() {
        return place_name;
    }

    public int getResourceId() {
        return ResourceId;
    }
}
