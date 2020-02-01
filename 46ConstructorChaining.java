//this demo is for constructor chaining
class Parent
{
	Parent()
	{
		super();
		System.out.println("I am Param constructor");
	}
}
class Child6 extends Parent
{
	Child6()
{
		System.out.println("I am child class constructor");
}
public static void main(String... args)
	{
	Child6 obj=new Child6();
	}
}