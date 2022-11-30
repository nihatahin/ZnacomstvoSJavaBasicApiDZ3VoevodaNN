package task3;

import java.util.ArrayList;
import java.util.Random;

public class task {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 5; ++i)
            list.add(rand.nextInt(10));
        System.out.printf("Input array: ");
        System.out.println(list.toString());

        int max = list.get(0);
        int min = list.get(0);
        int sum = list.get(0);
        for (int i = 1; i < list.size(); ++i)
        {
            if (max < list.get(i))
                max = list.get(i);
            if (min > list.get(i))
                min = list.get(i);

            sum += list.get(i);
        }
        
        System.out.printf("\n\nMaximal element: ");
        System.out.println(max);
        System.out.printf("Minimal element: ");
        System.out.println(min);
        System.out.printf("Arithmetic mean: ");
        System.out.println((double)sum / list.size());
    }
}
