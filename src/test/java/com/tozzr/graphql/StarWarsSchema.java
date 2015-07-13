package com.tozzr.graphql;

public class StarWarsSchema extends GraphQLSchema {

	public StarWarsSchema() {
		super();
		GraphQLObjectType queryType = new GraphQLObjectType(
			"query",
			"query description",
			new GraphQLField("hero", new GraphQLNonNull<GraphQLString>())
		);
		setRootType(queryType);
	}
}
