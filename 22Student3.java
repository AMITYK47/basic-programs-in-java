//this demo is for constructor that display the default valuse
class Student3

{
	
	int age;
	String name;//instance variable
	void display()
	{
		System.out.println(age+"\t"+name);
	}
	public static void main(String args[])
	{
		Student3 s1=new Student3();
		s1.display();
	}
}