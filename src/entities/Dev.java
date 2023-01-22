package entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	@Override
	public String toString() {
		return "Dev [name=" + name + ", subscribedContents=" + subscribedContents + ", concludedContents="
				+ concludedContents + "]";
	}

	private String name;
	private Set<Content> subscribedContents = new LinkedHashSet<>();
	private Set<Content> concludedContents = new LinkedHashSet<>();
	
	
	public void subscribeBootcamp(Bootcamp bootcamp) {
		
		this.subscribedContents.addAll(bootcamp.getContents());
		bootcamp.getSubscribedDevs().add(this);
	}
	
	public void progress() {
		
		Optional<Content> content = this.subscribedContents.stream().findFirst();
		if(content.isPresent()) {
			this.concludedContents.add(content.get());
			this.subscribedContents.remove(content.get());
		}else {
			System.err.println("Você não está matriculado em nenhum bootcamp");
		}
	}
	
	public double calculateTotalXp() {
		
		return this.concludedContents.stream().mapToDouble(content -> content.calculateXp()).sum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getSubscribedContents() {
		return subscribedContents;
	}

	public void setSubscribedContents(Set<Content> subscribedContents) {
		this.subscribedContents = subscribedContents;
	}

	public Set<Content> getConcludedContents() {
		return concludedContents;
	}

	public void setConcludedContents(Set<Content> concludedContents) {
		this.concludedContents = concludedContents;
	}

	@Override
	public int hashCode() {
		return Objects.hash(concludedContents, name, subscribedContents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(concludedContents, other.concludedContents) && Objects.equals(name, other.name)
				&& Objects.equals(subscribedContents, other.subscribedContents);
	}

	
	
}
