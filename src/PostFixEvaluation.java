import java.util.Stack;

public class PostFixEvaluation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String[] arr = new String[]{"2", "1", "+", "3", "*", "5", "*"};

        Stack<String> stk = new Stack<String>();

        String operators = "/*-+";

        for (String str : arr) {

            if (!(operators.contains(str))) {
                stk.push(str);
            } else {
                int a = Integer.valueOf(stk.pop());
                int b = Integer.valueOf(stk.pop());

                switch (str) {

                    case "+":
                        stk.push(String.valueOf(a + b));
                        break;

                    case "-":
                        stk.push(String.valueOf(a * b));
                        break;

                    case "/":
                        stk.push(String.valueOf(a / b));
                        break;

                    case "*":
                        stk.push(String.valueOf(a * b));
                        break;

                }

            }

        }

        System.out.println(stk.pop());

    }

}
