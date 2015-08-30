package com.googlecode.jmapper.integrationtest.others.bean;

import com.googlecode.jmapper.annotations.JGlobalMap;

@JGlobalMap
public class InnerClassDest {

	private InnerClassSrc.InnerClassBean bean;
	
	
	public InnerClassSrc.InnerClassBean getBean() {
		return bean;
	}


	public void setBean(InnerClassSrc.InnerClassBean bean) {
		this.bean = bean;
	}

}
