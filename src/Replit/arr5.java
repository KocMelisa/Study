package Replit;

import java.util.Arrays;

public class arr5 {

    public static void main(String[] args) {

        /*

        Yazılan değerin array içerisinde arayan Java Kodu yazınız.
        Array: [1551,1223,1443,1267,1789,1023,2020]
        Aranan Değer:2020
        Beklenen Çıktı:**True**
        Aranan Değer:2010
        Beklenen Çıktı :**False**

         */

        int arr[] = { 1551,1223,1443,1267,1789,1023,2020};

        int one = Arrays.binarySearch(arr, 2020);

        if (one >= 0){
            System.out.println("**True**");
        } else {
            System.out.println("**False**");
        }


        int two = Arrays.binarySearch(arr, 2010);
        if (two >= 0){
            System.out.println("**True**");
        } else {
            System.out.println("**False**");
        }






















    }
}
