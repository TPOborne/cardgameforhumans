package cardgameforhumans.factories;

import java.util.Random;

public class NameFactory {
	
	private static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public static String getName() {
		String name = "";
		for (int i = 0; i < 4; i++) {
			name += getRandom(alphabet);
		}
		return name;
	}
	
	private static char getRandom(char[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	
}
