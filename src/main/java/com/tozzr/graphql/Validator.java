package com.tozzr.graphql;

import language.AST;

public class Validator {

	public static GraphQLValidationResult validateDocument(GraphQLSchema schema, AST ast) {
		return new GraphQLValidationResult();
	}
}
