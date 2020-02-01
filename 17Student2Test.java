class Student2

{ 
	private String name;
	private int age;   // these are the instance variable
	void accept(String n,int a)  //instance method/perameterized
	{
		name=n;
		age=a;
	}
	void display()  //instance method/non parameterized
	{
		System.out.println("Name is"+name);
		System.out.println("Age is"+age);
	}
}//class end
class Student2Test
{

		public static void main(String[] args) 
	{
		Student2 st1=new Student2();
		st1.accept("DD",32);
		st1.display();
		Student2 st2=new Student2();
		st2.accept("Dev",1);
		st2.display();
	}
}
