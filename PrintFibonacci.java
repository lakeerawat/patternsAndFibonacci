package Patterns;

public class PrintFibonacci {
    public static void main(String[] args) {
        Fib(120);
    }
    static void Fib(int n){
        int n1 = 0, n2 = 1, nextTerm;

        nextTerm = n1 + n2;

        while (nextTerm <= n) {

            // print the next term
            System.out.println(nextTerm);
            n1 = n2;
            n2 = nextTerm;
            nextTerm = n1 + n2;
        }
    }

    }

