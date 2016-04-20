package com.googlecode.jmapper.integrationtest.api;

import com.googlecode.jmapper.api.JMapperAPI;
import static com.googlecode.jmapper.api.JMapperAPI.*;

import com.googlecode.jmapper.annotations.JMapConversion.Type;
import com.googlecode.jmapper.integrationtest.configurations.bean.Destination;

public class API {

	public static void main(String[] args) {
		new JMapperAPI()
			.add(mappedClass(Destination.class)
					.add(global().excludedAttributes("other").
							includedAttributes(""))
					.add(attribute("id")
							.value("")
							.customGet("")
							.customSet("")
							.targetAttributes(""))
					.add(attribute("destinationField")
							.value("sourceField"))
					.add(conversion("conversionName")
							.from("","")
							.to("")
							.avoidSet(false)
							.type(Type.STATIC))
					 
			);
	}

}
