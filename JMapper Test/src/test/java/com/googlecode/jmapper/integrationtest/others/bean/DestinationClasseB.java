package com.googlecode.jmapper.integrationtest.others.bean;

import java.util.List;

import com.googlecode.jmapper.annotations.JMap;

public class DestinationClasseB {

    @JMap
    private String codeB;

    @JMap
    private List<DestinationClasseC> lstC;

    public List<DestinationClasseC> getLstC() {
        return lstC;
    }

    public void setLstC(final List<DestinationClasseC> pLstC) {
        lstC = pLstC;
    }

    public String getCodeB() {
        return codeB;
    }

    public void setCodeB(final String pCodeB) {
        codeB = pCodeB;
    }

}
