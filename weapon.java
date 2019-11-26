
public class weapon extends item {

	String name;
	double value;
	int attack;
	public weapon(String name, double value, int attack) {
		super(name, value);
		
		this.attack = attack;
	}


	public double getValue() {
		return this.value;
	}
	
	public int getAttack()
	{
		return this.attack;
	}

}
