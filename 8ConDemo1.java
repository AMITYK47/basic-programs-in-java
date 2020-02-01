//this demo is for continue keyword
class ConDemo1 
{
	public static void main(String[] args) 
	{
	  for(int i=1;i<=10;i++)
		{
		  if(i==5)
			{
			  System.out.println("Continue Statement");
			  continue;
			}
        System.out.println("Value of i is:"+i);
		}

     System.out.println("Out of the loop");


	}
}
