import java.util.Stack;

public class StackPractice {
   public static void main(String[] args) {
      Stack<String> stack = new Stack<String>();

      stack.push("1");
      stack.push("2");
      stack.push("3");
      stack.push("4");
      stack.push("5");

      String removeNum = stack.pop();

      System.out.println(stack);
      System.out.println(stack.peek());
      System.out.println(removeNum);
      System.out.println(stack.search("3"));
   }
}
