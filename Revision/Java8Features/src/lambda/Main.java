package lambda;

public class Main {
	public static void main(String[] args) {
		FirstFunctionalInterface i=()->System.out.println("In printInfo method of functional interface");
		
		i.printInfo();
		
		Runnable i2=()->{
			for(int j=1;j<=10;j++) {
				System.out.println("Value of j is: "+j);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		};
		
		Thread t=new Thread(i2);
		t.setName("firstThread");
		t.start();
		System.out.println(t.getName());
		System.out.println(t.getState());
	}

}
