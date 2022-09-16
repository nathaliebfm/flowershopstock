package flowershop;

import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShopStock {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner (System.in);
		
		ArrayList<String> stock = new ArrayList();
		
		do {
			
			System.out.println("\n********************FLOWER SHOP********************");
			System.out.println("\n\n\t\tStock");
			System.out.println("\n(1) Add flowers to stock");
			System.out.println("\n(2) Remove flowers from stock");
			System.out.println("\n(3) Replace flowers from stock");
			System.out.println("\n(4) Show flowers in stock");
			System.out.println("\n(0) Exit application");
			System.out.println("\nChoose desired option: ");
			x = sc.nextInt();
			System.out.println("*****************************************************");
			
			switch(x) {
			
			case 1:
				sc.nextLine();
				System.out.println("\nPlease enter the flower type");
				String flower = sc.nextLine();
				stock.add(flower);
				System.out.println(stock);
				break;
			case 2:
				sc.nextLine();
				System.out.println("\nWhich flower would you like to remove from stock?");
				String flower1 = sc.nextLine();
				if (stock.contains(flower1)) {
					stock.remove(flower1);
				}else {
					System.out.println("Couldn't locate entered flower type");
				}
				System.out.println(stock);
				break;
			case 3:
				sc.nextLine();
				System.out.println("\nWhich flower would you like to replace?");
				String check = sc.nextLine();
				System.out.println("\nWhich flower type would you like to replace "+check+" with?");
				String replace = sc.nextLine();
				if (stock.contains(check)) {
					stock.remove(check);
					stock.add(replace);
				}else {
					System.out.println("Couldn't locate entered flower type in order to replace it.");
					}
				System.out.println(stock);
				break;
			case 4:
				System.out.println("\nYou have the following flowers in stock: ");
				System.out.println(stock);
				break;
			case 0:
				System.out.println("Exiting application, see you later!");
				break;
				default: 
					System.out.println("Invalid option! Please try again...");
			
			}
			
		}while (x != 0);

	}

}
