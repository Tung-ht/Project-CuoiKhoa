package quanlysv;

import java.util.Comparator;

public class nameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2){
		// TODO Auto-generated method stub
		String[] arr1 = o1.getFullName().split("\\s"); // tach chuoi dua tren khoang trang
		String[] arr2 = o2.getFullName().split("\\s");
		
		// vi du : Dao Nguyen Tung Lam vs Tran Son Tung Lam
		//ham compareTo sap xep theo thu tu tu dien; <0 la dung truoc; ==0 la bang nhau; >0 la dung sau
		
		if (arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]) < 0) {
			return -1;
		} else if (arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]) > 0) {
			return 1;
		} else if (arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]) == 0) {
			if (arr1.length >=2 && arr2.length >=2 && arr1[arr1.length - 2].compareTo(arr2[arr2.length - 2]) <0) {
				return -1;
			} else if (arr1.length >=2 && arr2.length >=2 && arr1[arr1.length - 2].compareTo(arr2[arr2.length - 2]) > 0) {
				return 1;
			} else if (arr1.length >=2 && arr2.length >=2 && arr1[arr1.length - 2].compareTo(arr2[arr2.length - 2]) == 0) {
				if (arr1.length >=3 && arr2.length >=3 && arr1[arr1.length - 3].compareTo(arr2[arr2.length - 3]) < 0) {
					return -1;
				} else if (arr1.length >=3 && arr2.length >=3 &&arr1[arr1.length - 3].compareTo(arr2[arr2.length - 3]) > 0) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		return 0; // xong may truong hop tren thi cho no = nhau luon
	}
}
