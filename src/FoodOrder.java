import java.util.Scanner;

public class FoodOrder
{
	int ff = 100;
	int burger = 120;
	int pastry = 80;
	int pizza = 200;
	int coffee = 110;
	int colddrink = 20;
	int ch;
	int quantity;
	static int total;
	String again;
	
	Scanner scan = new Scanner(System.in);
	
	public void displayMenu()
	{
		System.out.println("**************Welcome to our cafe**************");
		System.out.println("===============================================");
		System.out.println("       1. French Fries       Rs. 100/-");
		System.out.println("       2. Burger             Rs. 120/-");
		System.out.println("       3. Pastry             Rs. 80/- ");
		System.out.println("       4. Pizza              Rs. 200/-");
		System.out.println("       5. Coffee             Rs. 110/-");
		System.out.println("       6. Cold Drink         Rs. 20/- ");
		System.out.println("       7. Exit                        ");
		System.out.println("===============================================");
		System.out.println();
		System.out.println("             What do you want to order today?");
	}
	
	public void orderFood()
	{
		while(true)
			{
			System.out.print("Enter your choice : ");
			ch = scan.nextInt();
			
			switch(ch)
			{
				case 1 : System.out.println("You have ordered French Fries");
					 	 System.out.println();
					 	 System.out.print("Enter the desited quantity : ");
					 	 quantity = scan.nextInt();
					 	 total = total + quantity * ff;
					 	 break;
					 	 
				case 2 : System.out.println("You have ordered Burger");
			 	 		 System.out.println();
			 	 		 System.out.print("Enter the desited quantity : ");
			 	 		 quantity = scan.nextInt();
			 	 		 total = total + quantity * burger; 
			 	 		 break;
			 	 		
				case 3 : System.out.println("You have ordered Pastry");
			 	 		 System.out.println();
			 	 		 System.out.print("Enter the desited quantity : ");
			 	 		 quantity = scan.nextInt();
			 	 		 total = total + quantity * pastry; 
			 	 		 break;
			 	 		 
				case 4 : System.out.println("You have ordered Pizza");
						 System.out.println();
						 System.out.print("Enter the desited quantity : ");
						 quantity = scan.nextInt();
						 total = total + quantity * pizza; 
						 break;
						 
				case 5 : System.out.println("You have ordered Coffee");
			 	 		 System.out.println();
			 	 		 System.out.print("Enter the desited quantity : ");
			 	 		 quantity = scan.nextInt();
			 	 		 total = total + quantity * coffee; 
			 	 		 break;
			 	 		 
				case 6 : System.out.println("You have ordered Cold Drink");
						 System.out.println();
						 System.out.print("Enter the desited quantity : ");
						 quantity = scan.nextInt();
						 total = total + quantity * colddrink; 
						 break;
						 
				case 7 : System.exit(1);
						 break;
						 
				default : break;
			}
			System.out.println();
			System.out.println("Do you wish to order anything else? (Y/N) : ");
			again = scan.next();
			if(again.equalsIgnoreCase("Y"))
			{
				orderFood();
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
		System.out.println("***************Thank you for ordering***************");
		System.out.println();
		System.out.println("***************Your bill amount is : "+total+"***************");
	}
}













