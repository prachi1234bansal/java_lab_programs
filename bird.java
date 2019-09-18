class Programming
{
	void message()
	{
		System.out.println("I love programming languages");
	}
	void message1(String mssg)
	{
		System.out.println("I love Java");
	}
	public static void main(String args[])
	{
		Programming p=new Programming();
		Programming n=new Programming();
		p.message();
		n.message1("Java");
	}
}