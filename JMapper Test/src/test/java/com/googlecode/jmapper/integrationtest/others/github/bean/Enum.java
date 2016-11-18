package com.googlecode.jmapper.integrationtest.others.github.bean;

public enum Enum {

    NUMBER(1);

    private final int value;

    Enum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Enum get(short s){
        for(Enum e: values()){
            if(e.getValue() == s){
                return e;
            }
        }
        return null;
    }
}
