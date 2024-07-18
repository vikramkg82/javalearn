package BracketMatch;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

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
                "})",
                 "hi ()"
        };

       for (String testString : testCases) {
            System.out.println(testString + "---" + validate(testString));
       }
        System.out.println(validate("())"));

    }

    public static boolean validate(String s) {
        if (s.isEmpty()) {
            return false;
        }

        if (s.contains("(") || s.contains("{") || s.contains("[")) {

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                Character currentChar = s.charAt(i);
                if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                    stack.push(currentChar);
                } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                    if (stack.empty()) {
                        return false;
                    }
                    Character top = stack.pop();
                    if (((currentChar == ')') && (top != '(')) || ((currentChar == ']') && (top != '[')) || ((currentChar == '}') && (top != '{'))) {
                        return false;
                    }

                }
            }


            return stack.empty();
        }
       else
           return false;
    }
}
