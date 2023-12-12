package atividade12_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista01Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		int num;
		boolean encontrado = false;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		for(int i=0;i<numeros.size();i++){
			if(num == numeros.get(i)){
				encontrado = true;
				System.out.println("O número "+ num +" está localizado na posição: "+ i);
			}
		}
        if(!encontrado){
            System.out.println("O número " + num + " não foi encontrado!");
        }
		leia.close();
	}

}
