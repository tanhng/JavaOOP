package week2;
import java.util.Scanner;
public class stars {
	
	public void printStars(int starLength,int lineLength) {
		int i;
		int maxLength=lineLength*2-1;
		int spacenum=maxLength-starLength;
		int temp=spacenum/2;
		for (i=0;i<lineLength*2;i++) {
			if(i<temp+1 | i>maxLength-temp) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		stars demo=new stars();
		System.out.println("please enter n?");
		int n = keyboard.nextInt();
		int i,temp=1;
		for(i=0;i<n;i++) {
			demo.printStars(temp,n);
			System.out.println("");
			temp+=2;
		}
	}

}
