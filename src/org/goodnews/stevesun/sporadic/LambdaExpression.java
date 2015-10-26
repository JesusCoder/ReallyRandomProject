/**
 * 
 */
package org.goodnews.stevesun.sporadic;

import java.util.Arrays;
import java.util.List;
//import java.util.Predicate;


/**
 * This is a simple class to play around with Lambda expression which is a new feature
 * added in Java 8.
 * However, this class won't compile, but I copied word by word from online example, the only reason
 * could be that my Eclipse doesn't have Java 8, although $java -version in my Mac terminal does
 * show that I've Java 8 installed.
 * @author SteveSun
 *
 */
public class LambdaExpression {
	public LambdaExpression() {
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] people = {"Bei Jiang", "Mengting Cheng", "Wenyun Qiang", "Steve Sun"};
		List<String> persons = Arrays.asList(people);
		
		//old looping
		for(String person : persons){
			System.out.print(person + ", ");
		}
		System.out.println();
		
		//using lamda expression and functional parameters
//		persons.forEach(person) -> System.out.print(person + " ");
		
		System.out.println("\nThat's the end of the program.");
	}

}
