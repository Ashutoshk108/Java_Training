package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList<Integer>();
		lst.add(85);
		lst.add(14);
		lst.add(10);
		lst.add(7);
		
		//doubling the elements of lst
		List<Integer> lst1=lst.stream().map(e->e*2).collect(Collectors.toList());
		
		System.out.println(lst+" "+lst1);
		
		List<Integer> lst2=lst.stream().sorted().collect(Collectors.toList());
		
		System.out.println(lst+" "+lst2);
		
		List<Integer> lst3=lst.stream().sorted().map(e->e*2).filter(e->e<30).collect(Collectors.toList());
		System.out.println(lst+" "+lst3);
		
		List<Integer> lst4=lst.stream().filter(e-> e<=20 && e>=10).collect(Collectors.toList());
		System.out.println(lst+" "+lst4);
		
		
		Stream.iterate(10,e->e+1).filter(e->e%2==0).limit(3).forEach(System.out::println);
		
		Integer sum1=lst.stream().reduce(0, Integer::sum);
		System.out.println(sum1);
		
		Integer sum2=lst.stream().reduce(0, (res,val)->res+val);
		System.out.println(sum2);
		
		Integer sum3=lst.stream().collect(Collectors.summingInt(e->e));
		System.out.println(sum3);
	}

}
