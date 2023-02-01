import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		HashMap<String, List<String>> tempHashMap=new HashMap<String,List<String>>();
		List<String> lst1=Arrays.asList("Axat","Ajay","Aman");
		List<String> lst2=Arrays.asList("Karan","Gaurav","Himanshu");
		List<String> lst3=Arrays.asList("Jitu","Sahil","Vivek");
		tempHashMap.put("Noida", lst1);
		tempHashMap.put("Delhi",lst2);
		tempHashMap.put("Hyderabad", lst3);
		
		List<String> lstName=tempHashMap.get("Noida");
		
		
		lstName.stream().forEach(s->System.out.println(s));
	}
}
