package Stack;

/*Учитывая строку s, содержащую только символы '(', ')', '{', и '}', определите, допустима ли входная строка.'['']'
Входная строка действительна, если:
Открытые скобки должны быть закрыты однотипными скобками.
Открытые скобки должны быть закрыты в правильном порядке.
Каждой закрывающей скобке соответствует открытая скобка того же типа.*/

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (
                    stack.isEmpty() &&
                            (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            ) {
                return false;
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(' && s.charAt(i) == ')') {  //peek()-узнаем последний элемент в стеке, не удаляя его оттуда
                        stack.pop(); //pop()-вытаскивает последний элемент
                    } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                        stack.pop();
                    } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                        stack.pop();
                    } else stack.add(s.charAt(i));
                } else stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
