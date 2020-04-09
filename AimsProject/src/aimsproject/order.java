package aimsproject;

public class order {
	public static final int max_orderItems = 10;
	private DigitalVideoDisc list[]=new DigitalVideoDisc[order.max_orderItems];
	private int qtyOrdered=0;
	private MyDate datedOrder=new MyDate();
	private static int nOrdered=0;
	public static final int max_orderNumber=5;
	
	
	

	public order() {
		super();
		order.nOrdered++;
		
	}
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public int addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(this.qtyOrdered<max_orderItems) {
			this.list[qtyOrdered++]=disc;
			System.out.println("disc"+disc.getTitle()+"has been added");
			return 0;
		}
		System.out.println("store has been already full");
		return 0;
	}
	
	
	public MyDate getDatedOrder() {
		return datedOrder;
	}
	public void setDatedOrder(MyDate datedOrder) {
		this.datedOrder = datedOrder;
	}
	public int addDigitalVideoDis(DigitalVideoDisc [] dvdList) {
		if(order.nOrdered>order.max_orderNumber) {
			System.out.println("reached max order, cant add");
			return 0;
		}
		if(dvdList.length+this.qtyOrdered> max_orderItems) {
			System.out.println("over max number of items");
			return 1;
		} else {
		System.out.println(this.list.length);
		System.out.println(this.qtyOrdered);
		int count=0;
		int i;
		for (i=this.qtyOrdered;i<this.qtyOrdered+dvdList.length;i++) {
			this.list[i]=dvdList[count];
			System.out.println(this.list[i]);
			count++;
		};
		this.qtyOrdered+=dvdList.length;
		System.out.println("last"+this.list[3].getCost());
		return 0;
		}
	}
	
	
	public int addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2) {
		if(order.nOrdered>order.max_orderNumber) {
			System.out.println("reached max order, cant add");
			return 0;
		}
		if(this.qtyOrdered+2> max_orderItems) {
			System.out.println("over max number of items");
			return 0;
			}
		else {
			this.list[this.qtyOrdered]=disc1;
			this.qtyOrdered++;
			this.list[this.qtyOrdered]=disc2;
			this.qtyOrdered++;
			return 1;
		}
	}
	
	public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
		
		int i,j;
		for (i=0;i<qtyOrdered;i++) {
			if(disc.getTitle().equals(this.list[i].getTitle())) {
				this.qtyOrdered--;
				for(j=i;j<this.qtyOrdered;j++) {
					this.list[j]=this.list[j+1];
				}
			}
		}
		return 0;
	}
	
	public int print() {
		System.out.println("Date Ordered:" + this.datedOrder.getDay());
		int i;
		for (i=0;i<this.qtyOrdered;i++) {
			System.out.println(this.list[i].getTitle());
		};
		return 0;
	}
	
	
	public float totalCost() {
		float total=0;
		int i;
		for(i=0;i<this.qtyOrdered;i++) {
			total+=this.list[i].getCost();
		}
		return total;
	}
}
