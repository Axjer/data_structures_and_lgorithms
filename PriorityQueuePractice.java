import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {

    public static void main(String[] args) {
        // PriorityQueue(優先佇列):先進先出(First-In First-Out)的資料結構
        // 會優先處理具有最高優先權的元素
        // 之後才處理優先權較低的元素

        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(1.0);
        queue.offer(2.5);
        queue.offer(3.0);
        queue.offer(1.5);
        queue.offer(5.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // 由小到大排序
        }
    }

    /*
     * Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
     * 
     * queue.offer(1.0);
     * queue.offer(2.5);
     * queue.offer(3.0);
     * queue.offer(1.5);
     * queue.offer(5.0);
     * 
     * while (!queue.isEmpty()) {
     * System.out.println(queue.poll()); // 使用Collections.reverseOrder():由大到小排序
     * }
     */
}