package lab1;

public class Multiples {
    public static void main(String[] args){

        System.out.println(multiples());
    }

    private static int multiples() {
        int multiplesOf3 = 0;
        int multiplesOf5 = 0;
        int multiplesOf3and5 = 0;

        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                multiplesOf3and5 += 1;
            } else if (divisibleBy3) {
                multiplesOf3 += 1;
            } else if (divisibleBy5) {
                multiplesOf5 += 1;
            }
        }

        return multiplesOf3 + multiplesOf5 + multiplesOf3and5;
    }
}
