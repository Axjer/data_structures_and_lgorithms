import java.util.Stack;

public class StackPractice {
   public static void main(String[] args) {

      // stack(堆疊):後進先出(Last-In First-Out)的資料結構

      // push():將資料新增至最頂端
      // pop():從最頂端移除資料

      Stack<String> stack = new Stack<String>();

      stack.push("Java");
      stack.push("Python");
      stack.push("JavaScript");
      stack.push("HTML");
      stack.push("CSS");

      stack.pop(); // 移除"CSS"
      stack.pop(); // 移除"HTML"

      System.out.println(stack); // ["Java", "Python", "JavaScript"]
      System.out.println(stack.peek()); // JavaScript，peek():回傳目前最上面那筆資料
      System.out.println(stack.search("Python")); // 2，search():尋找並回傳指定元素在堆疊中的位置，找不到指定元素回傳-1

      // stack(堆疊)的用途

      // 1. 文字編輯器中的「復原／重做」功能 (Undo / Redo)
      // 2. 瀏覽器歷史紀錄的「上一頁／下一頁」切換
      // 3. 回溯演算法
      // 4. 函式呼叫(call stack，呼叫堆疊)
   }
}
