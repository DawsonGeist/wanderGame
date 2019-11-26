
public class inventory {
	
	item one = null;
	item two = null;
	item three = null;
	item four = null;
	item five = null;
	item empty;

	public inventory(item o, item t, item three, item four, item five, item empty)
	{
		this.one = o;
		this.two = t;
		this.three = three;
		this.four = four;
		this.five = five;
		this.empty = empty;
	}
	
	public inventory(item empty)
	{
		this.one = empty;
		this.two = empty;
		this.three = empty;
		this.four = empty;
		this.five = empty;
		this.empty = empty;
	}
	
	public item getOne()
	{
		return one;
	}
	public void setOne(item x)
	{
		this.one = x;
	}
	public item getTwo()
	{
		return two;
	}
	public void setTwo(item x)
	{
		this.two = x;
	}
	public item getThree()
	{
		return three;
	}
	public void setThree(item x)
	{
		this.three = x;
	}
	public item getFour()
	{
		return four;
	}
	public void setFour(item x)
	{
		this.four = x;
	}
	public item getFive()
	{
		return five;
	}
	public void setFive(item x)
	{
		this.five = x;
	}
	
	public void consume(item x)
	{
		if(x.toString() == getOne().toString() && x.toString() == "Food")
		{
			setOne(empty);
		}
		else if(x.toString() == getTwo().toString() && x.toString() == "Food")
		{
			setTwo(empty);
		}
		else if(x.toString() == getThree().toString() && x.toString() == "Food")
		{
			setThree(empty);
		}
		else if(x.toString() == getFour().toString() && x.toString() == "Food")
		{
			setFour(empty);
		}
		else if(x.toString() == getFive().toString() && x.toString() == "Food")
		{
			setFive(empty);
		}
		else
		{
			System.out.println("Can't Consume item.");
		}
	}
	
	public double trade(item x)
	{
		if(x.toString() == getOne().toString())
		{
			setOne(empty);
			return x.value;
		}
		else if(x.toString() == getTwo().toString())
		{
			setTwo(empty);
			return x.value;
		}
		else if(x.toString() == getThree().toString())
		{
			setThree(empty);
			return x.value;
		}
		else if(x.toString() == getFour().toString())
		{
			setFour(empty);
			return x.value;
		}
		else if(x.toString() == getFive().toString())
		{
			setFive(empty);
			return x.value;
		}
		else
			return 0;
		
	}

	public String toString()
	{
		String returner = "1: " + one.toString() + "\n" 
						+ "2: " + two.toString() + "\n"
						+ "3: " + three.toString() + "\n"
						+ "4: " + four.toString() + "\n"
						+ "5: " + five.toString() + "\n";
		return returner;
	}
	
}
