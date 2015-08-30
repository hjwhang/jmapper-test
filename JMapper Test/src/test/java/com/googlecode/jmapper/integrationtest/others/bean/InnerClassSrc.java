package com.googlecode.jmapper.integrationtest.others.bean;

public class InnerClassSrc {

	private InnerClassSrc.InnerClassBean bean;
	
	public InnerClassSrc(InnerClassBean bean) {
		super();
		this.bean = bean;
	}

	public InnerClassSrc.InnerClassBean getBean() {
		return bean;
	}


	public void setBean(InnerClassSrc.InnerClassBean bean) {
		this.bean = bean;
	}
	public static class InnerClassBean{
		
		private String field;
		
		public InnerClassBean() {}
		
		public InnerClassBean(String field) {
			super();
			this.field = field;
		}

		public String getField() {
			return field;
		}

		public void setField(String field) {
			this.field = field;
		}
		
		
	}

}
