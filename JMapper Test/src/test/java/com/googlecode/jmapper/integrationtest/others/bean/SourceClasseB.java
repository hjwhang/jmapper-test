package com.googlecode.jmapper.integrationtest.others.bean;

import java.util.Arrays;
import java.util.List;

public class SourceClasseB {

    private String codeB;

    private List<SourceClasseC> lstC;
    public SourceClasseB() {
		this.codeB = "codeB";
		this.lstC = Arrays.asList(new SourceClasseC());
	}
    public List<SourceClasseC> getLstC() {
        return lstC;
    }

    public void setLstC(final List<SourceClasseC> pLstC) {
        lstC = pLstC;
    }

    public String getCodeB() {
        return codeB;
    }

    public void setCodeB(final String pCodeB) {
        codeB = pCodeB;
    }

}
