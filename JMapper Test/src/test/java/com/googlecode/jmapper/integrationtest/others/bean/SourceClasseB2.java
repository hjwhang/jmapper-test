package com.googlecode.jmapper.integrationtest.others.bean;
import com.googlecode.jmapper.annotations.JMap;

public class SourceClasseB2 {

    @JMap
    private String codeB2;

    @JMap
    private SourceClasseC[] tabC;

    public SourceClasseB2() {
    	this.codeB2 = "codeA2";
    	this.tabC = new SourceClasseC[]{new SourceClasseC()};
	}
    public String getCodeB2() {
        return codeB2;
    }

    public void setCodeB2(final String pCodeB2) {
        codeB2 = pCodeB2;
    }

    public SourceClasseC[] getTabC() {
        return tabC;
    }

    public void setTabC(final SourceClasseC[] pTabC) {
        tabC = pTabC;
    }

}
