package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> lst=List.of(1,2,3,4,5);
		lst.add(6);
		
		List<Integer> lst2=new ArrayList<Integer>();
		lst2.add(1);
		
		List<Integer> lst3=Arrays.asList(1,2,3,4,5);
		lst3.add(6);
		System.out.println(lst3);
	}

}
