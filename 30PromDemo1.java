class PromDemo1
{
	void sum(int a,long b)
	{
		System.out.println(a+b);
	}
	void sum(long a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String... args)
	{
		PromDemo1 pd=new PromDemo1();
		pd.sum(10,20L);//L is use for the call only long value in this prog...
		//pd.sum(10,20);
	}
}

