package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		System.out.println("Type sumn rn:");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		Map<String, Integer> nameToHeight = new HashMap<> ();
		
		String name = "";
		int height;
		
		while (true) {
			System.out.println("What yo name is?");
			name = in.next();
			if (name.equals("quit")) {
				break;
			}
			System.out.println("What is your height?");
			height = in.nextInt();
			nameToHeight.put(name, height);
			//		nameToHeight.put(in.next(), in.nextInt());
		}
		
		System.out.println("Please enter a name bruv:");
		String newName = in.next();
		System.out.println(newName + nameToHeight.get(newName));
	}
}
