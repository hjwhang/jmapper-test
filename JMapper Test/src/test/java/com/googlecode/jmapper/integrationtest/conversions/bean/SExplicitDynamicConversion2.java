package com.googlecode.jmapper.integrationtest.conversions.bean;

import com.googlecode.jmapper.annotations.JMap;
import com.googlecode.jmapper.annotations.JMapConversion;
import com.googlecode.jmapper.annotations.JMapConversion.Type;

public class SExplicitDynamicConversion2 {

	@JMap("destination")
	private String source;
	@JMap("destination2")
	private String source2;
	@JMap("destination3")
	private String source3;
	@JMap("destination4")
	private String source4;
	
	@JMapConversion(from={"source2"},to={"destination2"},type=Type.DYNAMIC)
	public static String conversion(){
		return "String s; "+
			   "return s.toString();";
		
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource2() {
		return source2;
	}

	public void setSource2(String source2) {
		this.source2 = source2;
	}

	
	public String getSource3() {
		return source3;
	}

	public void setSource3(String source3) {
		this.source3 = source3;
	}

	public String getSource4() {
		return source4;
	}

	public void setSource4(String source4) {
		this.source4 = source4;
	}

	@Override
	public String toString() {
		return "SExplicitDynamicConversion [source=" + source + ", source2="
				+ source2 + ", source3=" + source3 + ", source4=" + source4
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((source2 == null) ? 0 : source2.hashCode());
		result = prime * result + ((source3 == null) ? 0 : source3.hashCode());
		result = prime * result + ((source4 == null) ? 0 : source4.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SExplicitDynamicConversion2 other = (SExplicitDynamicConversion2) obj;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (source2 == null) {
			if (other.source2 != null)
				return false;
		} else if (!source2.equals(other.source2))
			return false;
		if (source3 == null) {
			if (other.source3 != null)
				return false;
		} else if (!source3.equals(other.source3))
			return false;
		if (source4 == null) {
			if (other.source4 != null)
				return false;
		} else if (!source4.equals(other.source4))
			return false;
		return true;
	}

	/**
	 * @param source
	 * @param source2
	 * @param source3
	 * @param source4
	 */
	public SExplicitDynamicConversion2(String source, String source2,
			String source3, String source4) {
		super();
		this.source = source;
		this.source2 = source2;
		this.source3 = source3;
		this.source4 = source4;
	}

	
	
}
