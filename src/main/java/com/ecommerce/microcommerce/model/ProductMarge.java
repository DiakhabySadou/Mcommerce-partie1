package com.ecommerce.microcommerce.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProductMarge {
	private Map<String, Integer> properties = new HashMap<String, Integer>();

	public void setProperties(String key, int value) {
		this.properties.put(key, value);
	}

	@Override
	public String toString() {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonResult = mapper.writerWithDefaultPrettyPrinter()
									  .writeValueAsString(properties);
			return jsonResult;
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	

}

