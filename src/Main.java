import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        double[] fractions = {1.57, 7.654, 9.986};
        int[] arbitrary = new int[5];
        arbitrary[0] = 17;
        arbitrary[1] = 25;
        arbitrary[2] = 33;
        arbitrary[3] = 40;
        arbitrary[4] = 52;
        System.out.println("Задача №2");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i] + " ");
                break;
            }
            System.out.print(numbers[i] + " , ");
        }
        System.out.println(" ");
        for (int i = 0; i < fractions.length; i++) {
            if (i == fractions.length - 1) {
                System.out.print(fractions[i] + " ");
                break;
            }
            System.out.print(fractions[i] + " , ");
        }
        System.out.println(" ");
        for (int i = 0; i < arbitrary.length; i++) {
            if (i == arbitrary.length - 1) {
                System.out.print(arbitrary[i] + " ");
                break;
            }
            System.out.print(arbitrary[i] + " , ");
        }
        System.out.println(" ");
        System.out.println("Задача №3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + " ,");
            }
            {
                if (i == 0) {
                    System.out.print(numbers[i]);
                }
            }
        }
        System.out.println(" ");
        for (int i = fractions.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(fractions[i] + " ,");
            }
            {
                if (i == 0) {
                    System.out.print(fractions[i]);
                }
            }
        }
        System.out.println(" ");
        for (int i = arbitrary.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arbitrary[i] + " ,");
            }
            {
                if (i == 0) {
                    System.out.print(arbitrary[i]);
                }
            }
        }

        System.out.println(" ");
        System.out.println("Задача №4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                numbers[i] = numbers[i] + 1;}
                System.out.print(Arrays.toString(numbers));
            }

        }










