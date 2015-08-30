package com.googlecode.jmapper.integrationtest.others.bean;
import java.util.Arrays;
import java.util.List;

public class SourceClasseA {

    private String codeA;

    private List<SourceClasseB> lstB;

    public SourceClasseA() {
		this.codeA = "codeA";
		this.lstB = Arrays.asList(new SourceClasseB());
	}
    public String getCodeA() {
        return codeA;
    }

    public void setCodeA(final String pCodeA) {
        codeA = pCodeA;
    }

    public List<SourceClasseB> getLstB() {
        return lstB;
    }

    public void setLstB(final List<SourceClasseB> pLstB) {
        lstB = pLstB;
    }

}
