package Main;

import java.util.List;

public class Utils {
	public static boolean equals(int[] a, int[] b) {
		if (a == null && b == null) {
			return true;
		}
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void println(int[] a) {
		if (a == null) {
			System.out.println("null");
			return;
		}
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
	}

	public static void println(List<Integer> list) {
		if (list == null) {
			System.out.println("null");
			return;
		}
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
	}

	public static boolean equals(List<Integer> listA, List<Integer> listB) {
		if (listA == null && listB == null) {
			return true;
		}
		if (listA.size() != listB.size()) {
			return false;
		}
		for (int i = 0; i < listA.size(); i++) {
			if (listA != listB) {
				return false;
			}
		}
		return true;
	}
	
	public static void swap(int[] args,int loc1,int loc2){
		int temp = args[loc1];
		args[loc1] = args[loc2];
		args[loc2] = temp;
	}

}
