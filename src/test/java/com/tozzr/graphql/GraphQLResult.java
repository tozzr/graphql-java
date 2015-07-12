package com.tozzr.graphql;

import java.util.HashMap;
import java.util.List;

public class GraphQLResult {

	private FieldTree data;
	private List<GraphQLFormattedError> errors;
	
	public FieldTree getData() {
		return data;
	}

	public List<GraphQLFormattedError> getErrors() {
		return errors;
	}

	private class FieldTree extends HashMap<String, Object> {
		
		private static final long serialVersionUID = 1L;
	}
}