package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arr8 {

    public static void main(String[] args) {

        /*

        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
        Array: [1232,2345,5467,678,3454,2312,3451]

         */

        int arr[] = { 1232,2345,5467,678,3454,2312,3451 };
        Arrays.sort(arr);
        List<Integer> liste = new ArrayList<>();

        for ( int w : arr) {

            liste.add(w);

        }

        System.out.println(liste);
        System.out.println(liste.get(liste.size()-2));
















    }
}
