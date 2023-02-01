package Sample1;


public class Main {
	public static void main(String[] args) {
		Operations obj=new Operations();
		obj.addEmployee(new Employee(1,"Ajay",60000,"Delhi"));
		obj.addEmployee(new Employee(2,"Axat",50000,"Noida"));
		obj.addEmployee(new Employee(3,"Rahul",65000,"Noida"));
		obj.addEmployee(new Employee(4,"Raj",70000,"Delhi"));
		obj.addEmployee(new Employee(5,"Rohit",60000,"Noida"));
		
		obj.searchEmployeeByNoida();
		System.out.println("\n");
		obj.searchEmpWithSalaryOver50kNoida();
		System.out.println("\n");
		obj.getHashMap();
		System.out.println("\n");
	}
}
