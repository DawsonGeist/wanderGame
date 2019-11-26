
public class Fight 
{
	player user;
	player opp;
	int turns = 0;
	int xpGain = 0;
	public Fight()
	{
		
	}
	
	public player battle(player user, int oppHealth, int oppAttack)
	{
		if(oppHealth>70)
		{
			xpGain = 5;
		}
		else if(oppHealth>80)
		{
			xpGain = 7;
		}
		else if(oppHealth > 90)
		{
			xpGain = 10;
		}
		while(user.knockedOut != true)
		{
			oppHealth -= user.attack;
			user.health -= oppAttack;
			turns++;
			if(user.health <= 0)
			{
				user.knockedOut = true;
				System.out.println("You lost in " + turns + " moves.");
				turns = 0;
			}
			else if(oppHealth <= 0)
			{
				System.out.println("You won in " + turns + " moves.");
				turns = 0;
				user.xp += xpGain;
				break;
			}
		}
		return user;
	}
	
	
}
