
class Solution {
    int missingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }

        return sum;
    }
}