package com.tozzr.graphql;

import java.util.ArrayList;
import java.util.List;

public class GraphQLResult {

  private FieldMap data;
  private List<GraphQLFormattedError> errors;

  public GraphQLResult() {
  }

  public GraphQLResult(FieldMap data) {
    this.data = data;
    this.errors = new ArrayList<GraphQLFormattedError>();
  }

  public GraphQLResult(List<GraphQLFormattedError> errors) {
    this.data = new FieldMap();
    this.errors = errors;
  }

  public FieldMap getData() {
    return data;
  }

  public List<GraphQLFormattedError> getErrors() {
    return errors;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((data == null) ? 0 : data.hashCode());
    result = prime * result + ((errors == null) ? 0 : errors.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    GraphQLResult other = (GraphQLResult) obj;
    if (data == null) {
      if (other.data != null)
        return false;
    } else if (!data.equals(other.data))
      return false;
    if (errors == null) {
      if (other.errors != null)
        return false;
    } else if (!errors.equals(other.errors))
      return false;
    return true;
  }
}