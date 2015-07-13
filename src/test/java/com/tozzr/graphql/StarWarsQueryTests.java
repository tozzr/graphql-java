package com.tozzr.graphql;

import static com.tozzr.graphql.GraphQL.graphql;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import de.bechte.junit.runners.context.HierarchicalContextRunner;

@RunWith(HierarchicalContextRunner.class)
public class StarWarsQueryTests {

	GraphQLSchema starWarsSchema = new StarWarsSchema();

	private void testQuery(String query, GraphQLResult expected) {
		assertThat(graphql(starWarsSchema, query), equalTo(expected));
	}

	public class BasicQueries {

		@Test
		public void correctlyIdentifyR2D2AsTheHeroOfTheStarWarsSaga() {
			String query = "query HeroNameQuery {" + "	hero {" + " 		name"
					+ "	}" + "}";
			GraphQLResult expected = new GraphQLResult(new FieldMap("hero",
					new FieldMap("name", "R2-D2")));
			testQuery(query, expected);
		}
	}
}
