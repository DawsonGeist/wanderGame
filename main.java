import java.util.*;
import java.lang.Math;
public class main {

	public static void walk(player x, ArrayList world)
	{
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.println("1. Straight 2. Left 3. Right");
			int response = keyboard.nextInt();
			
			if(response < 4)
			{
				int lootNum = (int) (Math.random() * world.size());
				String item = world.get(lootNum).toString();
				item loot = (item) world.get(lootNum);
				
				System.out.println("You found " + item + 
						"\nWould you like to add " + item + " to your inv?(Y/N)");
				
				String responseYN = keyboard.next();
				
				if(responseYN.matches("y"))
				{
					System.out.println("What item do you want to replace?\n" +
					x.toString());
					response = keyboard.nextInt();
					inventory inv = x.getInventory();
					if(response == 1)
					{
						inv.setOne(loot);
					}
					else if(response == 2)
					{
						inv.setTwo(loot);
					}
					else if(response == 3)
					{
						inv.setThree(loot);
					}
					else if(response == 4)
					{
						inv.setFour(loot);
					}
					else if(response == 5)
					{
						inv.setFive(loot);
					}
					x.setInventory(inv);
				}
				else if(responseYN.matches("n"))
				{
					System.out.println("You leave " + loot.toString() + " on the ground.");
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<item> world = new ArrayList();
		
		// constructor (name, value)
		//can blanket wrapper
		trash can = new trash("Can", 0.05);
		world.add(can);
		trash blanket = new trash("Blanket", 2);
		world.add(blanket);
		trash wrapper = new trash("Wrapper", 0);
		world.add(wrapper);
		trash lint = new trash("Lint", 0);
		world.add(lint);
		trash food = new trash("Food", 0.50);
		world.add(food);
		
		//Constructor (name, value, attack)
		weapon knife = new weapon("Butter Knife", 5, 5);
		world.add(knife);
		//constructor(1,2,3,4,5)
		inventory mine = new inventory(lint);
		
		//constructor(name, inventory)
		player me = new player("Dawson", mine);
		player enemyWeak = new player("Bum", 2);
		Fight battler = new Fight();
		
		//fight
		//battler.battle(me, enemyWeak.health, enemyWeak.attack);
		
		//walk
		//walk(me, world);

		//eat
		//me.x.setOne(food);
		//System.out.println(me.toString());
		//me.eat(1);
		//System.out.println(me.toString());
		
		//trade
		//System.out.println(me.toString());
		//System.out.println(me.cash);
		//me.cash += me.sellItem(1);
		//System.out.println(me.toString());
		//System.out.println(me.cash);
		
		//game loop
		int response = -1;
		while(response != 0)
		{
			System.out.println("\nWhat would you like to do "+
								"\n1.wander(find items) " +
								"\n2.fight(gain xp)" + 
								"\n3.eat(restore health)" +
								"\n4.sell items" +
								"\n5.view Status " +
								"\nEnter (1,2,3, or 0 to exit)");
			response = keyboard.nextInt();
			if(response == 1)
			{
				walk(me,world);
			}
			else if(response == 2)
			{
				battler.battle(me, enemyWeak.health, enemyWeak.attack);
			}
			else if(response == 3)
			{
				System.out.println("What would you like to consume? (Can only eat food!)\n");
				System.out.println(me.inv.toString());
				response = keyboard.nextInt();
				me.eat(response);
			}
			else if(response == 4)
			{
				System.out.println("What would you like to sell?\n");
				System.out.println(me.inv.toString());
				response = keyboard.nextInt();
				me.cash += me.sellItem(response);
			}
			else if(response == 5)
			{
				System.out.println("\nHealth: " + me.health + "\nCash: " + me.cash +"\nExperience: " + me.xp +
						"\nInventory: \n" + me.inv.toString());
			}
			else if(response == 0)
			{
				System.out.println("Thank you for playing");
			}
			else
				System.out.println("Invalid Response!");
			
		}
		keyboard.close();
		
	}

}
