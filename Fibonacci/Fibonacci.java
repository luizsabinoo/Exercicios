package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n){
        if(n == 0 || n == 1){

            return n;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }


    public static boolean pertenceFibonacci(int numero){
        if (numero == 0 || numero == 1 ){
            return true;
        }

        int a = 0;
        int b = 1;

        while(b < numero){
            int temp = b;
            b = a + b;
            a = temp;
        }

        if (b == numero || a == numero){
            return true;
        }else {
            return false;
        }

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para a sequencia de fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)){
            System.out.println("O numero " + numero + " é da sequencia de fibonacci");
        }else {
            System.out.println("O numero " + numero + "não é da sequencia de fibonacci");
        }

        int n = 11;
        System.out.println("Fibonaaci de " + n + " é: " + fib(n));

        scanner.close();
    }
}
