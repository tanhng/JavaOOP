package hust.soict.ictglobal.aims.Aims;
import hust.soict.ictglobal.aims.disc.DigitalVideoDisc;
import hust.soict.ictglobal.aims.order.Order;
import java.util.*;
import hust.soict.ictglobal.aims.media.Media;

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
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Order order = new Order();
		
		do
		{
			Aims.showMenu();
			try {
				choice = Integer.parseInt(sc.nextLine());
			} catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
			
		
			switch(choice)
			{
				case 1:
				{
					System.out.println("-------------------------");
					if(Order.nOrdered < Order.max_OrderNumber)
					{
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
					System.out.println();
					System.out.println("-------------------------");
					System.out.println("Add item to the order");
					System.out.println("-------------------------");
					System.out.print("Enter title: ");
					String title = sc.nextLine();
					System.out.print("Enter category: ");
					String category = sc.nextLine();
					System.out.print("Enter cost: ");
					float cost = Float.parseFloat(sc.nextLine());
					
					Media item = new Media(title, category, cost);
					order.addMedia(item);
					
					break;
				}
				case 3:
				{
					System.out.println();
					System.out.println("-------------------------");
					System.out.println("Delete item by id");
					System.out.println("---------------------------");
					System.out.print("Enter index: ");
					int index = Integer.parseInt(sc.nextLine());
					order.removeMedia(index);
					
					break;
				}
				case 4:
				{
					System.out.println();
					System.out.println("-------------------------");
					System.out.println("Display");
					System.out.println("---------------------------");
					for(int i = 0; i < order.getQtyOrdered(); i++)
					{
						order.getItemsOrdered().get(i).print();
					}
					
					break;
				}
				case 0: System.out.println("-------------------------"); break;
				default: System.out.println("xxx"); break;
			}
		}while(choice != 0);
	}

}

