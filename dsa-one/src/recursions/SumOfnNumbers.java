package recursions;

public class SumOfnNumbers {
    public static void main(String[] args) {
        // sum of n natural numbers using recursion
        // a^b using recursion

        System.out.println("Sum of first 'n' natural numbers => " + sum(5));
        System.out.println("A raised to the Power B => " + aToThePowerb(2,7));

    }

    public static int sum(int n){
        if(n==1) return 1;
        return n + sum(n-1);
    }

    public static long aToThePowerb(long a, long b){
        if(b==1) return a;
        return a*aToThePowerb(a,b-1);
    }
}
