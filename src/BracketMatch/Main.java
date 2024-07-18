package BracketMatch;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //String s = "({[]})"; // match
        //String s = "({[]})]"; // no match one extra in the end
        // String s ="[[]"; // one extra at the begining
        String s = "{ hello ( world ) [ test ] }";

        String[] testCases = {
                "(())",
                "{[]}",
                "())",
                "{(})",
                "{ ( [ ] { } ) }",
                "{ ( [ { ] ) }",
                "",
                "()",
                "{}",
                "[]",
                "{ [ ) ] }",
                "{ [ ( { } ) [ ] ] }",
                "{ hello ( world ) [ test ] }",
                "Hello world!",
                "(())(",
                "{[]}[",
                "{[",
                "})"
        };

        for (String testString : testCases) {
            System.out.println(testString + "---" + validate(testString));
        }

    }

    public static boolean validate(String s) {
        if(s.isEmpty())
        {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(s.charAt(i));
            }
            else
            {
                if (stack.empty())
                {
                    return false;
                }
                else
                {
                    if (currentChar == ')' || currentChar == '}' || currentChar == ']')
                    {
                        Character top = stack.peek();
                        if (((currentChar == ')') && (top == '(')) || ((currentChar == ']') && (top == '[')) || ((currentChar == '}') && (top == '{')))
                        {
                            stack.pop();
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
            }
        }

        return stack.empty();

    }

}
