import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    // use this array class in order to simplify the code
    private final List<Character> leftBrackets =
            Arrays.asList('(','<','[','{');
    private final List<Character> rightBrackets =
            Arrays.asList(')','>',']','}');

    public Boolean isBalanced(String input){

        //we need stack to store left prackets
        Stack<Character> stack = new Stack<>();
        // we need to iterate and fill the stack with left bracket
        for (char ch : input.toCharArray()) {
            if (isLeftBrackeet(ch)) {
                stack.push(ch);
            }
         //we need to remove the right bracket
            if (isRightBrackets(ch)) {
                if (stack.empty()) return false; // if there is right brackets condition can not be done

               var top = stack.pop();
               if (!bracketsMatch(top,ch))
                   return false;
            }
        }
        return stack.empty();
        // if the stack is empty we will return true the string is balanced
        // if the stack is false that mean that we opened brackets and didn't close it
    }
    private boolean isLeftBrackeet(char ch){
        return leftBrackets.contains(ch); //ch == ''( || ch =='<' || ch == '[' || ch == '{';
    }
    private  boolean isRightBrackets(char ch){
        return rightBrackets.contains(ch);//ch == ')'|| ch =='>' || ch == ']' || ch == '}';
    }

    private  boolean bracketsMatch(char left , char right){
          return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);//make sure the brackets on arrays have the same order

                  /*(right == ')'&& left != '(') ||
                (right == '>'&& left != '<') ||
                (right == ']'&& left != '[') ||
                (right == '}'&& left != '{');*/
    }
}




