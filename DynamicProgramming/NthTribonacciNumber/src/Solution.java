import java.util.ArrayList;

class Solution {
    public int tribonacci(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0); arr.add(1); arr.add(1);
        for (int i = 3; i < n + 1; i++)
            arr.add(i, arr.get(i-1) + arr.get(i-2) + arr.get(i-3));
        return arr.get(n);
    }
}