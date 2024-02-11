package Trabalho_13_03_2023_Professor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		/*
		System.out.print("Digite as coordenadas do Ponto 1: ");
		Ponto p1 = new Ponto(e.nextDouble(), e.nextDouble());		

		System.out.print("Digite as coordenadas do Ponto 2: ");
		Ponto p2 = new Ponto(e.nextDouble(), e.nextDouble());		
		
		System.out.println("Ponto 1: " + p1 + "\nPonto 2: " + p2);
		
		double dp1p2 = p1.distancia(p2);
		System.out.println("Distância P1 a P2: " + dp1p2);
		
		double dp2p1 = p2.distancia(p1);
		System.out.println("Distância P2 a P1: " + dp2p1);
		/**/
		
		System.out.print("Digite as coordenadas do Ponto Superior: ");
		Ponto ps = new Ponto(e.nextDouble(), e.nextDouble());
		System.out.print("Digite as coordenadas do Ponto Inferior: ");
		Ponto pi = new Ponto(e.nextDouble(), e.nextDouble());
		
		Retangulo retangulo = new Retangulo(ps, pi);
		System.out.println("Retângulo:\n" + retangulo);
		System.out.println("Área: " + retangulo.getArea());
		System.out.println("Perímetro: " + retangulo.getPerimetro());
		System.out.println("Diagonal: " + retangulo.getDiagonal());
		
		System.out.print("Digite as coordenadas do Ponto Verificado: ");
		Ponto pv = new Ponto(e.nextDouble(), e.nextDouble());
		
		if(retangulo.pertence(pv)) {
			System.out.println("Ponto " + pv + " está dentro do Retângulo.");
		}else {
			System.out.println("Ponto " + pv + " está fora do Retângulo.");
		}

	}
}
