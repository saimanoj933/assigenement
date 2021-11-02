package org.te.Comparator;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int var=(int) (o1.marks-o2.marks);
		return var;
	}

}
