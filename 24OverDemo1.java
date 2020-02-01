//this demo is for method overloading(number of the parameter)
class OverDemo1
{
	void sum(int num1,int num2)
	{
		int result;
		result=num1+num2;
		System.out.println("the sum of two number is\t"+result);
	}
	void sum(int num1,int num2,int num3)
	{
		int result;
		result=num1+num2+num3;
		System.out.println("the sum of three number is\t"+result);
	}
	public static void main(String... args)
	{
		OverDemo1 obj=new OverDemo1();
		obj.sum(10,20);
		obj.sum(10,20,30);
	}
}
