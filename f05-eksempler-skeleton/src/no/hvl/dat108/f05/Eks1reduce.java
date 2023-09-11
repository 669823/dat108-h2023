package no.hvl.dat108.f05;

import static no.hvl.dat108.f05.People.people;

public class Eks1reduce {
	
	public static void main(String[] args) {
		
		/* Summen av aldre av personer i people-listen */
		
		// Summen av aldre med vanlig +
<<<<<<< Updated upstream
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, (sum, alder) -> sum + alder);
		
		// Alternativt med Integer.sum
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, (akk, alder) -> Integer.sum(akk, alder));
		
		// Med metodereferanse
//		int sumAlder = people.stream()
//				.map(p -> p.getAge())
//				.reduce(0, Integer::sum);
		
		// Alternativt med IntStream (Stream av int)
		int sumAlder = people.stream()
				.mapToInt(p -> p.getAge())
				.sum();
=======
		int sumAlder = people.stream()
		.map(p -> p.getAge())
		.reduce(0, (a,b) ->Integer.sum(a, b)); // eller .reduce(0,Integer::sum)
		System.out.println(sumAlder);
		// Alternativt med Integer.sum
		
		
		// Med metodereferanse
		int sumAlder2 = people.stream()
		.map(p -> p.getAge())
		.reduce(0, Integer::sum);
		System.out.println(sumAlder2);
		
		// Alternativt med IntStream (Stream av int-er)
		int sumAlder3 = people.stream()
		.mapToInt(p -> p.getAge())
		.sum();
		System.out.println(sumAlder3);
>>>>>>> Stashed changes
		
		System.out.println(sumAlder);
		
		
		/* En streng med alle initialene, "CD LC TC CB MA" */

		// gather using refuce and +
		String initialier = people.stream()
		.map(p -> p.getFirstName().substring(0, 1))
		.reduce("", (a,b) -> a + b + " ");
		System.out.println(initialier);

		


		// Alternativt med collect og Collectors.joining
//		String initialer = TODO

		System.out.println("|" + initialer + "|");
		
	}	

}










