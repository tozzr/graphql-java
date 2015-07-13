package language;

public class Source {
	private String body;
	private String name;
	
	public Source(String body, String name) {
		this.body = body == null ? "" : body;
		this.name = name == null ? "GraphQL" : name;
	}

	public String getBody() {
		return body;
	}

	public String getName() {
		return name;
	}
}
