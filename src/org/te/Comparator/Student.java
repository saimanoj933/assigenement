package org.te.Comparator;

public class Student {
	int id;
	String name;
	int age;
	double marks;
	public Student(int id, String name, int age, double marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+age+" "+marks;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Student student=(Student)obj;
		return this.id==student.id;
	}
	
	
	

}
