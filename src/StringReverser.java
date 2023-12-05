import java.util.Stack;

public class StringReverser {

    public String reverse(String input){
        if(input == null)
            throw new IllegalArgumentException();
        //iterate over the input string , Create Stack to hold Each Charatcter
        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray())
            stack.push(ch);

        //take character from the top of the stack and saved into reversed variable
        StringBuffer reversed = new StringBuffer(); //StringBuffer Class used in situation where their is alot of string manipulation

        while(!stack.empty())
            reversed.append(stack.pop());
        return reversed.toString();
    }
}
