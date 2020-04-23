package hust.soict.ictglobal.lab02;
import java.util.Scanner;
import java.util.Arrays;
public class arraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Nhap do dai cua mang: ");
		
		
		int length = keyboard.nextInt();
		int[] mang = new int [ length ];
		for (int i = 0; i < length; i++)
		{
			System.out.println("Nhap phan tu "+(i+1)+" :");
			mang[i] = keyboard.nextInt();
		}
		
		int tong = 0;
		
		
		System.out.print("Mang ban dau: ");
		for (int i = 0; i < length; i++)
		{
			System.out.print(mang[i] + " ");
			tong += mang[i];
		}
		System.out.println();
		
		Arrays.sort(mang);
		
		System.out.print("Mang da sap xep: ");
		for (int i = 0; i < length; i++)
		{
			System.out.print(mang[i] + " ");
		}
		System.out.println();
		System.out.println("Tong cua mang: " + tong);
		System.out.println("Trung binh mang: " + (double)tong / 9);
		keyboard.close();
	}

}
