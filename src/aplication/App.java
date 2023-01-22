package aplication;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Course;
import entities.Dev;
import entities.Mentorship;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mentorship mentoria = new Mentorship();
		mentoria.setTitle("Mentoria Java");
		mentoria.setDescription("Mentoria de Java");
		mentoria.setDate(LocalDate.now());
		System.out.println(mentoria);
		
		Course curso = new Course();
		curso.setTitle("Java");
		curso.setDescription("Curso de java");
		curso.setWorkLoad(10);
		System.out.println(curso);
		
		
		
		
		Course curso1 = new Course();
		Course curso2 = new Course();
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Java");
		bootcamp.setDescription("Java do zero ao Hero");
		bootcamp.getContents().add(curso1);
		bootcamp.getContents().add(curso2);
		bootcamp.getContents().add(mentoria);
		
		
		Dev dev1 = new Dev();
		dev1.setName("Renan");
		dev1.subscribeBootcamp(bootcamp);
		
		System.out.println(dev1.getSubscribedContents());
		dev1.progress();
		System.out.println("-");
		System.out.println(dev1.getSubscribedContents());
		System.out.println(dev1.getConcludedContents());
		System.out.println(dev1.calculateTotalXp());
		
		Dev dev2 = new Dev();
		dev2.setName("Cami-la");
		dev2.subscribeBootcamp(bootcamp);
		
		System.out.println(dev2.getSubscribedContents());
		dev2.progress();
		System.out.println("-");
		System.out.println(dev2.getSubscribedContents());
		System.out.println(dev2.getConcludedContents());
		System.out.println(dev2.calculateTotalXp());
		
	}

}
