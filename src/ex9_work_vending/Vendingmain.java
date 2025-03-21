package ex9_work_vending;

import java.util.Scanner;

public class Vendingmain {
	public static void main(String[] args) {
		
		// insert money : 1000
		// fanta - 1000
		// orang - 800
		// >> orange
		// orange을(를) 선택함.
		// 잔돈 : 200원
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insert money : ");
		int money = sc.nextInt();
		
		Vending v = new Vending();
		v.showDrink(money);
		
		
		System.out.print(">> ");
		String sel = sc.next();
		
		
		
		
		
		
		
		
		
	} // main

}
