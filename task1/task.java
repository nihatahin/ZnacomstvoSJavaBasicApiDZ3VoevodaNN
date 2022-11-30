package task1;

import java.util.Arrays;


public class task {

    public static void main(String[] args) {
        int[] data = {4, 10, 5, 6, 0, 7};
        System.out.printf("Input array: ");
        System.out.println(Arrays.toString(data));
        System.out.println("\n");
        int[] fin_data = merge_sort(data);

        System.out.printf("\n\nOutput array: ");
        System.out.println(Arrays.toString(fin_data));
    }
    
    public static int[] merge_sort(int[] array) {
        int lenArr = array.length;
        if (lenArr <= 1)
            return array;
        else
        {
            int lenLeft = lenArr/2;
            int[] left = new int[lenLeft];
            for (int i = 0; i < lenLeft; ++i)
                left[i] = array[i];


            int lenRight = ((lenArr % 2) > 0) ? (lenArr / 2 + 1) : lenArr / 2;
            int[] right = new int[lenRight];
            for (int i = 0; i < lenRight; ++i)
                right[i] = array[lenLeft + i];


            
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
            System.out.println("//----------");
            
            int[] mod_left = merge_sort(left); 
            int[] mod_right = merge_sort(right);
            

            int r_i = 0;
            int l_i = 0;
            for (int i = 0; i < lenArr; ++i)
            {
                

                if (r_i >= lenRight)
                {
                    array[i] = mod_left[l_i];
                    ++l_i;
                }
                else if (l_i >= lenLeft)
                {
                    array[i] = mod_right[r_i];
                    ++r_i;
                }
                else
                {
                    if (mod_left[l_i] < mod_right[r_i])
                    {
                        array[i] = mod_left[l_i];
                        ++l_i;
                    }
                    else
                    {
                        array[i] = mod_right[r_i];
                        ++r_i;
                    }
                }

            }
            
            System.out.println(Arrays.toString(array));
            return array;
        }
    }
}