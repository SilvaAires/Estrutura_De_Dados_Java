package Trabalho_13_03_2023;

import java.util.Scanner;

/*
1) Crie uma estrutura para representar as coordenadas de um ponto no plano (posições X e Y). Em seguida, declare e
leia do teclado dois pontos e exiba a distância entre eles.
*/

/*
double xx2 = -5;
        double yy2 = 3;
        System.out.println("P2 x = "+ xx2);
        System.out.println("P2 y = "+ yy2);
        
        Scanner e = new Scanner(System.in);
        Ponto p1 = new Ponto();
        //p1.x = e.nextDouble();
        //p1.y = e.nextDouble();
        p1.setX(3);
        p1.setY(4);
        //p1.status();
        System.out.println(p1);
        
        Ponto p3 = new Ponto(8, -2);
        //p3.status();
        System.out.println(p3);
*/

public class Ex_01 {
    public static void main (String []args){ 
        Scanner e = new Scanner(System.in);
        
        System.out.print("Digite X e Y do Ponto1: ");
        Ponto p1 = new Ponto(e.nextDouble(), e.nextDouble());
        
        System.out.print("Digite X e Y do Ponto2: ");
        Ponto p2 = new Ponto(e.nextDouble(), e.nextDouble());
 
        System.out.println("Ponto 1: "+p1+"\nPonto 2: "+p2);
        
        double dp1p2 = p2.distancia(p1);
        System.out.println("Distancia P1 a P2: "+dp1p2);
    }
}