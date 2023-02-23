package com.bhavna.collection1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedQueue q = new LinkedQueue();
		char ch;

		do {
			System.out.println("\nQueue Operations");
			System.out.println("1. insert");
			System.out.println("2. remove");
			System.out.println("3. peek");
			System.out.println("4. check empty");
			System.out.println("5. size");
			
			System.out.print("\nEnter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter employee id: ");
				int id = sc.nextInt();
				System.out.print("\nEnter employee name: ");
				String name = sc.next();
				System.out.print("\nEnter employee location: ");
				String location = sc.next();
				q.insert(new Employee(id, name, location));
				break;
			case 2:
				try {
					System.out.println("Removed Element = " + q.remove());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.println("Peek Element = " + q.peek());
				} catch (Exception e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case 4:
				System.out.println("Empty status = " + q.isEmpty());
				break;

			case 5:
				System.out.println("Size = " + q.getSize());
				break;

			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* display queue */
			q.display();

			System.out.print("\nDo you want to continue (Type y or n) : ");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		sc.close();
	}

}
