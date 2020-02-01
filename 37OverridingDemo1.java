//this demo is for method overriding
class Parent
{
	public void disp()
	{
		System.out.println("black and white pic");
	}
}//end class
class child3 extends Parent
{
	public void disp() //overriding
	{
		System.out.println("Colored pic");
		super.disp();
	}
	public static void main(String... args)
	{
		Parent obj=new child3();
		obj.disp();
	}
}