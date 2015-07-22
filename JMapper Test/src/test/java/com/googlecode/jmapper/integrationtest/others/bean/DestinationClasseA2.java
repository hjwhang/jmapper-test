package com.googlecode.jmapper.integrationtest.others.bean;

import java.util.List;

import com.googlecode.jmapper.annotations.JMap;

public class DestinationClasseA2 {

    @JMap
    private String codeA2;

    @JMap
    private List<DestinationClasseB2> lstB2;

    public String getCodeA2() {
        return codeA2;
    }

    public void setCodeA2(final String pCodeA2) {
        codeA2 = pCodeA2;
    }

    public List<DestinationClasseB2> getLstB2() {
        return lstB2;
    }

    public void setLstB2(final List<DestinationClasseB2> pLstB2) {
        lstB2 = pLstB2;
    }

}
