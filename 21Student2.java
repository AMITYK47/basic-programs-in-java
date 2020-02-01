class Student22

{
	String name;
	int age;  //these are the instance variable
	Student22()  //non param constructor
	{
		name="Shweta singh";
		age=7;
	}
	void display()  //instance method
	{
		System.out.println("Name is"+name);
		System.out.println("Age is"+age);
	}
		public static void main(String... args)

	{
		Student22 st=new Student22();
		st.display();
	}
}
