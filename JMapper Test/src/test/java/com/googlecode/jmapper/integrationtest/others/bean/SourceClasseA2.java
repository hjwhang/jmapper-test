package com.googlecode.jmapper.integrationtest.others.bean;
import java.util.Arrays;
import java.util.List;

public class SourceClasseA2 {

    private String codeA2;

    private List<SourceClasseB2> lstB2;

    public SourceClasseA2() {
    	this.codeA2 = "codeA2";
    	this.lstB2 = Arrays.asList(new SourceClasseB2());
	}
    public String getCodeA2() {
        return codeA2;
    }

    public void setCodeA2(final String pCodeA2) {
        codeA2 = pCodeA2;
    }

    public List<SourceClasseB2> getLstB2() {
        return lstB2;
    }

    public void setLstB2(final List<SourceClasseB2> pLstB2) {
        lstB2 = pLstB2;
    }

}
