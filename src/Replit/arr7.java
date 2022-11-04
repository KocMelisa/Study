package Replit;

import java.util.ArrayList;
import java.util.List;

public class arr7 {

    public static void main(String[] args) {

        /*

        Array i ARRAYLIST e çeviren Java Kodunu yazınız.

        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

        Beklenen Çıktı:

        [Python, JAVA, PHP, Perl, C#, C++]

         */

        String arr[] = { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };

        List<String> liste = new ArrayList<>();

        for ( String w : arr) {

            liste.add(w);

        }

        System.out.println(liste);

















    }
}
