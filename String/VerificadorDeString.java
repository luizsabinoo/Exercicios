package String;

import java.util.Scanner;

public class VerificadorDeString {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma String");
        String input = entrada.nextLine();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' || ch <= 'A') {
                count++;
            }

    }

        if (count == 0) {
            System.out.println("A letra 'a' ou 'A' aparece" + count + " vezes");

        }else {
            System.out.println("A letra 'a' ou 'A' não aparece");
        }

        entrada.close();



    }

}
