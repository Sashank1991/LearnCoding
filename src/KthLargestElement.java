import java.util.PriorityQueue;

/**
 * Created by sasha on 6/13/2017.
 */

// this can also be done by max heap
//below is implementation using heap because queue is created in heap memory.
//as queue is fifo offer inserts new elements and poll removes the lowes element so only top k elements are maintianed in the queuue
public class KthLargestElement {

    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 7, 8, 9, 3, 1, 2, 14, 15, 16, 19, 20};
        int num = findKthLargestElement(arr, 3);
        System.out.println(num);
    }

    private static int findKthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        for (int i : nums) {
            que.offer(i);
            if (que.size() > k) {
                que.poll();
            }
        }
        return que.peek();
    }
}
