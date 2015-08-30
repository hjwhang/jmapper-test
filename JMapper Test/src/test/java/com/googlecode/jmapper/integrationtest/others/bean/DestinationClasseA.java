package com.googlecode.jmapper.integrationtest.others.bean;

import java.util.List;

import com.googlecode.jmapper.annotations.JMap;

public class DestinationClasseA {

    @JMap
    private String codeA;

    @JMap
    private List<DestinationClasseB> lstB;

    public String getCodeA() {
        return codeA;
    }

    public void setCodeA(final String pCodeA) {
        codeA = pCodeA;
    }

    public List<DestinationClasseB> getLstB() {
        return lstB;
    }

    public void setLstB(final List<DestinationClasseB> pLstB) {
        lstB = pLstB;
    }

}
