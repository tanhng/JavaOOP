package hust.soict.ictglobal.lab01;
import javax.swing.JOptionPane;
public class ex6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNum1, strNum2,strNum3,strNum4,strNum5,strNum6;
		double a,b,c,d,e,f;
		String strNotification="You've just entered: ";
		strNum1=JOptionPane.showInputDialog(null,"please enter a: ","input a",JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 +  " and ";
		strNum2=JOptionPane.showInputDialog(null,"please enter b: ","input b",JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2 +  " and ";
		strNum3=JOptionPane.showInputDialog(null,"please enter c: ","input c",JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum3;
		a=Double.parseDouble(strNum1);
		b=Double.parseDouble(strNum2);
		c=Double.parseDouble(strNum3);
		strNum4=JOptionPane.showInputDialog(null,"please enter b: ","input b",JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum4 +  " and ";
		strNum5=JOptionPane.showInputDialog(null,"please enter b: ","input b",JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum5 +  " and ";
		strNum6=JOptionPane.showInputDialog(null,"please enter c: ","input c",JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum6;
		d=Double.parseDouble(strNum4);
		e=Double.parseDouble(strNum5);
		f=Double.parseDouble(strNum6);
		double y=(f*a/d-c)/(e*a/d-b);
		double x=(c-b*y)/a;
		strNotification += ", x = :" + x +", y="+y ;
		JOptionPane.showMessageDialog(null, strNotification,"Show result",JOptionPane.INFORMATION_MESSAGE);;
		System.exit(0);
	}

}
