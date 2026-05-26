

class Solution {
    public int lastStoneWeight(int[] stones) {

        // Max Heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        // Put all stones into heap
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        // Continue until one or zero stones remain
        while (maxHeap.size() > 1) {

            // Take two largest stones
            int y = maxHeap.poll();
            int x = maxHeap.poll();

            // If not equal, insert difference
            if (y != x) {
                maxHeap.add(y - x);
            }
        }

        // If heap empty return 0
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}