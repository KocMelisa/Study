package Replit;

public class arr3 {

    /*
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
    Array =  [20, 30, 25, 35, -16, 60, -100 ]
    ```
    Beklenen Çıktı:
    ```
    ```
    Array Sayılarının ortalaması: 7.0
     */

    public static void main(String[] args) {

        int arr[] = {20, 30, 25, 35, -16, 60, -100 };
        int sum = 0 ;

        for (int w:arr) {

            sum += w;

        }

        double ort = (sum/arr.length) ;

        System.out.println("Array sayilarin ortalamasi: " + ort);









    }
}
