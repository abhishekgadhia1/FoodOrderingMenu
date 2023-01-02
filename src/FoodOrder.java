import java.util.Scanner;

public class FoodOrder
{
	int pizza = 100;
	int burger = 200;
	int coffee = 300;
	static int total;
	int quantity;
	int selection;
	String again;
	
	Scanner s = new Scanner(System.in);
	
	public void display()
	{
		System.out.println("**************Welcome to Udipi***************");
		System.out.println();
		System.out.println("         1. Pizza________________Rs 100/-");
		System.out.println("         2. Burger_______________Rs 200/-");
		System.out.println("         3. Coffee_______________Rs 300/-");
		System.out.println("         4. Exit");
		System.out.println();
	}
	
	public void selectItem()
	{
		while(true)
		{
		System.out.println();
		System.out.print("    Press the item number you wish to have : ");
		
		selection = s.nextInt();
		
		System.out.println();
		switch(selection)
		{
			case 1 : System.out.println("    Thanks, you have selected PIZZA.");
					 System.out.println();
					 System.out.print("    How much quanity? : ");
					 quantity = s.nextInt();
					 total = total + quantity * pizza;
					 break;
			
			case 2 : System.out.println("    Thanks, you have selected BURGER.");
					 System.out.println();
					 System.out.print("    How much quanity? : ");
					 quantity = s.nextInt();
					 total = total + quantity * burger;
					 break;
			
			case 3 : System.out.println("    Thanks, you have selected COFFEE.");
					 System.out.println();
					 System.out.print("    How much quanity? : ");
					 quantity = s.nextInt();
			 	   	 total = total + quantity * coffee;
			 	   	 break;
			
			case 4 : System.out.println("    Thank you for being with us.");
			System.exit(1);
			
			default : //System.out.println("Oops, wrong input");
				break;
		}
		
		System.out.println();
		System.out.print("    Do you wish to order anything else? (Y/N) : ");
		again = s.next();
		
		if(again.equalsIgnoreCase("Y"))
		{
			selectItem();
		}
		else if(again.equalsIgnoreCase("N"))
		{
			generateBill();
			System.exit(1);
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
	}
	
	public void generateBill()
	{
		System.out.println();
		System.out.println("    Your total bill amount is Rs. "+total);
		System.out.println();
		System.out.println("---------------THANKS. VISIT AGAIN---------------");
	}
}