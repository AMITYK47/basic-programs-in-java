//this demo is for method hiding and method overriding
class Parent
{
	public static void classMethod()
	{
		System.out.println("In Parent");
	}
	public void instanceMethod()
	{
		System.out.println("In Parent");
	}
}
class Child5 extends Parent
{
	public static void classMerhod()//method hiding
	{
		System.out.println("In Child");
	}
	public void instanceMethod()//Method overriding
	{
		System.out.println("In Child");
	}
	public static void main(String... args)
	{
		Parent p=new Child5();
		p.instanceMethod();//call with object
		p.classMethod();//call with reference
	}
}