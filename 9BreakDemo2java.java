//this demo is for labeled break statement
class BreakDemo2

{
	 static public void main(String[]args)
	{
		outer:
			for(int i=0;i<5;i++)
		{
			while(true)
			{
				System.out.println("Hello");
				break outer;//this is labeled break
			}
		}
		System.out.println("Good-Bye");


	}
}