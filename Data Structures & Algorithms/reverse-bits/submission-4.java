

class Solution {

    public boolean canAttendMeetings(List<Interval> intervals) {

        // sort by start time
        intervals.sort((a, b) -> a.start - b.start);

        // check overlap
        for (int i = 1; i < intervals.size(); i++) {

            int prevEnd = intervals.get(i - 1).end;

            int currStart = intervals.get(i).start;

            // overlap exists
            if (currStart < prevEnd) {
                return false;
            }
        }

        return true;
    }
}