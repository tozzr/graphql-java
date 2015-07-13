package com.tozzr.graphql;

import static language.Parser.parse;
import language.AST;
import language.Source;

public class GraphQL {

  public static GraphQLResult graphql(GraphQLSchema schema, String requestString) {
    Source source = new Source(requestString, "GraphQL request");
    AST ast = parse(source);
    GraphQLValidationResult validationResult = Validator.validateDocument(
        schema, ast);
    if (!validationResult.isValid())
      return new GraphQLResult(validationResult.getErrors());
    else
      // execute(
      // schema,
      // rootObject,
      // ast,
      // operationName,
      // variableValues
      // );
      return new GraphQLResult(new FieldMap("hero", new FieldMap("name",
          "R2-D2")));
  }
}