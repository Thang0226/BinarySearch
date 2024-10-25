public class BinarySearch {
	static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79}; // Sorted List

	public static void main(String[] args) {
		System.out.println(binarySearch(list, 2));  /* 0 */
		System.out.println(binarySearch(list, 11)); /* 4 */
		System.out.println(binarySearch(list, 79)); /*12 */
		System.out.println(binarySearch(list, 1));  /*-1 */
		System.out.println(binarySearch(list, 5));  /*-1 */
		System.out.println(binarySearch(list, 80)); /*-1 */
	}

	static int binarySearch(int[] list, int key) {
		int start = 0;
		int end = list.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == list[mid]) {
				return mid;
			} else if (key < list[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
