import java.util.LinkedList;

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

        string = string.toLowerCase();
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') {
                
                stack.push(string.charAt(i));
                queue.addLast(string.charAt(i));

            }
        }
        
        boolean palindrome = true;

        if (stack.size() == queue.size()) {
            for (int i = 0; i < stack.size(); i++) {
                if (stack.pop() != queue.remove()) {
                    palindrome = false;
                    break;
                }
            }
        }

        else{
            palindrome = false;
        }
        
        System.out.println(stack);
        System.out.println(queue);

        return palindrome;
    }
}