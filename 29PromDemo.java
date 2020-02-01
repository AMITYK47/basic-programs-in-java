class PromDemo
{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String... args)
	{
		PromDemo pd=new PromDemo();
		pd.sum(10,20);
		//now second int literal(value) will be promoted to long
		pd.sum(10,20,30);
	}
}
