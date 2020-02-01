//this demo is for covariant return type
class A
{
}
class B extends A
{
}
class Parent
{
	public A disp()
	{
		System.out.println("Hello");
		return new A();
	}
}
class Child3 extends Parent
{
	public B disp()
	{
		System.out.println("Hi");
		return new B();
	}
	public static void main(String... args)
	{
		Child3 s=new Child3();
		s.disp();
	}
}