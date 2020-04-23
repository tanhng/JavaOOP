package hust.soict.ictglobal.aims.Aims;
//import hust.soict.ictglobal.aims.disc.DigitalVideoDisc;
import hust.soict.ictglobal.aims.order.Order;
import java.util.*;
import hust.soict.ictglobal.aims.media.Book;
import hust.soict.ictglobal.aims.media.CompactDisc;
import hust.soict.ictglobal.aims.media.DigitalVideoDisc;


public class Aims {
	public static void showMenu()
	{
		System.out.println("Order Management Application");
		System.out.println("-------------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("-------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		Order order = new Order();
		
		do
		{
			Aims.showMenu();
			try {
				choice = Integer.parseInt(keyboard.nextLine());
			} catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
			
		
			switch(choice)
			{
				case 1:
				{
					if(Order.nOrdered < Order.max_OrderNumber)
					{
						System.out.println("/n/n");
						order = new Order();
						System.out.println("added success");
					}
					else
					{
						System.out.println("reached max orders number");
					}
					
					System.out.println();
					break;
				}
				case 2:
{	
					System.out.println("/n/n");
					System.out.println();
					System.out.println("Book, DigitalVideoDisc or CompactDisc? ");
					String type = keyboard.nextLine();
					System.out.print("Enter title: ");
					String title = keyboard.nextLine();
					System.out.print("Enter category: ");
					String category = keyboard.nextLine();
					System.out.print("Enter cost: ");
					float cost = Float.parseFloat(keyboard.nextLine());
					if(type.equals("Book"))
					{
						Book item = new Book(title, category);
						item.setCost(cost);
						order.addMedia(item);
					}
					else if(type.equals("DigitalVideoDisc"))
					{
						DigitalVideoDisc item = new DigitalVideoDisc(title);
						item.setCategory(category);
						item.setCost(cost);
						order.addMedia(item);
					}
					else if(type.equals("CompactDisc"))
					{
						CompactDisc item = new CompactDisc(title);
						item.setCategory(category);
						item.setCost(cost);
						order.addMedia(item);
					}
					else {
						System.out.println("type invalid");
					}
					break;
				}
				case 3:
				{
					System.out.println("/n/n");
					System.out.println();
					System.out.print("Enter index: ");
					int index = Integer.parseInt(keyboard.nextLine());
					order.removeMedia(index);
					break;
				}
				case 4:
				{
					System.out.println("/n/n");
					for(int i = 0; i < order.getQtyOrdered(); i++)
					{
						order.getItemsOrdered().get(i).print();
					}
					
					break;
				}
				case 0: System.out.println("exit"); break;
				default: System.out.println("xxx"); break;
			}
		}while(choice != 0);
		keyboard.close();
	}

}

