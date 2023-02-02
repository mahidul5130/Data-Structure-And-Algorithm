import java.util.LinkedList;
import java.util.Stack;

import javax.print.DocFlavor.STRING;

public class App {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String stringLowerCase = string.toLowerCase();

        for (int i = 0; i < stringLowerCase.length(); i++) {
            char c = stringLowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reverseStringNoPunctuation = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverseStringNoPunctuation.append(stack.pop());
        }

        // System.out.println(reverseStringNoPunctuation);
        // System.out.println(stringNoPunctuation);

        return reverseStringNoPunctuation.toString().equals(stringNoPunctuation.toString());
    }
}
