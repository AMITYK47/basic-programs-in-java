//Method cheak with reference variable and call with object in the case of overriding
interface inter
{
}
class Tester2 implement Inter
{
	public void honk()//user defined method
	{
		System.out.println("Beep Beep");
	}
	public string toString()//from the Object class
	{
		return "r u crazy"
}
public static void main(String... args)
	inter obj=new Tester2();//upcasting
//obj.honk();//Compile Time Error
String receive=obj.toString();//Ok
System.out.println(receive);
}
}