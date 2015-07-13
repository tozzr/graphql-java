package com.tozzr.graphql;

import java.util.List;

public class GraphQLResult {

	private FieldMap data;
	private List<GraphQLFormattedError> errors;
	
	public GraphQLResult() {}
	
	public GraphQLResult(FieldMap data, List<GraphQLFormattedError> errors) {
		this.data = data;
		this.errors = errors;
	}
	
	public FieldMap getData() {
		return data;
	}

	public List<GraphQLFormattedError> getErrors() {
		return errors;
	}
}