//this demo is for break keyboard

class BreakDemo1

{
	static public  void main(String[] args) 
	{

			for(int i=1;i<=10;i++)
			{
				if(i==5)
				{
					System.out.println("Break statement is found");
					break;

				}
            System.out.println("The value of i is"+i);

	       }
		   System.out.println("Out of loop");
     }
}
