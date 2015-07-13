package com.tozzr.graphql;

import java.util.ArrayList;
import java.util.List;

public class GraphQLValidationResult {

	private boolean valid = true;

	public boolean isValid() {
		return valid;
	}

	public List<GraphQLFormattedError> getErrors() {
		return new ArrayList<GraphQLFormattedError>();
	}
}
