package codility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DistributeCandies {

	public static void main(String[] args) {
		int[] arr = new int[] {80, 80, 80, 12434324, 80, 80, 80, 80, 80, 10000};
		Set<Integer> set= new HashSet<>();
		for (int i : arr) {
			set.add(i);
		}
//		Iterator<Integer> iterator = set.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
		System.out.println(Math.min(set.size(),arr.length/2));
	}

}
