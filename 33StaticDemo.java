// thisdemo is for static variable and static method
class Student
{
	String name;
	int age;  //these are instance variable
	static String cname="infomatics";//class variable
	void disp()
	{
		System.out.println("Name is"+name);
		System.out.println("Age is"+age);
		System.out.println("the center name is"+cname);
		System.out.println();//for a blank line
	}
static public void main(String... args)
	{
	Student st1=new Student();
	st1.name="Bittu";
	st1.age=20;
	Student st2=new Student();
	st2.name="AK";
	st2.age=18;
	st1.disp();
	st2.disp();
	}
}