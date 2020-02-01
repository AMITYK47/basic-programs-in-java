//this demo is for interface implementation
interface inter
{
	public static final int FEES=3000;
	public abstract void disp();
}
class Tester implements Inter
{
	public void disp()
	{
		System.out.println("Now i have the body");
}
public static void main(String... args)
	{
	System.out.println("The Fees is"+FEES);
	Tester obj=new Tester();//1
	obj.disp();
	Inter obj1=new Tester();//2
	obj.disp();
	/*
	inter obj2=new Inter();//3 CTE
	obj2.disp();
	*/
	}
}