package Trabalho_13_03_2023;

import java.util.Scanner;

/*
2) Crie uma estrutura chamada Retangulo. Essa estrutura deverá conter o ponto superior esquerdo e o ponto inferior
direito do retângulo. Cada ponto é definido por uma estrutura Ponto, criada no exercício anterior. Faça um programa
que declare e leia uma estrutura Retangulo e exiba a área, o comprimento da diagonal e o perímetro desse retângulo.
*/

/*
3) Usando as estruturas Retangulo e Ponto dos exercícios anteriores, faça um programa que declare e leia uma estrutura
Retangulo e um Ponto e informe se esse ponto está ou não dentro do retângulo.
*/

public class Ex_02_03 {
    public static void main (String []args){
        System.out.println("Digite as coord. do Ponto Superior: ");
        Scanner e = new Scanner(System.in);
        Ponto ps = new Ponto(e.nextDouble(), e.nextDouble());
        System.out.println("Digite as coord. do Ponto Inferior: ");
        Ponto pi = new Ponto(e.nextDouble(), e.nextDouble());
        
        Retangulo re = new Retangulo(ps, pi);
        System.out.println("retangulo: " + re);
        System.out.println("Area: " + re.getArea());
        System.out.println("Perimetro: " + re.getPerimetro());
        System.out.println("Diagonal: "+re.getDiagonal());
        
        System.out.println("Digite as coord. do Ponto Verificado: ");
        Ponto pv = new Ponto(e.nextDouble(), e.nextDouble());
        
        if(re.verfPonto(pv)){
            System.out.println("Ponto "+pv+" esta dentro");
        }else{
            System.out.println("Ponto "+pv+" nao esta dentro");
        }
    }
}
