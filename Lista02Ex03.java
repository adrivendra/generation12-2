package atividade12_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lista02Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set <Integer> setInt = new HashSet <Integer>();
		int num;
		
		
		for(int i=0;i<10;i++){
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			setInt.add(num);
		}
		
		Iterator <Integer> iSetInt = setInt.iterator();
		System.out.println("");
		System.out.println("Listar dados do Set: \n");
		while(iSetInt.hasNext()){
			System.out.println(iSetInt.next());
		}
		leia.close();
	}

}
