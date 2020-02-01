//this demo is for sigle level inheritance
class parent
{
	void disp()
	{
		System.out.println("I provide black AND white pic");
	}
}// end class
class Child extends parent
{
	void honk()
	{
		System.out.println("Beep Beep");
	}
	public static void main(String... args)
	{
		Child obj=new Child();
		obj.disp();
		obj.honk();
	}
}