package entities;

import java.time.LocalDate;
import java.util.Objects;

public class Mentorship extends Content {
	
	
	@Override
	public double calculateXp() {
		// TODO Auto-generated method stub
		return XP_STANDARD +20.0;
	}
	
	
	
	
	private LocalDate date;
	
	
	public Mentorship() {}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	@Override
	public int hashCode() {
		return Objects.hash(date);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mentorship other = (Mentorship) obj;
		return Objects.equals(date, other.date) && Objects.equals(getDescription(), other.getDescription())
				&& Objects.equals(getTitle(), other.getTitle());
	}


	@Override
	public String toString() {
		return "Mentorship [date=" + date + "]";
	}


	

	

}
