package com.vikasietumpizzassignment;



import java.util.Scanner;

public class Pizza_Assignment {

	static Scanner sc = new Scanner(System.in);
	static int vegcost =  0;
	static int vegsum = 0;
	static int nonvegsum = 0;
	static int nonVegcost = 0;
	static int sidesCost=0;
	static int cost=0;
	public static void main(String[] args) 
    {
		
		System.out.println("------------------------ Vikasietum Pizza Factory-----------------");
		int flag = 1;
		String type=null;
		while(flag==1)
		{
		System.out.println("1.Vegetarian Pizza ");
		System.out.println("2.Non-Vegetarian Pizza");
		System.out.println("3.Side dishes");
		System.out.println("4.Exit");
		System.out.println("Choose the above option");
		int press = sc.nextInt();
		switch(press)
		{
		case 1: type="vegetarian pizza";
				vegcost = vegetarian();
				vegsum = vegsum + vegcost;
		       break;
			
		case 2:type="non-vegetarian pizza";
				 nonVegcost =nonVegetarian() ;
				nonvegsum = nonvegsum +nonVegcost;
				break;
		case 3 :sidesCost = sides();
		break;
		default:flag = 0;
		}
		cost=vegsum+nonvegsum+sidesCost;
		}
		if(vegsum !=0)
		{
		System.out.println("veg cost: "+vegsum);
		}
		if(nonvegsum!=0)
		{
		System.out.println("non-veg cost: "+nonvegsum);
		}
		if(sidesCost!=0)
		{
			System.out.println("sides cost:"+sidesCost);
		}
		System.out.println("total cost: "+cost);
	}
		
	private static int sides() {
		System.out.println("1.Cold drink");
		System.out.println("2.Mousse cake");
		System.out.println("3.Both");
		int press = sc.nextInt();
		int cd = 0;
		int mc=0;
		int sum =0;
		if(press == 1)
		{
			System.out.println("Enter number of cold drinks");
			int cc = sc.nextInt();
			cd = cc * 55;
			sum = cd;
		}
		else if(press ==2)
		{
			System.out.println("Enter number of mousse cake");
			int cc = sc.nextInt();
			mc = cc * 90;
			sum=mc;
		}
		else
		{
			System.out.println("enter number of cold drinks");
			int cc = sc.nextInt();
			cd = cc * 55;
			System.out.println("enter number of mousse cake");
			int mm = sc.nextInt();
			mc = mm * 90;
			sum = cd+mc;
		}
		return sum;
	}

	private static int nonVegetarian() {
		System.out.println("=====================Non-Veg Pizza===================");
			System.out.println("1.Non-Veg Supreme Pizza");
			System.out.println("2.Chicken tikka Pizza");
			System.out.println("3.Pepper Barbecue Pizza");
			int press = sc.nextInt();
			String type=null;
			switch(press)
			{
			case 1:type="non-veg supreme";
					int cost = nonVegBase(press);
			       int sum = selectTopings();
			       return cost+sum;
			case 2:type="chicken tikka";
				cost = nonVegBase(press);
		       		sum = selectTopings();
		       		return cost+sum;
			case 3:type="pepper barbeque chicken";
				cost = nonVegBase(press);
		       		sum = selectTopings();
		       		return cost+sum;
		      default: return 0;
			}
			}		
		
	private static int selectTopings() {
		   System.out.println("1.Veg toppings");
		   System.out.println("2.Non-Veg toppings");
		   System.out.println("3.Both");
		   System.out.println("4.Extra Cheese");
		   System.out.println("Enter your choice");
	       int press = sc.nextInt();
	       int cost=0;
	       String type="non veg";
	       switch (press) 
	       {
	       case 1: cost = vegtoppings(type);
		     	return cost;
			
			
	       case 2:cost = nonVegToppings();
				 return cost;
				 
	       case 3 : int ncost = nonVegToppings();
	       			int vcost = vegtoppings(type);
	       			return ncost+vcost;
	       case 4: cost = extraCheese();
	       			return cost;
		}
		return 0;
	}
		private static int extraCheese() {
		return 35;
	}

