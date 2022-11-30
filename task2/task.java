package task2;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Random;


public class task {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; ++i)
            list.add(rand.nextInt(10));
        System.out.printf("Input array: ");
        System.out.println(list.toString());
        int i = 0;
        while(i < list.size())
        {
            if ((list.get(i) % 2) == 0)
                list.remove(i);
            else 
                ++i;
        }
        System.out.printf("\n\nOutput array: ");
        System.out.println(list.toString());
    }
}
