package hust.soict.ictglobal.aims.Aims;
import hust.soict.ictglobal.aims.disc.DigitalVideoDisc;
import hust.soict.ictglobal.aims.order.Order;
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order demo = new Order();
//		Order demo1 = new Order();
//		Order demo2= new Order();
//		Order demo3 = new Order();
//		Order demo4 = new Order();
//		Order demo5 = new Order();
//		Order demo6 = new Order();
//		Order demo7 = new Order();
//		Order demo8 = new Order();
//		demo8.print();
		DigitalVideoDisc [] list= {new DigitalVideoDisc("Lion King", "Animation", "Roger Allers", 87, 19.95f),new DigitalVideoDisc("Lion King", "Animation", "Roger Allers", 87, 19.95f)};
		demo.addDigitalVideoDisc(new DigitalVideoDisc("Lion King", "Animation", "Roger Allers", 87, 19.95f));
		demo.addDigitalVideoDisc(new DigitalVideoDisc("Star World", "Science Fiction", "George Lucas", 124, 24.95f));
		demo.addDigitalVideoDisc(new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f));
		DigitalVideoDisc a=new DigitalVideoDisc("harry and potter", "Animation", "John Musker", 90, 18.99f);
//		demo.removeDigitalVideoDisc(a);
		System.out.println("Total cost: " + demo.totalCost());
		demo.addDigitalVideoDis(list);
		boolean b=a.search("harry poter");
		System.out.println("B"+b);
		demo.print();
		demo.getLuckyItem();
		demo.print();
	}

}
