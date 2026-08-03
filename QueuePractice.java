import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        // Queue(佇列):先進先出(First-In First-Out)的資料結構
        // 一種專為在處理前暫存/持有元素而設計的集合
        // 線性資料結構

        // offer():新增元素
        // poll():移除元素

        Queue<String> queue = new LinkedList<String>();

        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");

        queue.poll();

        System.out.println(queue); // [b, c, d, e]
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.size()); // 4
        System.out.println(queue.contains("c")); // true

        // Queue(佇列)的用途

        // 1. 鍵盤緩衝區
        // 2. 印表機佇列
        // 3. 用於鏈結串列(LinkedLists)、優先佇列(PriorityQueues)與廣度優先搜尋(Breadth-first search)
    }
}