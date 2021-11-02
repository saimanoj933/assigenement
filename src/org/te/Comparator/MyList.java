package org.te.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class MyList {
	public static void main(String[] args) {
		Set set= new HashSet<Student>();
		Scanner sc = new Scanner(System.in);
		set.add(new Student(1, "Manoj", 25, 95.50));
		set.add(new Student(4, "Darshan", 90, 35.70));
		set.add(new Student(10, "Raj", 29, 45.47));
		set.add(new Student(12, "Kavya", 35, 89.50));
		set.add(new Student(15, "Dhruv", 75, 98.00));
		set.add(new Student(100, "Momo", 15, 17.80));
		set.add(new Student(1, "Manojrr", 25, 95.78));
		set.add(new Student(1000, "Momo", 5, 10.90));
		System.out.println(set);
		String ans = "";
		ArrayList<Student> arrayList=new ArrayList<Student>(set);
		
		do {
			System.out.println("Enter 1 for sorting by id");
			System.out.println("Enter 2 for sorting by Name");
			System.out.println("Enter 3 for sorting by Age");
			System.out.println("Enter 4 for sorting by Marks");
			int a = sc.nextInt();
						
			switch (a) {
			case 1:
				
				Collections.sort(arrayList, new SortById());
				for (Object object : arrayList) {
					System.out.println(object);
				}
				break;
			case 2:
				Collections.sort(arrayList, new SortByName());
				for (Object object : arrayList) {
					System.out.println(object);
				}
				break;
			case 3:
				Collections.sort(arrayList, new SortByAge());
				for (Object object : arrayList) {
					System.out.println(object);
				}
				break;
			case 4:
				Collections.sort(arrayList, new SortByMarks());
				for (Object object : arrayList) {
					System.out.println(object);
				}
				break;
			case 5:
				System.exit(0);
			default:
				throw new InvaliedInput("Enter the correct input");

			}
			System.out.println("Enter yes to contiune no to exit");
			ans = sc.next();

		} while (ans.equals("yes"));

	}

}
