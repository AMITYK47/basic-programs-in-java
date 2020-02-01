//this demo is for parameterized constructor
class Student4

{
	String name;
	int age;  //these are the instance variable
	Student4(String n,int a)  //param constructor
	{
		name=n;
		age=a;
	}
	void display()  //instance method

	{
		System.out.println("Name is"+name);
		System.out.println("Age is"+age);
	}

	public static void main(String... args)
		
	{
		Student4 st1=new Student4("DD",32);
		st1.display();
		Student4 st2=new Student4("Shweta",6);
		st2.display();
	}
}
