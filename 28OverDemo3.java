class OverDemo3
{
	static public void main(int a)
	{
		System.out.println(a);
	}
	public static void main(String... args)
	{
		System.out.println("I am the first method");
		main(10);
	}
}