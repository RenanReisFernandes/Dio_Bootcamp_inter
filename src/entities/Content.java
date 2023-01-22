package entities;

public abstract class Content {

	protected static final double XP_STANDARD =10.0; 
	
	private String title;
	private String description;
	
	public abstract double calculateXp();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Content [title=" + title + ", description=" + description + "]";
	}
	
	
	
}
