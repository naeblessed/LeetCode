import java.util.ArrayList;

class Solution {
    public int fib(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i = 2; i < n + 1; i++)
            arr.add(i, arr.get(i - 1) + arr.get(i - 2));
        return arr.get(n);
    }
}