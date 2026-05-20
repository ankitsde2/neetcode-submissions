/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int[] s = new int[n];
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = intervals.get(i).start;
            e[i] = intervals.get(i).end;
        }
        Arrays.sort(s);
        Arrays.sort(e);
        int rooms = 0;
        int i = 0;
        int j = 0;
        int maxRooms = 0;
        while (i < n) {
            if (s[i] < e[j]) {
                rooms++;
                maxRooms = Math.max(rooms, maxRooms);
                i++;
            } else {
                rooms--;
                j++;
            }
        }
        return maxRooms;
    }
}
