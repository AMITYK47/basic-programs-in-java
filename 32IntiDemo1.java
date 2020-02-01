//this demo is for IIB/Anonymous block
class IntiDemo1
{
	IntiDemo1()
	{
		System.out.println("constructor is invoked");
	}
	IntiDemo1(int num)
	{
		System.out.println("param constructor is invoked");
	}
	{
		System.out.println("I am IIB/Anonymous block");
	}
	public static void main(String... args)
	{
		IntiDemo1 obj1=new IntiDemo1();
		IntiDemo1 obj2=new IntiDemo1(10);
	}
}