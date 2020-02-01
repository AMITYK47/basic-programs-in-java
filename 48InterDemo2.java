interface Printable
{
	void print();
}
interface Showable
{
	void print();
}
class InterDemo2 implements Printable,Showable
{
	public void print()
	{
		System.out.println("Hello");
}
public static void main(String... args)
	{
	InterDemo2 obj=new interDemo2();
	obj.print();
	}
}