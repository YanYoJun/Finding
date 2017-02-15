package Main;

/**
 * 二分法查找
 * 
 * @author HuHu
 *
 */
public class DicFind extends Find {

	/**
	 * 二分查找，必须保证args参数是有序的
	 */
	@Override
	public int find(int[] args, int target) {
		if (args == null) {
			return -1;
		}
		int left = 0;
		int right = args.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (args[mid] > target) {
				right = mid - 1;
				continue;
			}
			if (args[mid] < target) {
				left = mid + 1;
				continue;
			}
			if (args[mid] == target) {
				return mid;
			}
		}
		return -1;
	}

	@Override
	public String getName() {
		return "二分法";
	}

}
