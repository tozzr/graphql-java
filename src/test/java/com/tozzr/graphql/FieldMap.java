package com.tozzr.graphql;

import java.util.HashMap;

public class FieldMap extends HashMap<String, Object> {
	
	private static final long serialVersionUID = 1L;
	
	public FieldMap() {}
	
	public FieldMap(String name, Object value) {
		put(name, value);
	}
}