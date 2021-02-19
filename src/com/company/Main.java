package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

int x = 0;
int y = 0;
int calcular = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        x = ler.nextInt();
        System.out.println("Digite outro número: ");
        y = ler.nextInt();

        System.out.println("Escolha sua operação: ");
        System.out.println("[1]Somar\n [2]Subtrair\n [3]Multiplicar\n [4]Dividir");
        calcular = ler.nextInt();
            if (calcular == 1){
                soma(x,y);
            }
            if (calcular == 2){
            sub(x,y);
        }
            if (calcular == 3){
            mult(x,y);
        }
            if (calcular == 4){
            div(x,y);
        }
             else {
                System.out.println("Opção invalida");
            }
    }


    static void soma(int x , int y){
        System.out.println(x+y);
    }
    static void sub(int x , int y){
        System.out.println(x-y);
    }
    static void mult(int x , int y){
        System.out.println(x*y);
    }
    static void div(int x , int y){
        System.out.println(x/y);
    }

}
