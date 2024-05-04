package work;

import java.util.Arrays;

public class CharacterSorting {
    public static void main(String[] args) {

        String string = "10,20,50,30,40";
        descendingSort(string);
    }


    public static void descendingSort(String str) {

        String[] split = str.split(",");

        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        System.out.println(Arrays.toString(arr));


    }
}
