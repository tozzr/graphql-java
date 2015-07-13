package com.tozzr.graphql;

public class GraphQLSchema {
	
	private GraphQLObjectType rootType;
	
	protected GraphQLSchema() {
	}
	
	public GraphQLSchema(GraphQLObjectType rootType) {
		setRootType(rootType);
	}

	protected void setRootType(GraphQLObjectType rootType) {
		this.rootType = rootType;
	}
}
