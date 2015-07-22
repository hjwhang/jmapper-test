package com.googlecode.jmapper.integrationtest.others.bean;
import com.googlecode.jmapper.annotations.JMap;

public class DestinationClasseC {

    @JMap
    private String codeC;

    public String getCodeC() {
        return codeC;
    }

    public void setCodeC(final String pCodeC) {
        codeC = pCodeC;
    }

}
