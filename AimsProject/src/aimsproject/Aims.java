package aimsproject;
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		order demo = new order();
		order demo1 = new order();
		order demo2= new order();
		order demo3 = new order();
		order demo4 = new order();
		order demo5 = new order();
		order demo6 = new order();
		order demo7 = new order();
		order demo8 = new order();
		demo8.print();
		DigitalVideoDisc [] list= {new DigitalVideoDisc("Lion King", "Animation", "Roger Allers", 87, 19.95f),new DigitalVideoDisc("Lion King", "Animation", "Roger Allers", 87, 19.95f)};
		demo.addDigitalVideoDisc(new DigitalVideoDisc("Lion King", "Animation", "Roger Allers", 87, 19.95f));
		demo.addDigitalVideoDisc(new DigitalVideoDisc("Star World", "Science Fiction", "George Lucas", 124, 24.95f));
		demo.addDigitalVideoDisc(new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f));
		DigitalVideoDisc a=new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
		demo.removeDigitalVideoDisc(a);
		System.out.println("Total cost: " + demo.totalCost());
		demo.addDigitalVideoDis(list);
		demo.print();
		
	}

}
