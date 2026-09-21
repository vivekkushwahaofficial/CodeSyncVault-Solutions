class Solution {
	public int thirdLargest(List<Integer> arr) {
		int n = arr.size();
		
		if (n < 3) {
			return - 1;
		}
		
		Collections.sort(arr);
		
		return arr.get(n - 3);
	}
}