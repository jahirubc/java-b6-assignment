public class Assignment2withRecursion {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Factorail: "+ factorial(a));
        System.out.println("Fibonnacci series for " + a);
        for (int i = 1; i <= a; i++) {
            System.out.print(fibonacci(i)+ " ");
        }
    }
    public static int factorial(int n){
        if (n==0) return 1;
        else
            return n * factorial(n-1);
    }

    public static int fibonacci(int n){
        if (n <= 1) return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
