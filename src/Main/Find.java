package Main;

public abstract class Find {
	/**
	 * find target in arrays args,if found,return the first one's loc, if cannot
	 * find,return -1;
	 */
	public abstract int find(int[] args, int target);

	public abstract String getName();

	/**
	 * 入口，注意每添加一个测试子类，都要在这里添加一个测试方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Find find = new DicFind();
		find.testFind();
	}

	/**
	 * 测试每个子类的查找方法
	 */
	private void testFind() {
		testFind_1();
		testFind_2();
		testFind_3();
		System.out.print(getName() + " test over");
	}

	private void testFind_1() {
		int[] arrays = { 2, 3, 4, 5, 6, 7, 8, 9,  3, 4, 5 };
		int target = 2;
		quickSort(arrays, 0, arrays.length-1);
		int loc = find(arrays, target);
		System.out.println("loc1:" + loc);
		assert (0 == loc);
	}

	private void testFind_2() {
		int[] arrays = { 2, 3, 4, 5, 6, 7, 8, 9, 3, 4, 5 };
		quickSort(arrays, 0, arrays.length-1);
		int target = 1;
		int loc = find(arrays, target);
		System.out.println("loc2:" + loc);
		assert (0 == loc);
	}

	private void testFind_3() {
		int[] arrays = null;
		int target = 1;
		int loc = find(arrays, target);
		System.out.println("loc3:" + loc);
		assert (0 == loc);
	}
	
	/**
	 * 快速排序法，辅助子类的查找
	 */
	public void quickSort(int[] args, int start, int end) {
		if (args == null || args.length < end + 1) {
			return;
		}
		if (start >= end) {
			return;
		}
		int mid = args[end];
		int left = start;
		int right = end - 1;
		while (left < right) {
			while (args[left] < mid && left < right) {
				left++;
			}
			while (args[right] >= mid && left < right) {
				right--;
			}
			Utils.swap(args, left, right);
		}
		if (args[left] > mid) {
			Utils.swap(args, left, end);
		}
		quickSort(args, start, left);
		quickSort(args, left + 1, end);
	}

}
