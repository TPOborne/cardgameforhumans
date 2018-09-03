package cardgameforhumans.factories;

import java.util.Random;

public class NameFactory {
	
	private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public String getName() {
		String name = "";
		for (int i = 0; i < 4; i++) {
			name += getRandom(alphabet);
		}
		return name;
	}
	
	private char getRandom(char[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	
}
