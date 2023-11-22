package KuvvetAlanProgram;
import java.util.Scanner;


public class Kuvvet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int taban, üs;
		long s = 1;
		
		System.out.println("Taban Sayısını Giriniz: ");
		taban = scan.nextInt();
		System.out.println("Kuvvet Sayısını Giriniz: ");
		üs = scan.nextInt();
		
		
		for(; üs != 0; --üs ) {
			s *= taban;
		}
		System.out.println("Cevap: " + s);

	}

}
