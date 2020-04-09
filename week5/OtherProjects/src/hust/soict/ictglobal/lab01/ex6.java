package hust.soict.ictglobal.lab01;
import javax.swing.JOptionPane;
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1, strNum2,strNum3;
		double a,b,c;
		String strNotification="You've just entered: ";
		do {
			strNum1=JOptionPane.showInputDialog(null,"please enter a: ","input a",JOptionPane.INFORMATION_MESSAGE);
			a=Double.parseDouble(strNum1);
		}
		while(a == 0);
		strNotification += strNum1 + " and ";
		strNum2=JOptionPane.showInputDialog(null,"please enter b: ","input b",JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2 +  " and ";
		strNum3=JOptionPane.showInputDialog(null,"please enter c: ","input c",JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum3;
		b=Double.parseDouble(strNum2);
		c=Double.parseDouble(strNum3);
		double result=(c-b)/a;
		strNotification += ", x = :" + result ;
		JOptionPane.showMessageDialog(null, strNotification,"Show result",JOptionPane.INFORMATION_MESSAGE);;
		System.exit(0);
	}

}
