package stackAndQueue;

public class ValidateBrackets {

    public boolean validateBrackets(String str )
    {

        Stack<Character> stack= new Stack();
        char charToCheck =0;
        if (str.length() == 0){
            throw new IllegalStateException();
        }
        if( str.length() == 1 || str == null )
            return false;
        else {
        for (int i =0; i< str.length(); i++) {
            charToCheck = str.charAt(i); //The charAt() method returns the character at the specified index in a string. w3schools
            if (charToCheck == '(' || charToCheck == '{' || charToCheck == '[')
                stack.push(charToCheck);

        else{
                if (stack.isEempty())
                    return false;
                if (charToCheck == ')' || charToCheck == '}' || charToCheck == ']')
                    if (charToCheck == ')' && stack.peek() == '(')
                        stack.pop();
                    else if (charToCheck == '}' && stack.peek() == '{')
                        stack.pop();
                    else if (charToCheck == ']' && stack.peek() == '[')
                        stack.pop();
                    else return false;
            }}
        return true;
    }}
}


