/**
 * Recursion
 */
public class Recursion {
    public static void main(String[] args) {

        int num = 6;

        java.lang.Long factorial = factorial(num);
        System.out.println("Loop Factorial: " + factorial);

        java.lang.Long recursive_factorial = Recursivefactorial(num);
        System.out.println("Recursive Factorial: " + recursive_factorial);
    }

    private static java.lang.Long Recursivefactorial(int num) {

        if (num < 0) {
            return null;
        }
        
        else if (num == 0) {
            return (long) 1;
        }

        return num * factorial(num - 1);

    }

    private static java.lang.Long factorial(int num) {

        if(num < 0){
            return  null;
        }

        else if (num == 0) {
            return (long) 1;
        }

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}