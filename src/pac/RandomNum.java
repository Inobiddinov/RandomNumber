package pac;

import java.security.SecureRandom;

public final class RandomNum {

    public static final SecureRandom SECURE_RANDOM = new SecureRandom();

    public static void main(String[] args) {
        System.out.println("Generating a number between 1 and 100...");
        System.out.println(randomNumberBetween(1, 100));
    }

    private static int randomNumberBetween(int minimum, int maximum) {
        return SECURE_RANDOM.nextInt(maximum - minimum) + minimum;
    }

}