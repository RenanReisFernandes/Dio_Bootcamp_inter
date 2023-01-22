package entities;

import java.util.Objects;

public class Course extends Content {
	
	
	
	@Override
	public double calculateXp() {
		// TODO Auto-generated method stub
		return XP_STANDARD * workLoad;
	}
	
	
	private int workLoad;
	
	public Course() {}




	public int getWorkLoad() {
		return workLoad;
	}


	public void setWorkLoad(int workLoad) {
		this.workLoad = workLoad;
	}


	@Override
	public int hashCode() {
		return Objects.hash(getDescription(), getTitle(), workLoad);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(getDescription(), other.getDescription()) && Objects.equals(getTitle(), other.getTitle())
				&& workLoad == other.workLoad;
	}


	@Override
	public String toString() {
		return "Course [title=" + getTitle() + ", description=" + getDescription() + ", workLoad=" + workLoad + "]";
	}




	
	

}
