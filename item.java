

/* 
 * abstract class holds the basic form of an item in the game
 * 
 * items have value and a name
 * 
 * some items provide buffs for a player (weapons/ armor)
 * 
 * some items can only be sold or collected (cans / trash)
 */
public abstract class item 
{
	String name;
	double value;
	public item(String name, double value)
	{
		this.name = name;
		this.value = value;
	}
	
	public abstract double getValue();
	
	public String toString()
	{
		return this.name;
	}
}
