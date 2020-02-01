class Student
{
	String name,address;
	int age;//these are instance variable
	Student(String name,int age)
	{
		this("Agra");//Current class constructor
		//Student("Agra");//CTE
		this.name=name;
		this.age=age;
	}
	Student(String address)
	{
		this.address=address;
	}
	void display()
	{
		System.out.println("Name is"+name);
		System.out.println("Age is"+age);
		System.out.println("Address is"+address);
	}
	public static void main(String... args)
	{
		Student st=new Student("AK",20);
		st.display();
	}
}