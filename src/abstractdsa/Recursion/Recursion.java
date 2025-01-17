package abstractdsa.Recursion;

public class Recursion {
    public static void main(String[] args){
        walk(5);

        System.out.println(power(2, 8));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1; // base case
        return base * power(base, exponent -1);
    }

    private static void walk(int steps){
        if (steps< 1)return;
        System.out.println("You take a step!");
        walk(steps-1);
    }
}
