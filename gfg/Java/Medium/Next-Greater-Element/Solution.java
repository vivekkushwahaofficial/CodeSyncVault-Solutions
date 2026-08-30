class Solution {
	public ArrayList<Integer> nextLargerElement(int[] arr) {
		Stack<Integer> st = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		int n = arr.length;
		int[] answer = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			while (!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				answer[i] = -1;
			} else {
				answer[i] = st.peek();
			}
			st.push(arr[i]);
		}
		for (int i = 0; i < answer.length; i++) {
			list.add(answer[i]);
		}
		return list;
	}
}