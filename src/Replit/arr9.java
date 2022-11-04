package Replit;

public class arr9 {

    public static void main(String[] args) {

        /*

        Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

        Array: [1,2,3,4,5,6,7,8,9]

        Beklenen Çıktı:

        Tek Sayilar: 5

        Cift Sayilar: 4

         */

        int arr[] = {1,2,3,4,5,6,7,8,9};

        int counterTek = 0;
        int countercift = 0;

        for (int w :arr) {
            if (w%2 == 0){
                countercift++;
            } else if (w%2 == 1) {
                counterTek++;
            }
        }

        System.out.println("Tek sayilar: " + counterTek);
        System.out.println("Cift sayilar: " + countercift);














    }
}
