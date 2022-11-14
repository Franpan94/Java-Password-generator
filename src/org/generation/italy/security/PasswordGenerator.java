package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Inserisci nome: ");
		   String name = sc.nextLine();
		   System.out.println("Nome: " + name);
		   
		   System.out.print("Inserisci cognome: ");
		   String surname = sc.nextLine();
		   System.out.println("Cognome: " + surname);
		   
		   System.out.print("Inserisci colore preferito: ");
		   String clr = sc.nextLine();
		   System.out.println("Colore preferito: " + clr);
		   
		   System.out.print("Giorno di nascita: ");
		   int day = sc.nextInt();
		   System.out.println("Giorno di nascita: " + day);
		   
		   System.out.print("Mese di nascita: ");
		   int month = sc.nextInt();
		   System.out.println("Mese di nascita: " + month);
		   
		   System.out.print("Anno di nascita: ");
		   int year = sc.nextInt();
		   System.out.println("Anno di nascita: " + year);
		   
		   int dayOfYear = day + month + year;
		   System.out.println("Anno di nascita: " + dayOfYear);
		   
		   System.out.println("Password: " + name + '-' + surname + '-' + dayOfYear);
	}
}
