package Sample1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Operations {
	static ArrayList<Employee> lstOfEmp=new ArrayList<>();
	
	public void addEmployee(Employee emp) {
		lstOfEmp.add(emp);
		//return lstOfEmp;
	}
	
	public void searchEmployeeByNoida() {
		List<Employee> empInNoida=lstOfEmp.stream().filter(e->e.getLocation().matches("Noida")).collect(Collectors.toList());
		empInNoida.stream().forEach(System.out::println);
	}
	
	public void searchEmpWithSalaryOver50kNoida() {
		List<Employee> empInNoidaWith50k=lstOfEmp.stream().filter(e->e.getLocation().matches("Noida") && e.getSalary()>50000).collect(Collectors.toList());
		empInNoidaWith50k.stream().forEach(System.out::println);
	}
	
	public void getHashMap() {
		HashMap<String, ArrayList<Employee>> mapOfEmp=new HashMap<>();
		lstOfEmp.parallelStream().forEach(e->{
			if(mapOfEmp.containsKey(e.getLocation())) {
				mapOfEmp.get(e.getLocation()).add(e);
			}else {
				mapOfEmp.put(e.getLocation(), new ArrayList<Employee>());
				mapOfEmp.get(e.getLocation()).add(e);
			}
		});
		System.out.println(mapOfEmp);
		
	}
	

}
