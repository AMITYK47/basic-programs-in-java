//this demo is for abstract class amd abstract method
abstract class Animal
{
	public void disp()
	{
		System.out.println("I provide color");
	}
	espublic abstract void foodhabbit();
}//end class
class Tester extend Animal
{
	public void foodhabbit()//overriding
	{
		System.out.println("Animal can eat meat and plant");
}
public static void main(String... args)
	{
	//Animal obj=new Animal();//CTE
	Tester obj=new Tester();
	obj.disp();
	obj.foodhabbit();
	}
}