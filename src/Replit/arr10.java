package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class arr10 {

    public static void main(String[] args) {

        /*

        Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

        Test Data:

        sentence -> "Java is fun"

        reversed **-> "**fun is Java**"**

         */

        Scanner input = new Scanner(System.in);
        System.out.println("cumle giriniz");
        String sentence = input.nextLine();
        String reversed = "";

        sentence = sentence.replaceAll("\\p{Punct}", "");
        String words[] = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for (int i = words.length; i >=0 ; i--) {

            reversed += i;

        }
        System.out.print("**" + reversed + "**");











    }
}
