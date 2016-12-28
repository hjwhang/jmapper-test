package com.googlecode.jmapper.integrationtest.others;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.annotations.JMapConversion.Type;
import com.googlecode.jmapper.api.JMapperAPI;
import static com.googlecode.jmapper.api.JMapperAPI.*;
import com.googlecode.jmapper.integrationtest.others.bean.Destination;
import com.googlecode.jmapper.integrationtest.others.bean.Source;

public class GeneralPorpose {

	public static void main(String[] args){
	
		JMapperAPI api = new JMapperAPI()
				.add(mappedClass(Destination.class)
						.add(global())
						.add(conversion("conversion").type(Type.DYNAMIC).body("return true;")));
		JMapper<Destination, Source> mapper = new JMapper<Destination, Source>(Destination.class, Source.class,api);
		
		
	}
	
}
