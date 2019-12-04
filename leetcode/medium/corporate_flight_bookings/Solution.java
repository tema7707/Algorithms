class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] flags = new int[n+1];
        for (int i = 0; i < bookings.length; i++) {
            flags[bookings[i][0]-1] += bookings[i][2];
            flags[bookings[i][1]] -= bookings[i][2];
        }

        int[] ans = new int[n];
        int curr = 0;
        for (int i = 0; i < n; i++) {
            ans[i] = curr + flags[i];
            curr = ans[i];
        }

        return ans;
    }
}