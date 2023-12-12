package atividade12_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista01Ex01 {

	public static void main(String[] args) {
		ArrayList <String> nomes = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		String cores;
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite uma cor: ");
			cores = leia.nextLine();
			nomes.add(cores);
		}
		
		System.out.println("\"Listar todas as cores:\n");
		for(String n : nomes){
			System.out.println(n);
		}
		
		
		Collections.sort(nomes);
		System.out.println("Ordenar as cores:\n");
		for(String n : nomes){
			System.out.println(n);
		}
		leia.close();
	}

}
