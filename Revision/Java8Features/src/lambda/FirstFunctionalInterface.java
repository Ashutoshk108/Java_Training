package lambda;

@FunctionalInterface
public interface FirstFunctionalInterface {
	void printInfo();
	
	static void method() {
		System.out.println("Hello");
	}

}
