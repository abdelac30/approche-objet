package liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListInt {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		System.out.println(list);
		System.out.println(list.size());
		
		Iterator<Integer> iterator= list.iterator();
		int max=list.get(0);
		int min=list.get(0);
		while (iterator.hasNext()) {
			int numero = iterator.next();
			if(numero>max) {
				max=numero;
			}
			if(numero<min) {
				min=numero;
			}
			
		}
		System.out.println(max);
		 list.remove(Integer.valueOf(min));
		System.out.println(list);
		
		for (int i=0; i<list.size(); i++) {
			if(list.get(i)<0) {
				list.set(i, Math.abs(list.get(i)));
			}
			
		}
		System.out.println(list);
	}

}
