/**
 * 
 */
package org.goodnews.stevesun.sporadic.weirdLogicProblem;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Stopped half way, didn't figure it out.
 * I'm thinking I need to figure out a better data structure, otherwise there is
 * no way that I can generate all possible role combinations inside this four-person family.
 * And it's also impossible for me to traverse thru all the possible role combinations to find the valid
 * possibilities.
 * @author SteveSun
 *
 */
public class WeirdLogicSolver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<FamilyMember> familyMembers = familyMemberInitializer();

		List<String> roles = new ArrayList<String>();
		roles.add("murderer");
		roles.add("accomplice");
		roles.add("victim");
		roles.add("witness");

		List<String> result = validFamily(familyMembers, roles);

		for(int i = 0; i < result.size(); i++){
			System.out.println("Possibility " + i + " is: " + result.get(i));
		}

		System.out.println("Program ended.");
	}

	private static List<FamilyMember> familyMemberInitializer(){
		List<FamilyMember> result = new ArrayList<FamilyMember>();

		FamilyMember father = new FamilyMember("male", "Father", 40);
		FamilyMember mother = new FamilyMember("female", "Mother", 38);
		/*assumption #1: daughter is older than son, could be the opposite though*/
		FamilyMember daughter = new FamilyMember("female", "Daughter", 16);
		FamilyMember son = new FamilyMember("male", "Son", 12);

		result.add(daughter);
		result.add(mother);
		result.add(father);
		result.add(son);

		return result;
	}

	private static List<String> validFamily(List<FamilyMember> familyMembers, List<String> roles){
		List<String> possibleCombinations = new ArrayList<String>();

		List<ArrayList<FamilyMember>> possibleRoleCombinations = possibleRoleCombinationGenerator(roles);

		for(ArrayList<FamilyMember> possibleRoleCombination : possibleRoleCombinations){
			/*rule 1: accomplice and witness are of opposite gender*/
			for(int i = 0; i < possibleRoleCombination.size(); i++){
				if(possibleRoleCombination.get(i).getRole().equals("accomplice")){
					break;
				}
			}
			

		}


		return possibleCombinations;
	}

	private static List<ArrayList<FamilyMember>> possibleRoleCombinationGenerator(List<String> roles){
		List<ArrayList<FamilyMember>> possibleRoleCombinations = new ArrayList<ArrayList<FamilyMember>>();

		List<FamilyMember> familyMembers = familyMemberInitializer();

		for(int i = 0; i < familyMembers.size(); i++){
			familyMembers.get(i).setRole(roles.get(i));
			roles.remove(i);
			familyMembers.add(familyMembers.get(i));
		}

		for(int i = 0; i < possibleRoleCombinations.size(); i++){
			System.out.println();
		}
		return possibleRoleCombinations;

	}

}
