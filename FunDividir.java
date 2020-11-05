package es.Studium.FunDividir;

import java.util.Scanner;

public class FunDividir {

	public static void main(String[] args) 
	
	{int numero1, numero2;
	float resultado;
	Scanner teclado= new Scanner (System.in);
	System.out.println("Dame un número entero");
	numero1=teclado.nextInt();
	do//HACER
	{
	System.out.println("Dame otro número entero (Que no sea 0)");
	numero2=teclado.nextInt();
	}while(numero2==0);//MIENTRAS (numero2=0)
	teclado.close();
	resultado= funDividir(numero1, numero2);
	System.out.println("La dividión es " + resultado);	
	}
	public static float funDividir(int a, int b)
	{
		return ((float)a/(float)b);
	}
	
}
