package s22_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		// UNIQUE - SET
		// TreeSet : ELEMENTS STORED SORTED ORDER.
		// LinkedHashSet : ELEMENTS STORED IN THE ORDER IN
		// WHICH THEY ARE INSERTED.
		// HashSet : ELEMENTS ARE STOREDD RANDOMLY
		// (NO SORTED OREDER OR THE ORDER IN
		// WHICH THEY ARE INSERTED).

		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeSet " + treeSet);
		// OUTPUT : [A, B, F, Z]

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedHashSet " + linkedHashSet);
		// OUTPUT : [A, Z, B, F]

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("hashSet " + hashSet);
		// OUTPUTS : [A, B, F, Z]


	}

}
