package quanlysv;

import java.util.Comparator;

public class scoreComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.getAverageScore() < o2.getAverageScore()) {
			return -1;
		} else if (o1.getAverageScore() > o2.getAverageScore()) {
			return 1;
		} else {
			return 0;
		}
	}

}
