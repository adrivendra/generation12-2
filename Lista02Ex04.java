package atividade12_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lista02Ex04 {

	public static void main(String[] args) {
		Set <Integer> setNum = new HashSet <Integer>();
		Scanner leia = new Scanner(System.in);
		boolean encontrado = false;
		int num;
								
		setNum.add(2);
		setNum.add(5);
		setNum.add(1);
		setNum.add(3);
		setNum.add(4);
		setNum.add(9);
		setNum.add(7);
		setNum.add(8);
		setNum.add(10);
		setNum.add(6);
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		for(int i=0;i<setNum.size();i++){
			if(setNum.contains(num)){
				encontrado = true;
				System.out.println("O número "+ num +" foi encontrado!");
				break;
			}
			
		}
		if(!encontrado){
			System.out.println("O número 40 não foi encontrado!");
		}
		leia.close();
		
		
		
		
	}

}
