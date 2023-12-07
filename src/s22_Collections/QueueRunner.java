package s22_Collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;



	class StringLengthComparator implements Comparator<String> {

		@Override
		public int compare(String value1, String value2) {

			// IN ORDER FROM MORE TO LESS LETTERS IN THE WORD
			return Integer.compare(value2.length(), value1.length());
			// OUTPUT : [Monkey, Zebra, Cat]

			// IN ONDER FROM LESS TO MORE LETTERS IN THE WORD
			// return Integer.compare(value1.length(), value2.length());
			// OUTPUT : [Cat, Zebra, Monkey]
		}

	}

	public class QueueRunner {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());

		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue); // OUTPUT : [Cat, Zebra, Monkey]
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		// ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		// A L L T H E S E T O G E T H E R P R I N T S:
		// OUTPUT :
		// Cat
		// Monkey
		// Zebra
		// null
	}

}
