package lab1;

public class Multiples {
    public static void main(String[] args){
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int multiplesOfA = 0;
        int multiplesOfB = 0;
        int multiplesOfAandB = 0;

        // can implement an alternative solution with constant runtime by
        // computing (floor of n/3 + floor of n/5 - floor of n/15)
        for (int i = 1; i < n; i++) {
            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA && divisibleByB) {
                multiplesOfAandB += 1;
            } else if (divisibleByA) {
                multiplesOfA += 1;
            } else if (divisibleByB) {
                multiplesOfB += 1;
            }
        }

        return multiplesOfA + multiplesOfB + multiplesOfAandB;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
