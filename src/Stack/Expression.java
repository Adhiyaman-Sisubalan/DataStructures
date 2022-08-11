package Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBrackets  = Arrays.asList('(','[','{','<');
    private final List<Character> rightBrackets  = Arrays.asList(')',']','}','>');

    //([1=2])
    public boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        for (var ch: input.toCharArray()) {
            if(isLeftBrackets(ch))
                stack.push(ch);
            if(isRightBrackets(ch)){
                if(stack.empty()) return false;

                var top= stack.pop();
                if(!isMatch(top,ch))
                    return false;
            }
        }
        return stack.empty();
    }

    private boolean isLeftBrackets(char ch){
        return leftBrackets.contains(ch);
    }
    private boolean isRightBrackets(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean isMatch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
