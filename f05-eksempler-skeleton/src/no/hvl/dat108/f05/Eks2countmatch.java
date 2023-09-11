package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

import java.util.Optional;
import java.util.stream.IntStream;

public class Eks2countmatch {

	public static void main(String[] args) {

		//Antall personer over 50 år - count()
		long antallPersoner = people.stream()
<<<<<<< Updated upstream
				.filter(p -> p.getAge() > 50)
				.count();
=======
		.filter (p -> p.getAge() > 50)
		.count();
>>>>>>> Stashed changes
		System.out.println(antallPersoner);
		
		//Om vi har data som matcher - anyMatch, allMatch, noneMatch
		
<<<<<<< Updated upstream
		//Er alle over 30 år?
		boolean alleOver30 = people.stream()
				.allMatch(p -> p.getAge() > 30);
=======
		boolean alleOver30 = people.stream()
		.allMatch(p -> p.getAge() > 30);
>>>>>>> Stashed changes
		System.out.println("Alle over 30? " + alleOver30);
		
		//Er noen over 60 år?
		boolean noenOver60 = people.stream()
<<<<<<< Updated upstream
				.anyMatch(p -> p.getAge() > 60);
=======
		.allMatch (p ->p.getAge() >60);
>>>>>>> Stashed changes
		System.out.println("Noen over 60? " + noenOver60);

	}

}