		public static int vegetarian()
		{
			System.out.println("======veg Pizza=========");
			System.out.println("1. Deluxe Veggie");
			System.out.println("2. Cheese and Corn");
			System.out.println("3. Paneer tikka");
			System.out.println("Enter your Choice");

			int press = sc.nextInt();
			int bcost = 0;
			int tcost = 0;
			int total = 0 ;
			String type="veg";
			String style=null;
			switch(press)
			{
			case 1 :style="deluxe veggie";
					
					bcost = vegbase(press);
				     tcost= vegtoppings(type);
				     total = bcost+tcost;;
				     return total;
					 
			case 2 :style="cheese and corn";
					
					bcost = vegbase(press);
			        tcost = vegtoppings(type);
			        total = bcost+tcost;;
				     return total;
		            
			case 3 :style="paneer tikka";
					
					bcost= vegbase(press);
	                tcost= vegtoppings(type);
	                total = bcost+tcost;;
				     return total;
           
		}
			
			return total;
			
}
		public static String typeOfCrust()
		{
			System.out.println("=================Crust===================");
			System.out.println("1.New hand tossed");
			System.out.println("2.Wheat thin crust");
			System.out.println("3.Cheese burst");
			System.out.println("4.Fresh pan pizza");
			System.out.println("Enter your Choice");
			int press = sc.nextInt();
			switch(press)
			{
			case 1: return "New hand tossed";
			case 2: return "Wheat and crust";
			case 3: return "Cheese burst";
			case 4: return "Fresh pan pizza";
			default: return null;
			}
		
			
		}
		public static int vegtoppings(String type)
		{
			int sum = 0;
			int val = 0;
			System.out.println("Extra toppings for select below option ");
	        System.out.println("1.Yes");
			System.out.println("2.No");
	        int press = sc.nextInt();
	        if(press == 1)
	        {
			
			int flag = 1;
			
			while(flag == 1)
			{
				sum = sum + val;
			System.out.println("===================Veg Toppings===============");
			System.out.println("1.Black olive");
			System.out.println("2.Capsicum");
			System.out.println("3.Paneer");
			System.out.println("4.Mushroom");
			System.out.println("5.Fresh Tomato");
			System.out.println("6.Extra Cheese");
			System.out.println("7. Exit");
			System.out.println("Enter your choice");
			press = sc.nextInt();
			String toppings = null;
			if(type.equals("non veg") && press==3)
			{
				System.out.println("paneer toppings not allowed for non veg pizza");
				continue;
			}
			else
			{
			
			switch(press)
			{
			case 1 :toppings="black olive";
				    val = 20; 
				    break;
				
			case 2: toppings="capsicum";
					val = 25;
					break;
					
			case 3 :toppings="paneer";
					val = 35;	
					break;
					
				
			case 4: toppings="mushroom";
				val = 30;
				break;
				
				
			case 5: toppings="fresh tomato";
					val= 10;
					break;
				
			case 6: toppings ="extra cheese";
					val = 35;
					break;
			default: flag = 0;
			}
			}
			}
	        }
	        
			return sum;
	        
		}
		
		
		public static int nonVegToppings()
		{
			
	        System.out.println("you can have only one type of non veg toppings");
			System.out.println("1.Chicken tikka");
			System.out.println("2.Barbecue Chicken");
			System.out.println("3.Grilled Chicken");
			int press = sc.nextInt();
			String toppings= null;
			int cost=0;
			switch(press)
			{
			case 1 :toppings="Chicken tikka";
				cost= 35;
				break;
			case 2: toppings = "Barbeque chicken" ;
			    cost = 45;
			    break;
			case 3: toppings = "Grilled chicken";
				cost= 40;
				break;
			
			}
	
			return cost;
	        
		}
		
		public static int vegbase(int x)
		{
			System.out.println("Enter type of crust");
			String crust = typeOfCrust();
			System.out.println("Select the size of the pizza");
			System.out.println("1.Regular");
			System.out.println("2.Medium");
			System.out.println("3.Large");
			System.out.println("Enter your choice");
			int press = sc.nextInt();
			String size = null;
			int cost=0;
			if(x==1)
			{
				size = "regular";
				if(press == 1)
				{
					cost = 150;
					
				}
				else if(press == 2)
				{
					cost=200;
					
				}
				else if(press == 3)
				{
					cost=325;
					
				}
				
			}
			else if(x == 2)
			{
				size = "medium";
				if(press == 1)
				{
					cost= 175;
					
				}
				else if(press == 2)
				{
					cost= 375;
				}
				else if(press == 3)
				{
					cost= 475;
				}
			}
			else if(x == 3)
			{
				size="large";
				if(press == 1)
				{
				cost= 150;
				}
				else if(press == 2)
				{
				cost= 200;
				}
			   else if(press == 3)
			    {
				cost= 325;
			     }
		}
		
		return cost;
		
	
		}
		
		public static int nonVegBase(int x)
		{
			System.out.println("enter type of crust");
			String crust = typeOfCrust();
			System.out.println("Select the size of the pizza");
			System.out.println("1.Regular");
			System.out.println("2.Medium");
			System.out.println("3.Large");
			System.out.println("Enter your choice");
			int press = sc.nextInt();
			int cost = 0;
			String size = null;
			if(x==1)
			{
				size="regular";
				if(press == 1)
				{
					cost= 190;
				}
				else if(press == 2)
				{
					cost= 325;
				}
				else if(press == 3)
				{
					cost= 425;
				}
				
			}
			else if(x == 2)
			{
				size="medium";
				if(press == 1)
				{
					cost= 210;
				}
				else if(press == 2)
				{
					cost= 370;
				}
				else if(press == 3)
				{
					cost= 500;
				}
			}
			else if(x == 3)
			{
				size="large";
				if(press == 1)
				{
				cost= 220;
				}
				else if(press == 2)
				{
				cost= 380;
				}
			   else if(press == 3)
			    {
				cost= 525;
			     }
		}
		
			return cost;
		
		}
		
	
}