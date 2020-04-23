package hust.soict.ictglobal.aims.order;
import java.lang.Math;
import java.util.ArrayList;
import hust.soict.ictglobal.aims.media.Media; 
import java.util.Date;

import hust.soict.ictglobal.aims.disc.DigitalVideoDisc;
public class Order {
	public static final int max_OrderItems = 10;
	private DigitalVideoDisc list[]=new DigitalVideoDisc[Order.max_OrderItems];
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private int qtyOrdered=0;
	private Date datedOrder=new Date();
	public static int nOrdered=0;
	public static final int max_OrderNumber=5;
	
	
	

	public Order() {
		super();
		Order.nOrdered++;	
	}
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	
	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
//	public int addDigitalVideoDisc(DigitalVideoDisc disc) {
//		if(this.qtyOrdered<max_OrderItems) {
//			this.list[qtyOrdered++]=disc;
//			System.out.println("disc"+disc.getTitle()+"has been added");
//			return 0;
//		}
//		System.out.println("store has been already full");
//		return 0;
//	}
	
	public int isFull()
	{
		if(qtyOrdered == max_OrderNumber)
		{
			return 1;
		}
		
		return 0;
	}
	
	public void addMedia(Media media)
	{
		if(this.isFull() == 0)
		{
			this.itemsOrdered.add(media);
			this.qtyOrdered += 1;
			System.out.println("Media"+media.getTitle()+"has been added");
		}
		else
		{
			System.out.println("store has been already full");
		}
	}
	
	public void removeMedia(Media media)
	{
		if(!this.itemsOrdered.contains(media)) {
			System.out.println("do not have");
		} else {
		this.itemsOrdered.remove(media);
		System.out.println("Media"+media.getTitle()+"has been deleted");
		this.qtyOrdered -= 1;
		}
	}
	
	public void removeMedia(int i)
	{
		if(this.qtyOrdered<=i) {
			System.out.println("do not have");
		}
		else {
			this.itemsOrdered.remove(i);
			System.out.println("deleted");
			this.qtyOrdered -= 1;
		}
	}
	
	
	public Date getDatedOrder() {
		return datedOrder;
	}
	public void setDatedOrder(Date datedOrder) {
		this.datedOrder = datedOrder;
	}
//	public int addDigitalVideoDis(DigitalVideoDisc [] dvdList) {
//		if(Order.nOrdered>Order.max_OrderNumber) {
//			System.out.println("reached max Order, cant add");
//			return 0;
//		}
//		if(dvdList.length+this.qtyOrdered> max_OrderItems) {
//			System.out.println("over max number of items");
//			return 1;
//		} else {
//		System.out.println(this.list.length);
//		System.out.println(this.qtyOrdered);
//		int count=0;
//		int i;
//		for (i=this.qtyOrdered;i<this.qtyOrdered+dvdList.length;i++) {
//			this.list[i]=dvdList[count];
//			System.out.println(this.list[i]);
//			count++;
//		};
//		this.qtyOrdered+=dvdList.length;
//		System.out.println("last"+this.list[3].getCost());
//		return 0;
//		}
//	}
//	
//	
//	public int addDigitalVideoDisc(DigitalVideoDisc disc1,DigitalVideoDisc disc2) {
//		if(Order.nOrdered>Order.max_OrderNumber) {
//			System.out.println("reached max Order, cant add");
//			return 0;
//		}
//		if(this.qtyOrdered+2> max_OrderItems) {
//			System.out.println("over max number of items");
//			return 0;
//			}
//		else {
//			this.list[this.qtyOrdered]=disc1;
//			this.qtyOrdered++;
//			this.list[this.qtyOrdered]=disc2;
//			this.qtyOrdered++;
//			return 1;
//		}
//	}
//	
//	public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
//		
//		int i,j;
//		if(qtyOrdered == 0)
//		{
//			System.out.println("Dont have items");
//			return 1;
//		}
//		for (i=0;i<qtyOrdered;i++) {
////			if(disc.getTitle().equals(this.list[i].getTitle()))
//			if(disc==this.list[i])
//			{
//				this.qtyOrdered--;
//				for(j=i;j<=this.qtyOrdered;j++) {
//					this.list[j]=this.list[j+1];
//				}
//			}
//		}
//		return 0;
//
//	}
	
	public int print() {
		System.out.println("Date Ordered:" + this.datedOrder);
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
			total+=this.itemsOrdered.get(i).getCost();
		}
		return total;
	}
	
	public void getLuckyItem() {
		int luckyNumber;
		do {
			double temp = Math.random()*this.qtyOrdered;
			System.out.println("number"+temp);
			luckyNumber=(int)temp;
		}while(luckyNumber<0 || luckyNumber>=this.qtyOrdered);
		System.out.println("number"+luckyNumber);
//		this.removeMedia(this.itemsOrdered[luckyNumber]);
		this.itemsOrdered.remove(luckyNumber);
		}
	
}