package hust.soict.ictglobal.lab01;
import javax.swing.JOptionPane;
public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1, strNum2;
		String strNotification="You've just entered: ";
		double num2;
		strNum1=JOptionPane.showInputDialog(null,"please enter the first number: ","input the first number",JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";
		do {
			strNum2=JOptionPane.showInputDialog(null,"please enter the second number: ","unput the second number",JOptionPane.INFORMATION_MESSAGE);
			num2=Double.parseDouble(strNum2);
		}
		while(num2 == 0);
		 
		strNotification += strNum2;
		double num1=Double.parseDouble(strNum1);
		
		double sum=num1+num2;
		double diff=num1-num2;
		double product=num1*num2;
		double quo=num1/num2;
		strNotification += " result: " + "sum: "+sum +" ,difference:" +diff+", product:" +product+", quotient: "+quo;
		JOptionPane.showMessageDialog(null, strNotification,"result",JOptionPane.INFORMATION_MESSAGE);;
		System.exit(0);
	}

}
