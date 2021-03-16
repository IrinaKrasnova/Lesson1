import java.util.Arrays;

public class DZ3Krasnova {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        System.out.println("Задание 1:");
        System.out.println(Arrays.toString(array1));
        task1(array1);
        System.out.println(Arrays.toString(array1));
        int[] array2 = new int[8];
        task2(array2);
        System.out.println("Задание 2:");
        System.out.println(Arrays.toString(array2));
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3:");
        System.out.println(Arrays.toString(array3));
        task3(array3);
        System.out.println(Arrays.toString(array3));
        System.out.println("Задание 4:");
        System.out.println("Max="+ taskMax(array3));
        System.out.println("Min="+ taskMin(array3));
    }

    public static void task1(int[] array1) {
        for (int i = 0; i < array1.length; i++)
            if (array1[i] == 1) {
                array1[i] = 0;
            } else {
                array1[i] = 1;
            }
    }

    public static void task2(int[] array2) {
        for (int i = 0; i < array2.length; i++)
            array2[i] = i * 3 + 1;
    }

    public static void task3(int[] array3) {
        for (int i = 0; i < array3.length; i++)
            if (array3[i] < 6) {
                array3[i] *= 2;
            } else {
                array3[i] = array3[i];
            }
    }
    public static int taskMax (int[] array3) {
        int max = array3[0];
        for (int index : array3)
        if (index>max)
            max=index;
        return  max;

    }
    public static int taskMin (int[] array3) {
        int min = array3[0];
        for (int index : array3)
            if (index<min)
                min=index;
        return  min;

    }
}
