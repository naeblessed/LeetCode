/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1)
            if(isBadVersion(1))
                return 1;
        int minIndex = 1;
        int left = 1;
        int right = n;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){
                minIndex = mid;
                right = mid - 1;
            }else left = mid + 1;
        }
        return minIndex;
    }
}