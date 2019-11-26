
public class player {
	
	int health = 100;
	int attack = 5;
	int xp = 0;
	int level = 0;
	String name;
	double cash = 0;
	inventory inv;
	boolean knockedOut = false;

	/* 
	 * 	player will have health, and cash. if they are not fighting they will
	 * have the option to collect cans for cash
	 */
	
	//user player constructor
	public player(String name, inventory x)
	{
		this.name = name;
		this.inv = x;
	}
	
	//enemy constructor
	public player(String name, int config)
	{
		this.name = name;
		//weak but strong hit
		if(config == 1)
		{
			this.attack = 7;
			this.health = 80;
		}
		//weak and weak hit
		else if(config == 2)
		{
			this.attack = 3;
			this.health = 80;
		}
		//strong but weak
		else if(config == 3)
		{
			this.attack = 4;
			this.health = 110;
		}
		//default
		else
		{
			this.attack = 5;
		}
	}
	
	public void setInventory(inventory x)
	{
		this.inv = x;
	}
	
	public inventory getInventory()
	{
		return this.inv;
	}
	
	public int getHealth()
	{
		return this.health;
	}
	
	public void setHealth(int x)
	{
		this.health = x;
	}
	
	public void setKnockOut(boolean val)
	{
		this.knockedOut = val;
	}
	
	public boolean getKnockOut()
	{
		return this.knockedOut;
	}
	
	public void eat(int itemNum)
	{
		if(itemNum == 1)
		{
			inv.consume(inv.one);;
		}
		else if(itemNum == 2)
		{
			inv.consume(inv.two);;
		}
		else if(itemNum == 3)
		{
			inv.consume(inv.three);;
		}
		else if(itemNum == 4)
		{
			inv.consume(inv.four);;
		}
		else if(itemNum == 5)
		{
			inv.consume(inv.five);;
		}
		
		if(this.health + 20 > 100)
		{
			this.health = 100;
		}
		else
		{
			this.health += 20;
		}
		this.knockedOut = false;
	}
	
	public double sellItem(int itemNum)
	{
		if(itemNum == 1)
		{
			return inv.trade(inv.one);
		}
		else if(itemNum == 2)
		{
			return inv.trade(inv.two);
		}
		else if(itemNum == 3)
		{
			return inv.trade(inv.three);
		}
		else if(itemNum == 4)
		{
			return inv.trade(inv.four);
		}
		else if(itemNum == 5)
		{
			return inv.trade(inv.five);
		}
		else
			return 0;
		
	}
	
	public String toString()
	{
		return this.name + "\n" + this.inv.toString();
	}

}
