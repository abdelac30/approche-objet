package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> list = new HashSet<Double>();
		list.add(1.5);
		list.add(8.25);
		list.add(-7.32);
		list.add(13.3);
		list.add(-12.45);
		list.add(48.5);
		list.add(0.01);

		System.out.println(list);

		Iterator<Double> it = list.iterator();
		double maxElem = Double.MIN_VALUE;
		double minElem = Double.MAX_VALUE;

		while (it.hasNext()) {
			double current = it.next();
			if (current > maxElem) {
				maxElem = current;
			}
			if (current < minElem) {
				minElem = current;
			}
		}
		list.remove(minElem);
		System.out.println(maxElem);
		System.out.println(list);
	}

}
