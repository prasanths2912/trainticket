package javaproject;

import java.util.Scanner;

public class traint {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			System.out.println("enter the place");
			String place=scan.nextLine();
			if(place.equals("chennai")) {
				System.out.println("you selected "+place);
				System.out.println("select the class ");
				String cls=scan.nextLine();
				if(cls.equals("general")) {
					System.out.println("you select "+cls);
					System.out.println("enter the amount");
					int amount= scan.nextInt();
					if(amount>=40) {
						System.out.println("seat booked"+cls);
						int bal=amount-40;
						System.out.println("the balance amount "+bal);
					}
					else 
					{
						System.out.println("insufficient amount");
					}
				}
				else if(cls.equals("first class")) {
					System.out.println("you select "+cls);
					System.out.println("enter the amount");
					int amount= scan.nextInt();
					if(amount>=700) {
						System.out.println("seat booked"+cls);
						int bal=amount-700;
						System.out.println("the balance amount "+bal);
					}
					else 
					{
						System.out.println("insufficient amount");
					}
				}
				else if(cls.equals("second class")) {
					System.out.println("you select "+cls);
					System.out.println("enter the amount");
					int amount= scan.nextInt();
					if(amount>=650) {
						System.out.println("seat booked"+cls);
						int bal=amount-650;
						System.out.println("the balance amount "+bal);
					}
					else 
					{
						System.out.println("insufficient amount");
					}
				}
				else if(cls.equals("sleeper")) {
					System.out.println("you select "+cls);
					System.out.println("enter the amount");
					int amount= scan.nextInt();
					if(amount>=1000) {
						System.out.println("seat booked"+cls);
						int bal=amount-1000;
						System.out.println("the balance amount "+bal);
					}
					else 
					{
						System.out.println("insufficient amount");
					}
				}
				else {
					System.out.println("ac not available");
				}

			}
			if(place.equals("covai")) {
				System.out.println("you selected "+place);
				System.out.println("select the class ");
				String cls=scan.nextLine();
				if(cls.equals("general")) {
					System.out.println("you select "+cls);
					System.out.println("enter the amount");
					int amount= scan.nextInt();
					if(amount>=50) {
						System.out.println("seat booked"+cls);
						int bal=amount-50;
						System.out.println("the balance amount "+bal);
					}
					else 
					{
						System.out.println("insufficient amount");
					}
				}
				else if(cls.equals("first class")) {
					System.out.println("you select "+cls);
					System.out.println("enter the amount");
					int amount= scan.nextInt();
					if(amount>=600) {
						System.out.println("seat booked"+cls);
						int bal=amount-600;
						System.out.println("the balance amount "+bal);
					}
					else 
					{
						System.out.println("insufficient amount");
					}
				}
				else if(cls.equals("second class")) {
					System.out.println("you select "+cls);
					System.out.println("enter the amount");
					int amount= scan.nextInt();
					if(amount>=550) {
						System.out.println("seat booked"+cls);
						int bal=amount-550;
						System.out.println("the balance amount "+bal);
					}
					else 
					{
						System.out.println("insufficient amount");
					}
				}
				else if(cls.equals("sleeper")) {
					System.out.println("you select "+cls);
					System.out.println("enter the amount");
					int amount= scan.nextInt();
					if(amount>=900) {
						System.out.println("seat booked"+cls);
						int bal=amount-900;
						System.out.println("the balance amount "+bal);
					}
					else 
					{
						System.out.println("insufficient amount");
					}
				}
				else {
					System.out.println("ac not available");
				}

			}
			else {
				System.out.println("only chennai and covai ");
			}
		}
	}

}
