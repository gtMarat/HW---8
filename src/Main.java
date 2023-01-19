import java.util.Arrays;
import java.util.MissingFormatArgumentException;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1 и 2");
        int[] weights = new int[3];
        double[] weight = new double[]{1.57, 7.654, 9.986};
        int[] number = {150, 200, 300, 420, 490, 270, 120, 90};


        for (int i = 0; i < weights.length; i++) {
            weights[i] = i + 1;
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }
        {
            {
                for (int i = 0; i < weight.length; i++) {
                    if (i == weight.length - 1) {
                        System.out.println(weight[i]);
                        break;
                    }
                    System.out.print(weight[i] + ", ");
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] weights = new int[3];
        double[] weight = new double[]{1.57, 7.654, 9.986};
        int[] number = {150, 200, 300, 420, 490, 270, 120, 90};

        {
            for (int i = weights.length - 1; i >= 0; i--) {
                weights[i] = i + 1;
                System.out.print(weights[i]);
                if (i != 0)
                    System.out.print(",");
            }
            System.out.println();
        }
        {
            {
                for (int i = weight.length - 1; i >= 0; i--) {
                    System.out.print(weight[i]);
                    if (i != 0)
                        System.out.print(",");
                }
                System.out.println();
            }

            for (int i = number.length - 1; i >= 0; i--) {
                System.out.print(number[i]);
                if (i != 0)
                    System.out.print(",");
            }
            System.out.println();
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] weights = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weights));
    }
}
