class parent
{
	int var=10;
}
class Child4 extends Parent
{
	int vae=150;
	public static void main(String... args)
	{
		Parent obj=new Child4();
		System.out.println(obj.var);//10
	}
}